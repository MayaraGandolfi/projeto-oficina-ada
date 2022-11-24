package com.br.ada.oficina.modelo.veiculo;

import com.br.ada.oficina.enumeracao.EnumCorVeiculo;
import com.br.ada.oficina.modelo.pessoa.Cliente;

public class Veiculo {

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private Cliente cliente;
    private EnumCorVeiculo cor;
    private String descricaoProblema;
    private static int sequenceId = 1;

    private String tipoVeiculo;

    public Veiculo(String placa, Cliente dono, String tipoVeiculo) {
        this.placa = placa;
        this.cliente = dono;
        this.tipoVeiculo = tipoVeiculo;
        setId(sequenceId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (getId() == 0) {
            this.id = id;
            sequenceId++;
        } else {
            System.out.println("Veiculo ja possui já ID, não é possível mudá-lo.");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente dono) {
        this.cliente = dono;
    }

    public EnumCorVeiculo getCor() {
        return cor;
    }

    public void setCor(EnumCorVeiculo cor) {
        this.cor = cor;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo [" + tipoVeiculo +
                " id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano de fabricacao=" + anoFabricacao +
                ", cliente=" + cliente +
                ", cor=" + cor +
                ", problema=" + descricaoProblema +
                ']';
    }
}
