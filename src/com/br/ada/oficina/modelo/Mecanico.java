package com.br.ada.oficina.modelo;

import java.math.BigDecimal;

public class Mecanico extends Pessoa implements Funcionario{

    private BigDecimal salario;
    public Mecanico(String nome, String cpf) {
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
