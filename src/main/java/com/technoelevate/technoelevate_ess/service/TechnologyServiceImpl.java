package com.technoelevate.technoelevate_ess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.technoelevate_ess.dto.Person;
import com.technoelevate.technoelevate_ess.dto.Skill;
import com.technoelevate.technoelevate_ess.dto.Technology;
import com.technoelevate.technoelevate_ess.exception.CustomException;
import com.technoelevate.technoelevate_ess.repository.PersonRepository;
import com.technoelevate.technoelevate_ess.repository.SkillRepository;
import com.technoelevate.technoelevate_ess.repository.TechnologyRepository;
import com.technoelevate.technoelevate_ess.response.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TechnologyServiceImpl implements TechnologyService {

	@Autowired
	private SkillRepository skillRepository;
	@Autowired
	private TechnologyRepository technologyRepository;
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Technology> saveTechnology(List<Technology> technologies) {
		Person person = new Person();
		person.setTechnologies(technologies);
		Person person2 = technologies.get(0).getPerson();
		if (person2 != null) {
			person.setPersonId(person2.getPersonId());
			Person person3 = personRepository.findByPersonId(person2.getPersonId());
			List<Technology> technologies2 = person3.getTechnologies();
			for (Technology technology : technologies2) {
				int flag = 0;
				int technologyIdRepo = technology.getTechnologyId();
				for (Technology technology2 : technologies) {
					int technologyId = technology2.getTechnologyId();
					if (technologyId == technologyIdRepo) {
						flag = 1;
						List<Skill> skills = technology2.getSkills();
						List<Skill> skillsRepo = technology.getSkills();
						for (Skill skillrepo : skillsRepo) {
							int flagSkill = 0;
							for ( Skill skill : skills) {
								if (skill.getSkillId() == skillrepo.getSkillId()) {
									flagSkill = 1;
									break;
								}
							}
							if (flagSkill == 0) {
								skillRepository.delete(skillrepo);
							}
						}
						break;
					}
				}
				if (flag == 0) {
					List<Skill> skills = technology.getSkills();
					for (Skill skill : skills) {
						skillRepository.delete(skill);
					}
					technologyRepository.delete(technology);
				}
			}
		}
		personRepository.save(person);
		for (Technology technology : technologies) {
			technology.setPerson(person);
			technologyRepository.save(technology);
			List<Skill> skills = technology.getSkills();
			for (Skill skill : skills) {
				skill.setTechnology(technology);
				skillRepository.save(skill);
			}
		}
		return technologies;
	}


	@Override
	public List<Technology> searchTechnology(int personId) {
		Person person = personRepository.findByPersonId(personId);
		if (person!=null) {
			log.info(Message.SEARCH_TECHNOLOGY);
			return person.getTechnologies();
		}
		log.error(Message.TECHNOLOGY_NOT_FOUND);
		throw new CustomException(Message.TECHNOLOGY_NOT_FOUND);
	}
}
