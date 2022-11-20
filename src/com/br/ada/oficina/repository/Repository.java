package com.br.ada.oficina.repository;

import com.br.ada.oficina.businessobject.Report;
import com.br.ada.oficina.modelo.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repository<T> {

    private List<T> cadastrados = new ArrayList<>();

    public void cadastra(T t) {
        if (Objects.nonNull(t)) {
            cadastrados.add(t);
        } else {
            System.out.println("Cadastro nulo");
        }
    }

    public void imprimeCadastro() {
        Report<T> report = new Report<T>();
        report.gerarRelatorio(cadastrados);
    }

    public void imprimeCadastro(T t) {
        Report<T> report = new Report<T>();
        report.gerarRelatorio(t);
    }

    public void limpaCadastro() {
        System.out.println(" Limpando cadastro");
        this.cadastrados.clear();
    }

}
