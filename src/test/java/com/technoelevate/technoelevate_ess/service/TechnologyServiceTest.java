/**
 * 
 */
package com.technoelevate.technoelevate_ess.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.technoelevate.technoelevate_ess.repository.SkillRepository;
import com.technoelevate.technoelevate_ess.repository.TechnologyRepository;

/**
 * @author Sahid
 *
 */
@SpringBootTest
public class TechnologyServiceTest {
	
	@Mock
	private SkillRepository skillRepository;
	@Mock
	private TechnologyRepository technologyRepository;
	
	@InjectMocks
	private TechnologyServiceImpl serviceImpl;
	

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.service.TechnologyServiceImpl#saveTechnology(com.technoelevate.technoelevate_ess.dto.TechnologyDto)}.
	 */
//	@Test
//	void testSaveTechnology() {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		TechnologyDto technologyDto = new TechnologyDto(100,technologies);
//		Mockito.when(personRepository.save(Mockito.any())).thenReturn(technology.getPerson());
//		Mockito.when(skillRepository.save(Mockito.any())).thenReturn(skill);
//		Mockito.when(technologyRepository.save(Mockito.any())).thenReturn(technology);
//		TechnologyDto saveTechnology = serviceImpl.saveTechnology(technologyDto);
//		assertEquals(technologyDto.getPersonId(), saveTechnology.getPersonId());
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.service.TechnologyServiceImpl#deleteTechnology(int)}.
	 */
//	@Test
//	void testDeleteTechnology() {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		Person person = new Person();
//		person.setPersonId(100);
//		person.setTechnologies(technologies);
//		Mockito.when(personRepository.findByPersonId(Mockito.anyInt())).thenReturn(person);
//		personRepository.delete(Mockito.any());
//		skillRepository.delete(Mockito.any());
//		technologyRepository.delete(Mockito.any());
//		List<Technology> deleteTechnology = serviceImpl.deleteTechnology(person.getPersonId());
//		assertEquals(deleteTechnology.get(0).getTechnologyId(), technology.getTechnologyId());
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.service.TechnologyServiceImpl#searchTechnology(int)}.
	 */
//	@Test
//	void testSearchTechnology() {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		Person person = new Person();
//		person.setPersonId(100);
//		person.setTechnologies(technologies);
//		Mockito.when(personRepository.findByPersonId(Mockito.anyInt())).thenReturn(person);
//		List<Technology> searchTechnology = serviceImpl.searchTechnology(person.getPersonId());
//		assertEquals(searchTechnology.get(0).getTechnologyId(), technology.getTechnologyId());
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.service.TechnologyServiceImpl#editTechnology(com.technoelevate.technoelevate_ess.dto.TechnologyDto)}.
	 */
//	@Test
//	void testEditTechnology() {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		Person person = new Person();
//		person.setPersonId(100);
//		person.setTechnologies(technologies);
//		TechnologyDto technologyDto = new TechnologyDto(100,technologies);
//		Mockito.when(personRepository.findByPersonId(Mockito.anyInt())).thenReturn(person);
//		Mockito.when(personRepository.save(Mockito.any())).thenReturn(technology.getPerson());
//		Mockito.when(skillRepository.save(Mockito.any())).thenReturn(skill);
//		Mockito.when(technologyRepository.save(Mockito.any())).thenReturn(technology);
//		TechnologyDto editTechnology = serviceImpl.editTechnology(technologyDto);
//		assertEquals(editTechnology.getPersonId(), technologyDto.getPersonId());
//	}

}
