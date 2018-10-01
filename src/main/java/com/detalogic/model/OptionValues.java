package com.detalogic.model;
// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DtOptionValues generated by hbm2java
 */
@Entity
@Table(name="option_values")
public class OptionValues  implements java.io.Serializable {


	/**
	 * 
	 * SMALL,Medium,Large --->Size --> Option Type (1)
	 * 
	 * 
	 */
	private static final long serialVersionUID = 5648820759594814238L;
	@Id
	@GeneratedValue
	private Long id;
	private Integer position;
	private String name;
	private String presentation;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="option_type_id")
	private OptionTypes optionType;
	private Date createdAt;
	private Date updatedAt;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPresentation() {
		return this.presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public OptionTypes getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionTypes optionType) {
		this.optionType = optionType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




}


