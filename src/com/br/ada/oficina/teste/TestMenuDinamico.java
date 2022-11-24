package com.br.ada.oficina.teste;

import com.br.ada.oficina.modelo.opcoes.*;
import com.br.ada.oficina.modelo.orcamento.Orcamento;
import com.br.ada.oficina.modelo.pessoa.Cliente;
import com.br.ada.oficina.modelo.pessoa.Endereco;
import com.br.ada.oficina.modelo.veiculo.Carro;
import com.br.ada.oficina.modelo.veiculo.Veiculo;
import com.br.ada.oficina.repository.Repository;

import java.util.Scanner;

public class TestMenuDinamico {


    public static void main(String[] args) {

        Repository<Endereco> enderecoRepository = new Repository<>();
        Repository<Cliente> clienteRepository = new Repository<>();
        Repository<Veiculo> veiculoRepository = new Repository<>();
        Repository<Orcamento> orcamentoRepository = new Repository<>();

        final int OPCAO_SAIR = 6;
        int opcaoMenu = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Menu:");
                System.out.println("1 - Fazer Orçamento");
                System.out.println("2 - Gerar Relatório de Orcamentos");
                System.out.println("3 - Gerar Relatório de Clientes Cadastrados");
                System.out.println("4 - Gerar Relatório de Veiculos Cadastrados");
                System.out.println("5 - Sair do sistema");
                System.out.println("Digite a opção que deseja:");

                opcaoMenu = sc.nextInt();
                switch (opcaoMenu) {
                    case 1:
                        Endereco endereco = CadastroEndereco.cadastra(sc);
                        enderecoRepository.cadastra(endereco);

                        Cliente cliente = CadastroCliente.cadastra(sc, endereco);
                        clienteRepository.cadastra(cliente);

                        Carro carro = CadastroVeiculo.cadastra(sc, cliente);
                        veiculoRepository.cadastra(carro);

                        Orcamento orcamento = new Orcamento(carro);
                        orcamentoRepository.cadastra(orcamento);
                        System.out.println("Cadastro finalizado");
                        System.out.println();
                        break;
                    case 2:
                        orcamentoRepository.imprimeCadastro();
                        break;
                    case 3:
                        clienteRepository.imprimeCadastro();
                        break;
                    case 4:
                        veiculoRepository.imprimeCadastro();
                        break;
                    default:
                        opcaoMenu = OPCAO_SAIR;
                }
            } catch (Exception e) {
                System.out.println("Opcao invalida");
                System.out.println("Saindo do sistema");
                opcaoMenu = OPCAO_SAIR;
            }
        } while (opcaoMenu < OPCAO_SAIR);
        System.out.println("Fim!");
        sc.close();
    }
}
