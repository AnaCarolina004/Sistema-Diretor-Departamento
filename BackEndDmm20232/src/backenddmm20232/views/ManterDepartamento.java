/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.views;

import backenddmm20232.controllers.ControllerDepartamento;
import backenddmm20232.models.beans.Departamento;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aninha04
 */
public class ManterDepartamento {
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

        String nome = JOptionPane.showInputDialog("NOME");
        String sigla = JOptionPane.showInputDialog("SIGLA");
        String desc = JOptionPane.showInputDialog("DESCRIÇÃO");
        Departamento depEnt = new Departamento(nome, sigla, desc);
        ControllerDepartamento contDep = new ControllerDepartamento();
        Departamento depSaida = contDep.inserir(depEnt);
        JOptionPane.showMessageDialog(null,depSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("NOME");
        String sigla = JOptionPane.showInputDialog("SIGLA");
        String desc = JOptionPane.showInputDialog("DESCRIÇÃO");
        Departamento depEnt = new Departamento(id,nome, sigla, desc);
        ControllerDepartamento contDep = new ControllerDepartamento();
        Departamento depSaida = contDep.alterar(depEnt);
        JOptionPane.showMessageDialog(null,depSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento depEnt = new Departamento(id);
        ControllerDepartamento contDep = new ControllerDepartamento();
        Departamento depSaida = contDep.buscar(depEnt);
        JOptionPane.showMessageDialog(null,depSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Departamento depEnt = new Departamento(id);
        ControllerDepartamento contDep = new ControllerDepartamento();
        Departamento depSaida = contDep.excluir(depEnt);
        JOptionPane.showMessageDialog(null,depSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("NOME");
        Departamento depEnt = new Departamento(nome);
        ControllerDepartamento contDep = new ControllerDepartamento();
        List<Departamento> listaDepartamento = contDep.listar(depEnt);
        for (Departamento depSaida : listaDepartamento) {
            JOptionPane.showMessageDialog(null,depSaida.toString());
        }
    }



    
}
