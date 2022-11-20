package com.br.ada.oficina.businessobject;

import com.br.ada.oficina.modelo.Orcamento;

public class CalculadoraDescontoParceiro {
    public void aplicaDesconto(Orcamento orcamento, AplicadorDesconto aplicadorDesconto) {
        aplicadorDesconto.aplicaDesconto(orcamento);
    }
}
