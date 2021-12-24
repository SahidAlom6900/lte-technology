package com.technoelevate.technoelevate_ess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.technoelevate_ess.dto.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	Person findByPersonId(int personId);
}
