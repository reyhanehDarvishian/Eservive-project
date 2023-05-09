package com.rahgozin.gate.api.topIn;

import com.rahgozin.gate.service.topIn.ProductTypeListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ProductTypeListController {
    private final ProductTypeListService productTypeListService;

    public ProductTypeListController(ProductTypeListService productTypeListService) {
        this.productTypeListService = productTypeListService;
    }

    @GetMapping("/product-type-list")
    public Object productTypeList(String username, String password, String token) {
        return productTypeListService.getProductId(username, password, token);
    }
}
