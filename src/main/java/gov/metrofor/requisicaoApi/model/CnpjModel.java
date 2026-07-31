package gov.metrofor.requisicaoApi.model;

import gov.metrofor.requisicaoApi.model.enums.PorteEnum;

public class CnpjModel {
    public String cnpj;
    public String uf;
    public String cep;
    public String email;
    public PorteEnum porte;
    public String bairro;
    public String municipio;
    public String logradouro;

    public CnpjModel(String cnpj, String uf, String cep, String email, PorteEnum porte, String bairro, String municipio, String logradouro) {
        this.cnpj = cnpj;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.porte = porte;
        this.bairro = bairro;
        this.municipio = municipio;
        this.logradouro = logradouro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        if (this.email == null || this.email.isBlank()) {
            return "NÃO INFORMADO";
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PorteEnum getPorte() {
        return porte;
    }

    public void setPorte(PorteEnum porte) {
        this.porte = porte;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        if (this.municipio == null || this.municipio.isBlank()) {
            return "NÃO INFORMADO";
        }
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLogradouro() {
        if (this.logradouro == null || this.logradouro.isBlank()) {
            return "NÃO INFORMADO";
        }
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
