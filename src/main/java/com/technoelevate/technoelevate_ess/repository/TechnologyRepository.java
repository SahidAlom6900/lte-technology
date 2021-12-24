package com.technoelevate.technoelevate_ess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.technoelevate_ess.dto.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer>{
	Technology findByTechnologyId(int technologyId);
}
