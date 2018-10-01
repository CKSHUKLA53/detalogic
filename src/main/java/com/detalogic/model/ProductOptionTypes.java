package com.detalogic.model;
// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_option_type_mapping")
public class ProductOptionTypes  implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5148805549802547829L;
	@Id
	@GeneratedValue
	private Long id;
	private Integer position;
	@ManyToOne(cascade = CascadeType.ALL)

	private Product product;
	@ManyToOne(cascade = CascadeType.ALL)
	private OptionTypes optionTtype;
	private Date createdAt;
	private Date updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public OptionTypes getOptionTtype() {
		return optionTtype;
	}
	public void setOptionTtype(OptionTypes optionTtype) {
		this.optionTtype = optionTtype;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




}


