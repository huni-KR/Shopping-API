package com.shopping.api.service;

import java.util.List;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.ProductPromotionDto;

public interface ProductService {
	public boolean createProduct(ProductDto product);
	
	public List<ProductPromotionDto> readProduct(int no);
	
	public boolean deleteProduct(int no);
}
