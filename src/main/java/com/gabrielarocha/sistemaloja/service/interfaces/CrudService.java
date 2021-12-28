package com.gabrielarocha.sistemaloja.service.interfaces;

import java.util.List;

public interface CrudService<T> {

    T create(T t);
    void remove(Integer id);
    //Realizara uma busca por atributo do tipo string (pode ser email/cpf)
    T findBy(String s);
    List<T> findAll();
}
