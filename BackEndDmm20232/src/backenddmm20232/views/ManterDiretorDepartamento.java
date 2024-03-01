/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.views;

import backenddmm20232.controllers.ControllerDiretorDepartamento;
import backenddmm20232.models.beans.DiretorDepartamento;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aninha04
 */
public class ManterDiretorDepartamento {
    public static void menu() throws SQLException, ClassNotFoundException {
        String msg = " 1 - Inserir \n 2 - Alterar \n 3 - buscar \n 4 - excluir \n 5 - Listar " ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                excluir();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opcao inválida");
        }
    }

    private static void inserir() throws SQLException, ClassNotFoundException {
        int idDir = Integer.parseInt(JOptionPane.showInputDialog("ID_DIRETOR"));
        int idDep = Integer.parseInt(JOptionPane.showInputDialog("ID_DEPARTAMENTO"));
        String dataInicio = JOptionPane.showInputDialog("DATA INICIO");
        String dataFim = JOptionPane.showInputDialog("DATA FIM");
        String nomeProj = JOptionPane.showInputDialog("NOME PROJETO");
        String obs = JOptionPane.showInputDialog("OBS");
        DiretorDepartamento dirDepEnt = new DiretorDepartamento(idDir, idDep, dataInicio, dataFim, nomeProj, obs);
        ControllerDiretorDepartamento contDirDep = new ControllerDiretorDepartamento();
        DiretorDepartamento dirDepSaida = contDirDep.inserir(dirDepEnt);
        JOptionPane.showMessageDialog(null,dirDepSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        int idDir = Integer.parseInt(JOptionPane.showInputDialog("ID_DIRETOR"));
        int idDep = Integer.parseInt(JOptionPane.showInputDialog("ID_DEPARTAMENTO"));
        String dataInicio = JOptionPane.showInputDialog("DATA INICIO");
        String dataFim = JOptionPane.showInputDialog("DATA FIM");
        String nomeProj = JOptionPane.showInputDialog("NOME PROJETO");
        String obs = JOptionPane.showInputDialog("OBS");
        DiretorDepartamento dirDepEnt = new DiretorDepartamento(id ,idDir,idDep,dataInicio, dataFim, nomeProj, obs);
        ControllerDiretorDepartamento contDirDep = new ControllerDiretorDepartamento();
        DiretorDepartamento dirDepSaida = contDirDep.alterar(dirDepEnt);
        JOptionPane.showMessageDialog(null,dirDepSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        DiretorDepartamento dirDepEnt = new DiretorDepartamento(id);
        ControllerDiretorDepartamento contDirDep = new ControllerDiretorDepartamento();
        DiretorDepartamento dirDepSaida = contDirDep.buscar(dirDepEnt);
        JOptionPane.showMessageDialog(null,dirDepSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        DiretorDepartamento dirDepEnt = new DiretorDepartamento(id);
        ControllerDiretorDepartamento contDirDep = new ControllerDiretorDepartamento();
        DiretorDepartamento dirDepSaida = contDirDep.excluir(dirDepEnt);
        JOptionPane.showMessageDialog(null,dirDepSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        DiretorDepartamento dirDepEnt = new DiretorDepartamento(id);
        ControllerDiretorDepartamento contDirDep = new ControllerDiretorDepartamento();
        List<DiretorDepartamento> listaDiretorDepartamento = contDirDep.listar(dirDepEnt);
        for (DiretorDepartamento dirDepSaida : listaDiretorDepartamento) {
            JOptionPane.showMessageDialog(null,dirDepSaida.toString());
            JOptionPane.showMessageDialog(null,dirDepSaida.getDir().toString());
            JOptionPane.showMessageDialog(null,dirDepSaida.getDep().toString());
        }
    }
}
