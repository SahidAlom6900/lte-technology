package com.technoelevate.technoelevate_ess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.technoelevate_ess.dto.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
	Skill findBySkillId(int skillId);
}
