package com.technoelevate.technoelevate_ess.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.technoelevate_ess.dto.Technology;
import com.technoelevate.technoelevate_ess.exception.CustomException;
import com.technoelevate.technoelevate_ess.response.Message;
import com.technoelevate.technoelevate_ess.response.ResponseMessage;
import com.technoelevate.technoelevate_ess.service.TechnologyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Validated
@RequestMapping("/api/v1/technology")
public class TechnologyController {
	@Autowired
	private TechnologyService technologyService;

	@PostMapping("/add")
	public ResponseEntity<ResponseMessage> saveTechnology(@RequestBody List<@Valid Technology> technologies)  {
		 List<Technology> saveTechnology = technologyService.saveTechnology(technologies);
		if (!saveTechnology.isEmpty()) {
			ResponseMessage responseMessage = new ResponseMessage(HttpStatus.OK.value(), new Date(), false,
					Message.DATA_ADDED, saveTechnology);
			log.info(Message.DATA_ADDED);
			return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
		}
		log.error(Message.SOMETHING_WENT_WRONG);
		throw new CustomException(Message.SOMETHING_WENT_WRONG);
	}

	@GetMapping("/search/{personId}")
	public ResponseEntity<ResponseMessage> searchTechnology(@PathVariable("personId") int personId) {
		List<Technology> searchTechnology = technologyService.searchTechnology(personId);
		if (!searchTechnology.isEmpty()) {
			ResponseMessage responseMessage = new ResponseMessage(HttpStatus.OK.value(), new Date(), false,
					Message.SEARCH_TECHNOLOGY, searchTechnology);
			log.info(Message.SEARCH_TECHNOLOGY);
			return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
		}
		log.error(Message.SOMETHING_WENT_WRONG);
		throw new CustomException(Message.SOMETHING_WENT_WRONG);
	}
}
