package com.shopping.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shopping.api.dto.ProductDto;

@Mapper
public interface ProductMapper {
	public int createProduct(ProductDto product);

	public int deleteProduct(int no);
}
