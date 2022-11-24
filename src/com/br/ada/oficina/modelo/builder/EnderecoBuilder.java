package com.br.ada.oficina.modelo.builder;

import com.br.ada.oficina.modelo.pessoa.Endereco;

public class EnderecoBuilder {
    private int id;
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    private static int sequenceID = 0;

    public EnderecoBuilder Id(int id) {
        this.id = id;
        return this;
    }

    public EnderecoBuilder rua(String rua) {
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder numero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public EnderecoBuilder sequenceID(int sequenceID) {
        EnderecoBuilder.sequenceID = sequenceID;
        return this;
    }

    public Endereco build(){
        Endereco enderecoCriado = new Endereco( id, rua, numero, complemento, cep, bairro, cidade, estado);
         return enderecoCriado;
    }
}
