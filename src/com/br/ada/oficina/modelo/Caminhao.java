package com.br.ada.oficina.modelo;

public class Caminhao extends Veiculo{
    private static String TIPO_VEICULO = "Caminhão";
    public Caminhao(String placa, Cliente dono) {
        super(placa, dono, TIPO_VEICULO);
    }
}
