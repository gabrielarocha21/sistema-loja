package com.gabrielarocha.sistemaloja.dtos.interfaces;

public interface ConverterDTO<T, D> {
    T converter();
    D converter(T t);
}
