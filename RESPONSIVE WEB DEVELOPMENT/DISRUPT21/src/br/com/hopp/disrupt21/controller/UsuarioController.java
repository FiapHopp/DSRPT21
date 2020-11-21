package br.com.hopp.disrupt21.controller;

 

import java.io.IOException;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import br.com.hopp.disrupt21.bo.UsuarioBo;
import br.com.hopp.disrupt21.to.UsuarioTo;

 

@WebServlet(urlPatterns= {"/cadastrarUsuario"})
public class UsuarioController extends HttpServlet {
    private static final long serialVersionUID= 1L;
    
    public UsuarioController() {
        super();
    }
    
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        
        switch(request.getRequestURI()) {
        case "/DISRUPT21/cadastrarUsuario":
            
            try {
                cadastrarUsuario(request, response);
            } catch (Exception e) {
    
                e.printStackTrace();
            }                
            break;
        default:
            response.sendRedirect("");
        }
        
    }

 

    private void cadastrarUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        UsuarioTo usuario = new UsuarioTo();
        
        UsuarioBo usuarioBo = new UsuarioBo();
        
        usuario.setNome(request.getParameter("txtNome"));
        usuario.setEmail(request.getParameter("txtemail"));
        
        usuarioBo.cadastrar(usuario);
        
    }

 

}