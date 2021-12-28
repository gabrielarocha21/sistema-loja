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
public class Client {
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Integer phone;
    private List<Order> orders;


    public boolean isValidClient(){
        if(!this.name.trim().equals("") && !this.email.trim().equals("")) return true;
        return false;
    }

}
