/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author marcs
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){      
        this.view = view;
        this.helper = new LoginHelper(view);
    }

     
    public void entrarNoSistema(){
        
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
    Usuario modelo = new Usuario(0, nome, senha);
        
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
        
        //Pesquisa Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        //navegar para o menu principal
        if(usuarioAutenticado !=null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        //Se o usuario da View tiver mesmo usuario e senha que o usuario vindo do banco direcionar para menu principal
        //Senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos"
             
    }
    
    public void FizTarefa(){
        
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }

    public void fizTarefa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
