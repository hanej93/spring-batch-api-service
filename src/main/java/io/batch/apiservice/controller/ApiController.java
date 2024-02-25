package io.batch.apiservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.batch.apiservice.domain.ApiInfo;
import io.batch.apiservice.domain.ProductVO;

@RestController
public class ApiController {

	// 각각의 서버에 호출 되는 것으로 가정

	@PostMapping("/api/product/1")
	public String product1(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream()
			.map(item -> item.getProductVO())
			.toList();
		System.out.println("productVOList = " + productVOList);
		return "product1 was successfully processed";
	}

	@PostMapping("/api/product/2")
	public String product2(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream()
			.map(item -> item.getProductVO())
			.toList();
		System.out.println("productVOList = " + productVOList);
		return "product2 was successfully processed";
	}

	@PostMapping("/api/product/3")
	public String product3(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream()
			.map(item -> item.getProductVO())
			.toList();
		System.out.println("productVOList = " + productVOList);
		return "product3 was successfully processed";
	}
}
