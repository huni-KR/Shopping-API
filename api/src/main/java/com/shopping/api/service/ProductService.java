package com.shopping.api.service;

import com.shopping.api.dto.ProductDto;

public interface ProductService {
	public boolean createProduct(ProductDto product);

	public boolean deleteProduct(int no);
}
