package com.gabrielarocha.sistemaloja.dtos;

import com.gabrielarocha.sistemaloja.dtos.interfaces.ConverterDTO;
import com.gabrielarocha.sistemaloja.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDTO implements ConverterDTO<Client, ClientDTO> {
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Integer phone;

    @Override
    public Client converter() {
        return new Client(id, name, email, cpf, phone, null);
    }

    @Override
    public ClientDTO converter(Client client) {
        return null;
    }
}
