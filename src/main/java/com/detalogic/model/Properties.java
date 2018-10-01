package com.detalogic.model;
// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DtProperties generated by hbm2java
 */

@Entity
@Table(name="properties")
public class Properties  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 382346092427224406L;
	
	@Id
	@GeneratedValue
	private Long id;
     private String name;
     private String presentation;
     private Date createdAt;
     private Date updatedAt;

    public Properties() {
    }

	
    public Properties(String presentation) {
        this.presentation = presentation;
    }
    public Properties(String name, String presentation, Date createdAt, Date updatedAt) {
       this.name = name;
       this.presentation = presentation;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
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


