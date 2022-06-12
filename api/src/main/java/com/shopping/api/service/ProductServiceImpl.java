package com.shopping.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.ProductPromotionDto;
import com.shopping.api.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public boolean createProduct(ProductDto product) {
		return productMapper.createProduct(product) == 1;
	}

	@Override
	public List<ProductPromotionDto> readProduct(int no) {
		return productMapper.readProduct(no);
	}

	@Override
	public boolean deleteProduct(int no) {
		return productMapper.deleteProduct(no) == 1;
	}

}
