/**
 * 
 */
package com.technoelevate.technoelevate_ess.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sahid
 *
 */
@SuppressWarnings("serial")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person_details")
@JsonIgnoreProperties({"technologies"})
public class Person implements Serializable {
	@Id
	@SequenceGenerator(name = "person_sequence_generator", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "person_sequence_generator")
	@Column(name = "person_id")
	private int personId;
	/*
	*
	*/
	@OneToMany(mappedBy = "person",fetch = FetchType.EAGER)
	private List< @Valid Technology> technologies;

}
