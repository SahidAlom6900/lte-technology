package com.technoelevate.technoelevate_ess.service;

import java.util.List;

import com.technoelevate.technoelevate_ess.dto.Technology;

public interface TechnologyService {
	List<Technology> saveTechnology(List<Technology> technologies);

//	List<Technology> deleteTechnology(int personId);

	List<Technology> searchTechnology(int personId);
	
//	TechnologyDto editTechnology(TechnologyDto technology);
}
