/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uniplan.Testes;

import br.uniplan.DTO.ClienteDTO;
import br.uniplan.DAL.ClienteDAL;

/**
 *
 * @author profe
 */
public class TesteAlterarCliente {
    public static void main(String[ ] args) throws Exception
    {
        ClienteDAL dal = new ClienteDAL();
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliID(9);
        cliente.setCliNome("Rafael Soares de Almeida");
        cliente.setCliDtInclusao(java.time.LocalDate.now());
        cliente.setCliEndereco("Quadra 0000");
        cliente.setCliBairro("SUL");
        cliente.setCliEmail("rafaelsda@teste.com");
        cliente.setCliTel("7888888");
        cliente.setCliCidade("Brasília");
        cliente.setCliUF("DF");
        dal.alterarCliente(cliente);
        System.out.print("Cliente " + cliente.getCliNome() + " Alterado com sucesso!");    
    }
}
