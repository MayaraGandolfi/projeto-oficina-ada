package com.br.ada.oficina.modelo;

public class Cliente extends Pessoa{

    private int fidelidade;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(int fidelidade) {
        this.fidelidade = fidelidade;
    }

    @Override
    public String toString() {
        return "Cliente [" +
                super.toString() +
                "fidelidade=" + fidelidade +
                ']';
    }
}
