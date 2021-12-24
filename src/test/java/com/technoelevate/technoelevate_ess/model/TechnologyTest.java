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
import com.technoelevate.technoelevate_ess.dto.Technology;

/**
 * @author Sahid
 *
 */
public class TechnologyTest {

	private ObjectMapper mapper;

	@BeforeEach
	public void setup() {
		this.mapper = new ObjectMapper();
	}

	private String jsonObject = "{\"technologyId\":1,\"technologyName\":\"Backend\",\"skills\":[{\"skillId\":100,\"skill\":\"JAVA\",\"rating\":4.7}]}";
	@Test
	void testTechnologySerialization() throws JsonProcessingException {
		/*
		 * List<Skill> skills = new ArrayList<>(); Skill skill = new Skill(100, "JAVA",
		 * 4.7,null); skills.add(skill); Technology technology = new Technology(1,
		 * "Backend", skills);
		 */
		Technology technology = mapper.readValue(jsonObject, Technology.class);
		String jsonObject = mapper.writeValueAsString(technology);
		assertEquals(this.jsonObject, jsonObject);
	}

	@Test
	void testTechnologyDeserialization() throws JsonMappingException, JsonProcessingException {
		Technology technology = mapper.readValue(jsonObject, Technology.class);
		int expected=1;
		assertEquals(expected, technology.getTechnologyId());
	}

}
