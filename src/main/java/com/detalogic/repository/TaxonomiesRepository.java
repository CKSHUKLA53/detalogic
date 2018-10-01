package com.detalogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.detalogic.model.Taxonomies;

public interface TaxonomiesRepository extends JpaRepository<Taxonomies, Long>, JpaSpecificationExecutor<Taxonomies>{

}
