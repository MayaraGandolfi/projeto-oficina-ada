package com.br.ada.oficina.businessobject;

import java.util.List;

public class Report<T> {

    public void gerarRelatorio(T t) {
        System.out.println("*** GERANDO RELATÓRIO ***");
        System.out.println(t.toString());
    }

    public void gerarRelatorio(List<T> lista) {
        System.out.println("*** GERANDO RELATÓRIO DA LISTA ***");
        for (T item : lista) {
            System.out.println(item);
        }
        if (lista.isEmpty()) {
            System.out.println("---Cadastro em branco---");
        }
    }

}
