package com.water.Mulbburi.product.service;
​
import java.util.HashMap;
import java.util.List;
import java.util.Map;
​
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
​
import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.file.FileDTO;
import com.water.Mulbburi.product.dao.ProductMapper;
import com.water.Mulbburi.product.dto.ProductDTO;
​
import lombok.extern.slf4j.Slf4j;
​
@Slf4j
@Service
@Transactional
public class ProductService {
​
	private final ProductMapper productMapper;
​
	public ProductService(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}
	
	public void registProduct(ProductDTO product) {
	  
		productMapper.prodRegist(product);
		  
		for (FileDTO attachment : product.getAttachmentList()) {
		productMapper.insertFile(attachment); 
		} 
	}
​
	public Map<String, Object> checkProducList(int page) {
		
		int totalCount = productMapper.checkProdTotalCount();
		log.info("[ProductService] totalCount : {}", totalCount);
		
		int limit = 4; 
		int buttonAmount = 3;
		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
		log.info("[ProductService] selectCriteria : {}", selectCriteria);
		
		List<ProductDTO> productList = productMapper.checkAllproduct(selectCriteria);
		log.info("[ProductService] productList : {}", productList);
		
		Map<String, Object> StoreAndPaging = new HashMap<>();
		StoreAndPaging.put("paging", selectCriteria); 
		StoreAndPaging.put("productList", productList);
		
		return StoreAndPaging;
	}
​
}
