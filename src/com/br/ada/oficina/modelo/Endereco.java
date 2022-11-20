package com.br.ada.oficina.modelo;

public class Endereco {
    private int id;
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    private static int sequenceID = 0;
    public Endereco() {
        setId(sequenceID);
 }

    public Endereco(String numero, String complemento, String cep) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        setId(sequenceID);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (getId() == 0) {
            this.id = id;
            sequenceID ++;
        } else {
            System.out.println("Endereço já possui ID, não é possível mudá-lo.");
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco [" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ']';
    }
}
