package com.igorf08.consomeApiBrasil.utils;

public class CnpjUtils {
    public static String cnpjFormat(String cnpj) {
        return cnpj.substring(0 , 2) + '.' +
                cnpj.substring(2, 5) + '.' +
                cnpj.substring(5, 8) + '/' +
                cnpj.substring(8, 12) + '-' +
                cnpj.substring(12);
    }
}
