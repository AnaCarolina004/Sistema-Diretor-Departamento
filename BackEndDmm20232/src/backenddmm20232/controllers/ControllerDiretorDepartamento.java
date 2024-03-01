/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.controllers;

import backenddmm20232.models.beans.Diretor;
import backenddmm20232.models.beans.Departamento;
import backenddmm20232.models.beans.DiretorDepartamento;
import backenddmm20232.models.daos.DaoDiretorDepartamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aninha04
 */
public class ControllerDiretorDepartamento {
    DaoDiretorDepartamento daoDd;

    public DiretorDepartamento inserir(DiretorDepartamento dirDep) throws SQLException, ClassNotFoundException {
        daoDd = new DaoDiretorDepartamento();
        return daoDd.inserir(dirDep);
    }

    public DiretorDepartamento alterar(DiretorDepartamento dirDep) throws SQLException, ClassNotFoundException {
        daoDd = new DaoDiretorDepartamento();
        return daoDd.alterar(dirDep);
    }

    public DiretorDepartamento excluir(DiretorDepartamento dirDep) throws SQLException, ClassNotFoundException {
        daoDd = new DaoDiretorDepartamento();
        return daoDd.excluir(dirDep);
    }

    public DiretorDepartamento buscar(DiretorDepartamento dirDep) throws SQLException, ClassNotFoundException {
        daoDd = new DaoDiretorDepartamento();
        DiretorDepartamento ddSaida = daoDd.buscar(dirDep);
        
        ControllerDiretor contDir = new ControllerDiretor();
        Diretor dirEnt = new Diretor(ddSaida.getIdDir());
        ddSaida.setDir(contDir.buscar(dirEnt));
        
        ControllerDepartamento contDep = new ControllerDepartamento();
        Departamento depEnt = new Departamento(ddSaida.getIdDep());
        ddSaida.setDep(contDep.buscar(depEnt));
        
        return ddSaida;
    }

    public List<DiretorDepartamento> listar(DiretorDepartamento dirDep) throws SQLException, ClassNotFoundException {
        daoDd = new DaoDiretorDepartamento();
        List<DiretorDepartamento> listaDirDepAux = daoDd.listar(dirDep);
        List<DiretorDepartamento> listaDirDepSaida = new ArrayList<>();
        
        for (DiretorDepartamento dirDepSaida : listaDirDepAux) {
            listaDirDepSaida.add(buscar(dirDepSaida));
        }
        
        return listaDirDepSaida;
    }

    
}
