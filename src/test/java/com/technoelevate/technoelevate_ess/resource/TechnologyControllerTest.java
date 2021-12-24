/**
 * 
 */
package com.technoelevate.technoelevate_ess.resource;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.technoelevate.technoelevate_ess.controller.TechnologyController;
import com.technoelevate.technoelevate_ess.service.TechnologyService;

/**
 * @author Sahid
 *
 */
@SpringBootTest
public class TechnologyControllerTest {
	
	@Mock
	private TechnologyService technologyService;
	
	@InjectMocks
	private TechnologyController technologyResource;
	
	private MockMvc mockMvc;
	private ObjectMapper mapper;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(technologyResource).build();
		this.mapper = new ObjectMapper();
	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.resource.TechnologyResource#saveTechnology(com.technoelevate.technoelevate_ess.dto.TechnologyDto)}.
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
//	@SuppressWarnings("unchecked")
//	@Test
//	void testSaveTechnology() throws UnsupportedEncodingException, Exception {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		TechnologyDto technologyDto = new TechnologyDto(100,technologies);
//		Mockito.when(technologyService.saveTechnology(Mockito.any())).thenReturn(technologyDto);
//		String jsonObject = mapper.writeValueAsString(technologyDto);
//		String result = mockMvc
//				.perform(post("/api/v1/technology/add").contentType(MediaType.APPLICATION_JSON_VALUE).content(jsonObject))
//				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
//		ResponseMessage responseMessage = mapper.readValue(result, ResponseMessage.class);
//		Map<String, String> map = (Map<String, String>) responseMessage.getData();
//		for (Map.Entry<String, String> m : map.entrySet()) {
//			assertEquals(technologyDto.getPersonId(), m.getValue());
//			break;
//		}
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.resource.TechnologyResource#deleteTechnology(int)}.
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
//	@SuppressWarnings("unchecked")
//	@Test
//	void testDeleteTechnology() throws UnsupportedEncodingException, Exception {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		Mockito.when(technologyService.deleteTechnology(Mockito.anyInt())).thenReturn(technologies);
//		String result = mockMvc
//				.perform(delete("/api/v1/technology/remove/"+1))
//				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
//		ResponseMessage responseMessage = mapper.readValue(result, ResponseMessage.class);
//		List<Map<String, String>> map = (List<Map<String, String>>) responseMessage.getData();
//		for (Map.Entry<String, String> m : map.get(0).entrySet()) {
//			assertEquals(technologies.get(0).getTechnologyId(), m.getValue());
//			break;
//		}
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.resource.TechnologyResource#searchTechnology(int)}.
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
//	@SuppressWarnings("unchecked")
//	@Test
//	void testSearchTechnology() throws UnsupportedEncodingException, Exception {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		Mockito.when(technologyService.searchTechnology(Mockito.anyInt())).thenReturn(technologies);
//		String result = mockMvc
//				.perform(get("/api/v1/technology/search/"+1))
//				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
//		ResponseMessage responseMessage = mapper.readValue(result, ResponseMessage.class);
//		List<Map<String, String>> map = (List<Map<String, String>>) responseMessage.getData();
//		for (Map.Entry<String, String> m : map.get(0).entrySet()) {
//			assertEquals(technologies.get(0).getTechnologyId(), m.getValue());
//			break;
//		}
//		
//	}

	/**
	 * Test method for {@link com.technoelevate.technoelevate_ess.resource.TechnologyResource#editTechnology(com.technoelevate.technoelevate_ess.dto.TechnologyDto)}.
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
//	@SuppressWarnings("unchecked")
//	@Test
//	void testEditTechnology() throws UnsupportedEncodingException, Exception {
//		List<Skill> skills=new ArrayList<>();
//		List<Technology> technologies=new ArrayList<>();
//		Skill skill = new Skill(100, "JAVA", 4.7, technologies);
//		skills.add(skill);
//		Technology technology = new Technology(1,"Backend",skills);
//		technologies.add(technology);
//		skill.setTechnologies(technologies);
//		TechnologyDto technologyDto = new TechnologyDto(100,technologies);
//		Mockito.when(technologyService.editTechnology(Mockito.any())).thenReturn(technologyDto);
//		String jsonObject = mapper.writeValueAsString(technologyDto);
//		String result = mockMvc
//				.perform(put("/api/v1/technology/edit").contentType(MediaType.APPLICATION_JSON_VALUE).content(jsonObject))
//				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
//		ResponseMessage responseMessage = mapper.readValue(result, ResponseMessage.class);
//		Map<String, String> map = (Map<String, String>) responseMessage.getData();
//		for (Map.Entry<String, String> m : map.entrySet()) {
//			assertEquals(technologyDto.getPersonId(), m.getValue());
//			break;
//		}
//		
//		
//	}

}
