/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

public class Fornecedor extends PessoaJuridica {
    private String categoria;
    private Uf uf;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String email, String endereco, String telefone, String cnpj,
            String inscricaoEstadual, String nomeFantasia, String categoria, Uf uf) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id);
        this.categoria = categoria;
        this.uf = uf;
    }

    // Getters e Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + getId() +
                ", nome=" + getNome() +
                ", email=" + getEmail() +
                ", endereco=" + getEndereco() +
                ", telefone=" + getTelefone() +
                ", cnpj=" + getCnpj() +
                ", inscricaoEstadual=" + getInscricaoEstadual() +
                ", nomeFantasia=" + getNomeFantasia() +
                ", categoria=" + categoria +
                ", uf=" + uf +
                '}';
    }
}
