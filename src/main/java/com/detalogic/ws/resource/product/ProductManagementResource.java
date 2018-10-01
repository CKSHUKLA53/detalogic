package com.detalogic.ws.resource.product;

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
@RequestMapping(value = "/api/products")
public class ProductManagementResource {
	
	@Autowired ProductRepository dao;
	   @RequestMapping(method = RequestMethod.GET, value = "/")
	    @ResponseBody
	    public List<Product> findAllByRsql(@RequestParam(value = "search") String search) {
	        Node rootNode = new RSQLParser().parse(search);
	        Specification<Product> spec = rootNode.accept(new CustomRsqlVisitor<Product>());
	        return dao.findAll(spec);
	    }


}
