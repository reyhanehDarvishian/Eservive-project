package com.rahgozin.gate.api.topIn;


import com.rahgozin.gate.service.topIn.ProductListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ProductListController {
    private final ProductListService productListService;

    public ProductListController(ProductListService productListService) {
        this.productListService = productListService;
    }

    @GetMapping("/product-list")
    public Object productList(String username, String password, String token){
        return productListService.getPayloadId(username, password, token);
    }
}
