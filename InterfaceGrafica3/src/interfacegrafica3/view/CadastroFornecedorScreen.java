/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package interfacegrafica3.view;

/**
 *
 * @author nando
 */
import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.model.Uf;
import interfacegrafica3.repository.FornecedorRepository;


import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

public class CadastroFornecedorScreen extends JFrame {
    private JTextField nomeField, emailField, enderecoField, telefoneField, cnpjField, inscricaoEstadualField, nomeFantasiaField, categoriaField;
    private JComboBox<Uf> ufComboBox;
    private JButton salvarButton;

    private final FornecedorRepository fornecedorRepository;

    /**
     *
     * @param connection
     */
    public CadastroFornecedorScreen(Connection connection) {
        this.fornecedorRepository = new FornecedorRepository(connection);
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Cadastro de Fornecedor");
        setSize(400, 500);
        setLayout(new GridLayout(10, 2));

        nomeField = new JTextField();
        emailField = new JTextField();
        enderecoField = new JTextField();
        telefoneField = new JTextField();
        cnpjField = new JTextField();
        inscricaoEstadualField = new JTextField();
        nomeFantasiaField = new JTextField();
        categoriaField = new JTextField();

        ufComboBox = new JComboBox<>();
        carregarUfs();

        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(e -> salvarFornecedor());

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Telefone:"));
        add(telefoneField);
        add(new JLabel("CNPJ:"));
        add(cnpjField);
        add(new JLabel("Inscrição Estadual:"));
        add(inscricaoEstadualField);
        add(new JLabel("Nome Fantasia:"));
        add(nomeFantasiaField);
        add(new JLabel("Categoria:"));
        add(categoriaField);
        add(new JLabel("UF:"));
        add(ufComboBox);
        add(salvarButton);

        setVisible(true);
    }

    private void carregarUfs() {
        // Implemente a lógica para carregar UFs do banco de dados
    }

    private void salvarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(nomeField.getText());
        fornecedor.setEmail(emailField.getText());
        fornecedor.setEndereco(enderecoField.getText());
        fornecedor.setTelefone(telefoneField.getText());
        fornecedor.setCnpj(cnpjField.getText());
        fornecedor.setInscricaoEstadual(inscricaoEstadualField.getText());
        fornecedor.setNomeFantasia(nomeFantasiaField.getText());
        fornecedor.setCategoria(categoriaField.getText());
        fornecedor.setUf((Uf) ufComboBox.getSelectedItem());

        try {
            fornecedorRepository.salvar(fornecedor);
            JOptionPane.showMessageDialog(this, "Fornecedor salvo com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar fornecedor: " + e.getMessage());
        }
    }
}
    private void initComponents() {//GEN-BEGIN:initComponents
        setLayout(new java.awt.BorderLayout());

    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
