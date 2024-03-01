/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.controllers;

import backenddmm20232.models.beans.Departamento;
import backenddmm20232.models.daos.DaoDepartamento;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aninha04
 */
public class ControllerDepartamento {
    DaoDepartamento daoDep;

    public Departamento inserir(Departamento depEnt) throws SQLException, ClassNotFoundException {
        daoDep = new DaoDepartamento();
        return daoDep.inserir(depEnt);
    }

    public Departamento alterar(Departamento depEnt) throws SQLException, ClassNotFoundException {
        daoDep = new DaoDepartamento();
        return daoDep.alterar(depEnt);
    }

    public Departamento buscar(Departamento depEnt) throws SQLException, ClassNotFoundException {
        daoDep = new DaoDepartamento();
        return daoDep.buscar(depEnt);
    }

    public Departamento excluir(Departamento depEnt) throws SQLException, ClassNotFoundException {
        daoDep = new DaoDepartamento();
        return daoDep.excluir(depEnt);
    }

    public List<Departamento> listar(Departamento depEnt) throws SQLException, ClassNotFoundException {
        daoDep = new DaoDepartamento();
        return daoDep.listar(depEnt);
    }
    
    
}
