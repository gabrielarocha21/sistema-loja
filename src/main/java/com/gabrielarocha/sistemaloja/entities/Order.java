package com.gabrielarocha.sistemaloja.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {
    private Long id;
    private List<Product> products;
    private Double total;

    public Double calcTotal(){
        //Este retorno poderia ser return products.stream().mapToDouble(product -> product.getPrice).sum();
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void addProductOnOrder(Product product){
        products.add(product);
        total = calcTotal();
    }
}
