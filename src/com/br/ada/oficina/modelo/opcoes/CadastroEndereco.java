package com.br.ada.oficina.modelo.opcoes;

import com.br.ada.oficina.modelo.builder.EnderecoBuilder;
import com.br.ada.oficina.modelo.pessoa.Endereco;

import java.util.Scanner;

public class CadastroEndereco {

    public static Endereco cadastra(Scanner sc) {

        System.out.println("*** CADASTRO DO ENDERECO ***");

        System.out.println("Digite sua rua:");
        String rua = sc.next();

        System.out.println("Digite o numero da sua casa:");
        String numero = sc.next();

        System.out.println("Digite o seu cep:");
        String cep = sc.next();

        System.out.println("Digite seu bairro:");
        String bairro = sc.next();

        System.out.println("Digite seu estado onde mora:");
        String estado = sc.next();

        Endereco endereco = new EnderecoBuilder()
                .bairro("Centro")
                .complemento("casa")
                .estado("Paraná")
                .rua("Rua Nunes Machado")
                .cep("83658001")
                .numero("957")
                .build();

        return endereco;
    }
}
