package com.br.ada.oficina.modelo.opcoes;

import com.br.ada.oficina.modelo.pessoa.Cliente;
import com.br.ada.oficina.modelo.pessoa.Endereco;

import java.util.Scanner;

public class CadastroCliente {
    public static Cliente cadastra(Scanner sc, Endereco endereco) {

        System.out.println("*** CADASTRO DO CLIENTE ***");

        System.out.println("Digite o nome:");
        String nome = sc.next();

        System.out.println("Digite o cpf:");
        String cpf = sc.next();

        System.out.println("Digite o telefone:");
        String telefone = sc.next();

        System.out.println("Digite o email:");
        String email = sc.next();

        Cliente cliente = new Cliente(nome, cpf);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);


        return cliente;
    }
}
