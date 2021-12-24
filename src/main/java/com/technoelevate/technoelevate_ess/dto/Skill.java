package com.technoelevate.technoelevate_ess.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Validated
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "technology" })
public class Skill implements Serializable {
	@Id
	@SequenceGenerator(name = "skill_sequence_generator", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "skill_sequence_generator")
	@Column(name = "skill_id")
	private int skillId;
	@NotBlank(message = "Skill Can Not Be Blank")
	@NotNull(message = "Skill Can Not Be null")
	private String skill;
	@Range(min = 1, max = 5, message = "rating must be 1 to 5")
	private double rating;
	@Valid
	@ManyToOne(fetch = FetchType.EAGER)
	private Technology technology;

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skill=" + skill + ", rating=" + rating + "]";
	}
}
