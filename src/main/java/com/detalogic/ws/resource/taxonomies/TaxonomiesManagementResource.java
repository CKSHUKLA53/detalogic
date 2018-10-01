package com.detalogic.ws.resource.taxonomies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.detalogic.common.rsql.CustomRsqlVisitor;
import com.detalogic.model.Product;
import com.detalogic.repository.ProductRepository;

import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.Node;

@Controller
@RequestMapping(value = "/api/taxonomies")
public class TaxonomiesManagementResource {

	@Autowired ProductRepository dao;
	   @RequestMapping(method = RequestMethod.GET, value = "/")
	    @ResponseBody
	    public List<Product> findAllByRsql(@RequestParam(value = "search") String search) {
	       
	    }

}
