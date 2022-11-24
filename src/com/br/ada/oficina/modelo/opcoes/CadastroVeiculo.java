package com.br.ada.oficina.modelo.opcoes;

import com.br.ada.oficina.modelo.pessoa.Cliente;
import com.br.ada.oficina.modelo.veiculo.Carro;

import java.util.Scanner;

public class CadastroVeiculo {
    public static Carro cadastra(Scanner sc, Cliente cliente) {
        System.out.println("*** CADASTRO DO CARRO ***");

        System.out.println("Digite a placa:");
        String placa = sc.next();

        System.out.println("Digite a marca:");
        String marca = sc.next();

        System.out.println("Digite o modelo:");
        String modelo = sc.next();

        System.out.println("Digite o ano de fabricação:");
        int anoFabricacao = sc.nextInt();

        System.out.println("Digite a descrição do problema do veiculo:");
        String problema = sc.next();

        Carro carro = new Carro(placa, cliente);
        return carro;
    }
}
