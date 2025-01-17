/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uniplan.Testes;

import br.uniplan.DAL.ClienteDAL;
import br.uniplan.DTO.ClienteDTO;

/**
 *
 * @author profe
 */
public class TesteSelecionarClientePorID {
    public static void main(String[ ] args) throws Exception
    {
        ClienteDAL dal = new ClienteDAL();
        ClienteDTO cliente = dal.selecionarClientePorID(12);
        System.out.println("Codigo: " + cliente.getCliID());
        System.out.println("Nome Cliente: " + cliente.getCliNome());
        System.out.println("Dt. Inclusão: " + cliente.getCliDtInclusao());
        System.out.println("Endereço: " + cliente.getCliEndereco());
        System.out.println("Dt. Inclusão: " + cliente.getCliBairro());
        System.out.println("Email: " + cliente.getCliEmail());
        System.out.println("Telefone: 0" + cliente.getCliTel());  //"0" só para mostra o zero antes do DDD.    
        System.out.println("Cidade: " + cliente.getCliCidade());
        System.out.println("UF: " + cliente.getCliUF());    
    }    
}
