/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author marcs
 */
public class Main {
    
    
    public static void main(String[] args){
        
        String nome = "marcos";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1,"Marcos", "Estrada J.K de Oliveira", "11974506738");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1,"Barbeiro","senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "17/08/2020 10:10");
        System.out.println(agendamento.getCliente().getNome());
           
    }
    
}
