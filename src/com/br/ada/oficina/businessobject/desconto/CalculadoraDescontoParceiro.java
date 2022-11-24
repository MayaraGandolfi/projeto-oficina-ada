package com.br.ada.oficina.businessobject.desconto;

import com.br.ada.oficina.businessobject.desconto.AplicadorDesconto;
import com.br.ada.oficina.modelo.orcamento.Orcamento;

public class CalculadoraDescontoParceiro {
    public void aplicaDesconto(Orcamento orcamento, AplicadorDesconto aplicadorDesconto) {
        aplicadorDesconto.aplicaDesconto(orcamento);
    }
}
