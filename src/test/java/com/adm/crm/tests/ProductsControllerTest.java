package com.adm.crm.tests;

import com.adm.crm.controller.ProductsController;
import com.adm.crm.model.Products;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductsControllerTest {

    ProductsController controller = new ProductsController();

    @Test
    void listAllProducts() {
        var response = controller.listAllProducts();
    }

    @Test
    void listById() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void updateProductsInfo() {
    }

    @Test
    void deleteProductByID() {
    }
}