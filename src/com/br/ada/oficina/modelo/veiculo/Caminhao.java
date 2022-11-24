package com.br.ada.oficina.modelo.veiculo;

import com.br.ada.oficina.modelo.pessoa.Cliente;

public class Caminhao extends Veiculo {
    private static String TIPO_VEICULO = "Caminhão";
    public Caminhao(String placa, Cliente dono) {
        super(placa, dono, TIPO_VEICULO);
    }
}
