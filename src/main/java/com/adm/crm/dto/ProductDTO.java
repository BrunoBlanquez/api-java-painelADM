package com.adm.crm.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class ProductDTO {

    @NotEmpty
    @Size(min = 5, max = 30)
    private String name;

    @NotEmpty
    private String image;

    @Min(1)
    private int stock;

    @Min(1)
    private BigDecimal price;

    @Size(min = 5, max = 30)
    private String brand;
}
