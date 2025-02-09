package interfacegrafica3.controller;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.model.Uf;

public class FornecedorController {
    public void criarFornecedor() {
        // Criação de um objeto Fornecedor com os valores necessários
        Fornecedor fornecedor = new Fornecedor(1, "Nome", "email@exemplo.com", "Endereço", 
                                               "123456789", "12345678901234", "123456", 
                                               "Nome Fantasia", "Categoria Exemplo", Uf.SP);

        // Agora você pode usar o objeto 'fornecedor' conforme necessário
        System.out.println(fornecedor.toString());
    }
}

