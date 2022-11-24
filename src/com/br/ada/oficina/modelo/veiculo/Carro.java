package com.br.ada.oficina.modelo.veiculo;

import com.br.ada.oficina.modelo.pessoa.Cliente;

public class Carro extends Veiculo implements Reparavel {

    private static String TIPO_VEICULO = "Carro";

    public Carro(String placa, Cliente dono) {
        super(placa, dono, TIPO_VEICULO);
    }

}
