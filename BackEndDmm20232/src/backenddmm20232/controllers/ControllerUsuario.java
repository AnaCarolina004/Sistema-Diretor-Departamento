/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.controllers;

import backenddmm20232.models.beans.Usuario;
import backenddmm20232.models.daos.DaoUsuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsu;

    public boolean validar(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        boolean retorno = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(usuEnt);
        if(usuSaida != null) {
            retorno = true;
        }
        return retorno;

    }

    public Usuario inserir(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(usuEnt);
    }

    public Usuario alterar(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.alterar(usuEnt);
    }

    public Usuario buscar(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.buscar(usuEnt);
    }

    public Usuario excluir(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.excluir(usuEnt);
    }

    public List<Usuario> listar(Usuario usuEnt) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.listar(usuEnt);
    }
    
}
