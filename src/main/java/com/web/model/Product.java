package com.web.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product_table")
public class Product {
    @Id
    private Integer productId;
    private String productName;
    private String productPrice;
}
