package com.br.ada.oficina.modelo.veiculo;

import com.br.ada.oficina.modelo.pessoa.Cliente;

public class Moto extends Veiculo {
    private static String TIPO_VEICULO = "Moto";
    public Moto(String placa, Cliente dono) {
        super(placa, dono, TIPO_VEICULO);
    }

}
