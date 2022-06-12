package com.shopping.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.ProductPromotionDto;

@Mapper
public interface ProductMapper {
	public int createProduct(ProductDto product);
	
	public List<ProductPromotionDto> readProduct(int no);
	
	public int deleteProduct(int no);
}
