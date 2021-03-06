package com.detalogic.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final



/**
 * DtPropertyProtottypes generated by hbm2java
 */
@Entity
@Table(name="property_prototype_mapping")
public class PropertyPrototypes  implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2960423232263833514L;
	
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne(cascade=CascadeType.ALL)
	private Properties property;
	@ManyToOne(cascade=CascadeType.ALL)
	private Prototypes prototype;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	public Prototypes getPrototype() {
		return prototype;
	}
	public void setPrototype(Prototypes prototype) {
		this.prototype = prototype;
	}

	
}


