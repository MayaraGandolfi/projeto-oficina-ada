package com.br.ada.oficina.modelo.pessoa;

public class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;
    private static int sequenceId = 1;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        setId(sequenceId);
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (getId() == 0) {
            this.id = id;
            sequenceId ++;
        } else {
            System.out.println("Pessoa já possui ID, não é possível mudá-lo.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ']';
    }
}
