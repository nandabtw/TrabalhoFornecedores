package interfacegrafica3.model;

public class Fornecedor extends PessoaJuridica {

    // Métodos estáticos
    public static String size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static Pessoa get(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Atributos
    private String categoria;
    private Uf uf;

    // Construtor completo
    public Fornecedor(int id, String nome, String email, String endereco, String telefone, String cnpj, String inscricaoEstadual, String nomeFantasia, String categoria, Uf uf) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id);
        this.categoria = categoria;
        this.uf = uf;
    }

    public Fornecedor(String nome, String email, String cnpj, String endereco, String telefone, String cidade, String estado, int id) {
    super(nome, email, cnpj, endereco, telefone, cidade, estado, id);
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
