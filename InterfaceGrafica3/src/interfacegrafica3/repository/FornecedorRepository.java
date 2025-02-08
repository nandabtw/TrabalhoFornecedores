/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.model.Uf;
/**
 *
 * @author nando
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorRepository {

    private final Connection connection;

    public FornecedorRepository(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO fornecedor (nome, email, endereco, uf_id, telefone, cnpj, inscricaoEstadual, nomeFantasia, categoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setInt(4, fornecedor.getUf().getId());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getInscricaoEstadual());
            stmt.setString(8, fornecedor.getNomeFantasia());
            stmt.setString(9, fornecedor.getCategoria());
            stmt.executeUpdate();
        }
    }

    public List<Fornecedor> listar() throws SQLException {
        List<Fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT f.*, u.nome as uf_nome, u.sigla FROM fornecedor f JOIN uf u ON f.uf_id = u.id";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
                fornecedor.setNomeFantasia(rs.getString("nomeFantasia"));
                fornecedor.setCategoria(rs.getString("categoria"));

                Uf uf = new Uf();
                uf.setId(rs.getInt("uf_id"));
                uf.setNome(rs.getString("uf_nome"));
                uf.setSigla(rs.getString("sigla"));
                fornecedor.setUf(uf);

                fornecedores.add(fornecedor);
            }
        }
        return fornecedores;
    }
}