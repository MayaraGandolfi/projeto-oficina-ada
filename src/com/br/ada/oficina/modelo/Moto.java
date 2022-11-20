package com.br.ada.oficina.modelo;

import java.security.PrivateKey;

public class Moto extends Veiculo implements Reparavel{
    private static String TIPO_VEICULO = "Moto";
    public Moto(String placa, Cliente dono) {
        super(placa, dono, TIPO_VEICULO);
    }

}
