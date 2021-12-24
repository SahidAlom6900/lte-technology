/**
 * 
 */
package com.technoelevate.technoelevate_ess.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.technoelevate.technoelevate_ess.dto.Skill;

/**
 * @author Sahid
 *
 */
public class SkillTest {

	private ObjectMapper mapper;

	@BeforeEach
	public void setup() {
		this.mapper = new ObjectMapper();
	}

	private String jsonObject = "{\"skillId\":100,\"skill\":\"JAVA\",\"rating\":4.7}";

	@Test
	void testSkillSerialization() throws JsonProcessingException {
		/*
		 * List<Skill> skills=new ArrayList<>(); List<Technology> technologies=new
		 * ArrayList<>(); Skill skill = new Skill(100, "JAVA", 4.7, technologies);
		 * skills.add(skill); Technology technology = new
		 * Technology(1,"Backend",skills); technologies.add(technology);
		 * skill.setTechnologies(technologies);
		 */
		Skill skill = mapper.readValue(jsonObject, Skill.class);
		String jsonObject = mapper.writeValueAsString(skill);
		assertEquals(this.jsonObject, jsonObject);
	}

	@Test
	void testSkillDeserialization() throws JsonMappingException, JsonProcessingException {
		Skill skill = mapper.readValue(jsonObject, Skill.class);
		int expected = 100;
		assertEquals(expected, skill.getSkillId());
	}

}
