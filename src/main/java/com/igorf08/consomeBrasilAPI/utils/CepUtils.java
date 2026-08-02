package com.igorf08.consomeBrasilAPI.utils;

public class CepUtils {
    public static String formatCep(String cep) {
        return cep.substring(0, 5) + '-' + cep.substring(5);
    }
}
