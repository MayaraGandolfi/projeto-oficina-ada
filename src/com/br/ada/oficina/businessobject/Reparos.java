package com.br.ada.oficina.businessobject;

import com.br.ada.oficina.modelo.veiculo.Reparavel;

import java.util.ArrayList;
import java.util.List;

public class Reparos {
    private final int NUMERO_VAGAS = 2;

    private List<Reparavel> veiculosParaReparo = new ArrayList<>();

    public void reparar(Reparavel reparavel) {
        if (veiculosParaReparo.size() < NUMERO_VAGAS) {
            veiculosParaReparo.add(reparavel);
            System.out.println("Veiculo placa " + reparavel.getPlaca()
                    + " modelo " + reparavel.getModelo() +
                    " cadastrado para reparo na oficina.");
        } else {
            System.out.println("*** Não há mais espaço para reparo de novos carros na oficina ***");
        }
    }

    public void mostrarCarrosOficina() {
        Report<Reparavel> report = new Report<>();
        report.gerarRelatorio(veiculosParaReparo);
    }
}
