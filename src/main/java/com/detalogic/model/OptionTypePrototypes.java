package com.detalogic.model;
// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="option_type_prototypes_mapping")
public class OptionTypePrototypes  implements java.io.Serializable {


	private static final long serialVersionUID = 6421199776079769715L;
	
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Prototypes protoType;
	@ManyToOne(cascade = CascadeType.ALL)
	private OptionTypes optionType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Prototypes getProtoType() {
		return protoType;
	}
	public void setProtoType(Prototypes protoType) {
		this.protoType = protoType;
	}
	public OptionTypes getOptionType() {
		return optionType;
	}
	public void setOptionType(OptionTypes optionType) {
		this.optionType = optionType;
	}
	

	


}


