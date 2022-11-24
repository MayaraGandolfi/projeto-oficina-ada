package com.br.ada.oficina.modelo.orcamento;

import com.br.ada.oficina.modelo.pessoa.Atendente;
import com.br.ada.oficina.modelo.pessoa.Mecanico;
import com.br.ada.oficina.modelo.veiculo.Veiculo;

import java.math.BigDecimal;

public class Orcamento {

    private int id;
    private Veiculo veiculo;
    private BigDecimal valor;
    private int privisaoDiasReparo;
    private Mecanico mecanico;
    private Atendente atendente;
    private static int sequenceID = 1;

    public Orcamento(Veiculo veiculo) {
        this.veiculo = veiculo;
        setId(sequenceID);
        int fidelidade = veiculo.getCliente().getFidelidade();
        veiculo.getCliente().setFidelidade(fidelidade++);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (getId() == 0) {
            this.id = id;
            sequenceID++;
        } else {
            System.out.println("Veiculo ja possui já ID, não é possível mudá-lo.");
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getPrivisaoDiasReparo() {
        return privisaoDiasReparo;
    }

    public void setPrivisaoDiasReparo(int privisaoDiasReparo) {
        this.privisaoDiasReparo = privisaoDiasReparo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }


    @Override
    public String toString() {
        return "Orcamento: \n" +
                "id=" + id +
                ", \nveiculo=" + veiculo +
                ", \nvalor=" + valor +
                ", \nprivisaoDiasReparo=" + privisaoDiasReparo +
                ", \nmecanico=" + mecanico +
                ", \natendente=" + atendente +
                '}';
    }
}
