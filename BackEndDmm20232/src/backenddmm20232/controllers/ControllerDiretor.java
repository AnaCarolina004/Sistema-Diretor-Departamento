 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.controllers;

import backenddmm20232.models.beans.Diretor;
import backenddmm20232.models.daos.DaoDiretor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aninha04
 */
public class ControllerDiretor {
    DaoDiretor daoDir;
 
    public Diretor inserir(Diretor dirEnt) throws SQLException, ClassNotFoundException {
        daoDir = new DaoDiretor();
        return daoDir.inserir(dirEnt);
    }
 
    public Diretor alterar(Diretor dirEnt) throws SQLException, ClassNotFoundException {
        daoDir = new DaoDiretor();
        return daoDir.alterar(dirEnt);
    }
 
    public Diretor buscar(Diretor dirEnt) throws SQLException, ClassNotFoundException {
        daoDir = new DaoDiretor();
        return daoDir.buscar(dirEnt);
    }
 
    public Diretor excluir(Diretor dirEnt) throws SQLException, ClassNotFoundException {
        daoDir = new DaoDiretor();
        return daoDir.excluir(dirEnt);
    }
 
    public List<Diretor> listar(Diretor dirEnt) throws SQLException, ClassNotFoundException {
        daoDir = new DaoDiretor();
        return daoDir.listar(dirEnt);
    }
}