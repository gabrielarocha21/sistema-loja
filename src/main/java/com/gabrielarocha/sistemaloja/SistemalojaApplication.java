package com.gabrielarocha.sistemaloja;

import com.gabrielarocha.sistemaloja.entities.Client;
import com.gabrielarocha.sistemaloja.entities.Product;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class SistemalojaApplication {
    @Getter
    private static Map<Long, Product> productMap = new HashMap<>();

    //    linha 21  ->   set é mesma coisa que uma List, porém evita duplicidade
    @Getter
    private static Set<Client> clientSet = new HashSet<>();

    public static void main(String[] args) {
        SpringApplication.run(SistemalojaApplication.class, args);
    }

}
