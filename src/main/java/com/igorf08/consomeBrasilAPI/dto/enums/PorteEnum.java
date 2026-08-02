package com.igorf08.consomeBrasilAPI.dto.enums;

public enum PorteEnum {
    NAO_INFORMADO("NÃO INFORMADO"),
    MICRO_EMPRESA("MICRO EMPRESA"),
    EMPRESA_DE_PEQUENO_PORTE("EMPRESA DE PEQUENO PORTE"),
    DEMAIS("DEMAIS");

    private final String porte;

    PorteEnum(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return this.porte;
    }

}
