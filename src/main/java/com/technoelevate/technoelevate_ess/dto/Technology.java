package com.technoelevate.technoelevate_ess.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
//@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "technology")
public class Technology implements Serializable {
	@Id
	@SequenceGenerator(name = "technology_sequence_generator", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "technology_sequence_generator")
	@Column(name = "technology_id")
	private int technologyId;
	@NotBlank(message = "Technology Name Can Not Be Blank")
	@NotNull(message = "Technology Name Can Not Be null")
	private String technologyName;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "technology")
	private List< @Valid Skill> skills;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id")
	private Person person;

	public Technology(int technologyId,
			@NotBlank(message = "Technology Name Can Not Be Blank") @NotNull(message = "Technology Name Can Not Be null") String technologyName,
			List< @Valid Skill> skills) {
		this.technologyId = technologyId;
		this.technologyName = technologyName;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Technology [technologyId=" + technologyId + ", technologyName=" + technologyName + "]";
	}

}
