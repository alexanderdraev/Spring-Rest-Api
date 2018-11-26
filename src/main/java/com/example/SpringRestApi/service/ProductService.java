package com.example.SpringRestApi.service;

import com.example.SpringRestApi.model.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    public void sendProduct(ProductDTO productDTO) {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.postForObject(
                "http://localhost:8085/products",
                productDTO,
                ProductDTO.class);
    }
}


