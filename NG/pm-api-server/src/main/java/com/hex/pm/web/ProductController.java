package com.hex.pm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.pm.model.Product;
import com.hex.pm.repository.ProductRepostory;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductRepostory productRepostory;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Product> post(@RequestBody Product product) {
		Product p = productRepostory.save(product);
		return new ResponseEntity<Product>(p, null, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Product> put(@PathVariable int id, @RequestBody Product product) {
		product.setId(id);
		Product p = productRepostory.save(product);
		return new ResponseEntity<Product>(p, null, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getAll() {
		List<Product> products=productRepostory.findAll();
		return new ResponseEntity<List<Product>>(products, null, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Product> getOne(@PathVariable int id) {
		Product product=productRepostory.findOne(id);
		return new ResponseEntity<Product>(product, null, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Integer> deleteOne(@PathVariable int id) {
		productRepostory.delete(id);
		return new ResponseEntity<Integer>(id, null, HttpStatus.OK);
	}
	
	

}
