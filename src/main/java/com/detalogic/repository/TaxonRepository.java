package com.detalogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.detalogic.model.Taxon;

public interface TaxonRepository extends JpaRepository<Taxon, Long>, JpaSpecificationExecutor<Taxon>{

}
