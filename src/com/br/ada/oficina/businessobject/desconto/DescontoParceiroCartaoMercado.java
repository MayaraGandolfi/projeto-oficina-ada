package com.br.ada.oficina.businessobject.desconto;

import com.br.ada.oficina.businessobject.desconto.AplicadorDesconto;
import com.br.ada.oficina.modelo.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParceiroCartaoMercado implements AplicadorDesconto {

    final double VALOR_DESCONTO = 5.0;

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        BigDecimal valorComDesconto = orcamento.getValor().subtract(new BigDecimal(VALOR_DESCONTO));
        orcamento.setValor(valorComDesconto);
        System.out.println("Aplicando R$" + VALOR_DESCONTO + " de desconto de parceiro");
    }
}
