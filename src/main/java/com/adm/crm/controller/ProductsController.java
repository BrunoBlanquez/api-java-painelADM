package com.adm.crm.controller;


import com.adm.crm.dto.ProductDTO;
import com.adm.crm.model.Products;
import com.adm.crm.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public List<Products> listAllProducts() {
        return this.productsService.listAllProducts();
    }

    @GetMapping("/{code}")
    public Products listById(@PathVariable String code) {
        return this.productsService.listById(code);
    }

    @PostMapping
    public Products createProduct(@RequestBody @Validated Products produto) {
        return this.productsService.createNewProduct(produto);
    }

    @PutMapping("/{code}")
    public ResponseEntity<Products> updateProductInfo(@PathVariable String code, @RequestBody @Validated ProductDTO produto) {
        final var produtoAtualizado = productsService.listById(code);
        if (produtoAtualizado == null) {
            return ResponseEntity.notFound().build();
        }

        produtoAtualizado.setName(produto.getName());
        produtoAtualizado.setImage(produto.getImage());
        produtoAtualizado.setStock(produto.getStock());
        produtoAtualizado.setPrice(produto.getPrice());
        produtoAtualizado.setBrand(produto.getBrand());
        return ResponseEntity.ok(this.productsService.updateProductInfo(produtoAtualizado));
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<?> deleteProductById(@PathVariable String codigo) {
        this.productsService.deleteProduct(codigo);
        return ResponseEntity.noContent().build();
    }

}
