package com.br.ada.oficina.modelo;

import java.math.BigDecimal;

public class Atendente extends Pessoa implements Funcionario {

    private BigDecimal salario;
    public Atendente(String nome, String cpf) {
        super(nome, cpf);
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
