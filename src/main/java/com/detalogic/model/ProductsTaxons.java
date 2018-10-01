package com.detalogic.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Generated 17 Jul, 2018 4:21:04 PM by Hibernate Tools 4.3.5.Final



/**
 * DtProductsTaxons generated by hbm2java
 */
@Entity
@Table(name="product_taxon_mapping")
public class ProductsTaxons  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 6586681057838943504L;

	@Id
	@GeneratedValue
	private Long id;
     
     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "product_id")
     private Product dtProducts;
     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "taxon_id")
     private Taxon dtTaxons;
     private Integer position;

    public ProductsTaxons() {
    }


   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Product getDtProducts() {
        return this.dtProducts;
    }
    
    public void setDtProducts(Product dtProducts) {
        this.dtProducts = dtProducts;
    }
    public Taxon getDtTaxons() {
        return this.dtTaxons;
    }
    
    public void setDtTaxons(Taxon dtTaxons) {
        this.dtTaxons = dtTaxons;
    }
    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }




}


