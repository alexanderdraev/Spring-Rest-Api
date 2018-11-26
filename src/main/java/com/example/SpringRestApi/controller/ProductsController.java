package com.example.SpringRestApi.controller;

import com.example.SpringRestApi.model.ProductDTO;
import com.example.SpringRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {

    @Autowired
    ProductService productService;

    @RequestMapping(
            value = "/product",
            method = RequestMethod.POST)
    public ResponseEntity product(@RequestBody ProductDTO productDTO)
            throws Exception {

        productService.sendProduct(productDTO);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);

    }

}



