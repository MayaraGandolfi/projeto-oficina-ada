package com.br.ada.oficina.teste;

import com.br.ada.oficina.businessobject.desconto.CalculadoraDescontoParceiro;
import com.br.ada.oficina.businessobject.desconto.DescontoParceiroResidenteBairro;
import com.br.ada.oficina.businessobject.desconto.DescontoParceiroSeguro;
import com.br.ada.oficina.businessobject.Reparos;
import com.br.ada.oficina.enumeracao.EnumCorVeiculo;
import com.br.ada.oficina.modelo.orcamento.Orcamento;
import com.br.ada.oficina.modelo.pessoa.*;
import com.br.ada.oficina.modelo.veiculo.Carro;
import com.br.ada.oficina.modelo.veiculo.Moto;
import com.br.ada.oficina.modelo.veiculo.Veiculo;
import com.br.ada.oficina.repository.Repository;
import com.br.ada.oficina.modelo.builder.EnderecoBuilder;

import java.math.BigDecimal;


public class TestOficina {
    public static void main(String[] args) {

        Endereco endereco = new EnderecoBuilder()
                .bairro("Afonso Pena")
                .complemento("apto 12")
                .estado("Paraná")
                .rua("Rua Almirante Alexandrino")
                .cep("06226436")
                .numero("8")
                .build();


        Cliente cliente = new Cliente("Maria", "09287869728");
        cliente.setEmail("maria@gmail.com");
        cliente.setEndereco(endereco);
        cliente.setTelefone("3111-1111");

        Carro carro = new Carro("AAA1A23", cliente);
        carro.setCor(EnumCorVeiculo.PRETO);
        carro.setAnoFabricacao(2018);
        carro.setMarca("Renault");
        carro.setModelo("Sandero");
        carro.setDescricaoProblema("Superaquecimento");

        Endereco endereco1 = new EnderecoBuilder()
                .bairro("Centro")
                .complemento("casa")
                .estado("Paraná")
                .rua("Rua Nunes Machado")
                .cep("83658001")
                .numero("957")
                .build();

        Cliente cliente1 = new Cliente("Joao", "58965698278");
        cliente1.setEmail("joao123@gmail.com");
        cliente1.setEndereco(endereco1);
        cliente1.setTelefone("3222-2222");

        Moto moto = new Moto("BBB1B23", cliente1);
        moto.setCor(EnumCorVeiculo.VERMELHO);
        moto.setAnoFabricacao(2022);
        moto.setMarca("Honda");
        moto.setModelo("XRE");
        moto.setDescricaoProblema("Não está ligando");

        Carro carro1 = new Carro("CCC2C83", cliente1);
        carro1.setCor(EnumCorVeiculo.VERMELHO);
        carro1.setAnoFabricacao(2020);
        carro1.setMarca("Fiat");
        carro1.setModelo("Mobi");
        carro1.setDescricaoProblema("Bateria fraca");

        Repository<Endereco> enderecoRepository = new Repository<>();
        enderecoRepository.cadastra(endereco);
        enderecoRepository.cadastra(endereco1);

        Repository<Cliente> clienteRepository = new Repository<Cliente>();
        clienteRepository.cadastra(cliente);
        clienteRepository.cadastra(cliente1);
        clienteRepository.imprimeCadastro();

        Repository<Veiculo> veiculoRepository = new Repository<Veiculo>();
        veiculoRepository.cadastra(carro);
        veiculoRepository.cadastra(moto);
        veiculoRepository.cadastra(carro1);
        veiculoRepository.imprimeCadastro();

        Mecanico mecanico = new Mecanico("Carlos", "05896325789");
        Mecanico mecanico1 = new Mecanico("José", "78952896478");

        Atendente atendente = new Atendente("Adriana", "78967896952");

        Repository<Funcionario> funcionarioRepository = new Repository<>();
        funcionarioRepository.cadastra(mecanico);
        funcionarioRepository.cadastra(mecanico1);
        funcionarioRepository.cadastra(atendente);
        funcionarioRepository.imprimeCadastro();

        Reparos reparos = new Reparos();
        reparos.reparar(carro);
        reparos.reparar(carro1);
        reparos.mostrarCarrosOficina();

        CalculadoraDescontoParceiro calcDesconto = new CalculadoraDescontoParceiro();


        Repository<Orcamento> orcametoRepository = new Repository();
        Orcamento orcamento = new Orcamento(carro1);
        orcamento.setValor(BigDecimal.valueOf(100.0));
        orcamento.setMecanico(mecanico);
        orcamento.setAtendente(atendente);
        orcamento.setPrivisaoDiasReparo(1);
        orcametoRepository.cadastra(orcamento);
        orcametoRepository.imprimeCadastro(orcamento);

        DescontoParceiroResidenteBairro descontoParcBairro = new DescontoParceiroResidenteBairro();
        calcDesconto.aplicaDesconto(orcamento, descontoParcBairro);
        System.out.println("Valor do orcamento com desconto: R$" + orcamento.getValor());


        Orcamento orcamento1 = new Orcamento(carro);
        orcamento1.setValor(BigDecimal.valueOf(1000));
        orcamento1.setMecanico(mecanico1);
        orcamento1.setAtendente(atendente);
        orcamento1.setPrivisaoDiasReparo(3);
        orcametoRepository.cadastra(orcamento1);

        orcametoRepository.imprimeCadastro(orcamento1);
        DescontoParceiroSeguro descontoSeguro = new DescontoParceiroSeguro();
        calcDesconto.aplicaDesconto(orcamento1, descontoSeguro);
        System.out.println("Valor do orcamento com desconto: R$" + orcamento1.getValor());

    }
}
