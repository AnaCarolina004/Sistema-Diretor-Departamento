/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.views;

import backenddmm20232.controllers.ControllerDiretor;
import backenddmm20232.models.beans.Diretor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aninha04
 */
public class ManterDiretor {
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
 
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ID PESSOA"));
        String area = JOptionPane.showInputDialog("AREA");
        String graduacao = JOptionPane.showInputDialog("GRADUAÇÃO");
        Diretor dirEnt = new Diretor(idPes, area, graduacao);
        ControllerDiretor contDir = new ControllerDiretor();
        Diretor dirSaida = contDir.inserir(dirEnt);
        JOptionPane.showMessageDialog(null,dirSaida.toString());
    }
 
    private static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ID PESSOA"));
        String area = JOptionPane.showInputDialog("AREA");
        String graduacao = JOptionPane.showInputDialog("GRADUAÇÃO");
        Diretor dirEnt = new Diretor(id,idPes, area, graduacao);
        ControllerDiretor contDir = new ControllerDiretor();
        Diretor dirSaida = contDir.alterar(dirEnt);
        JOptionPane.showMessageDialog(null,dirSaida.toString());
    }
 
    private static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Diretor dirEnt = new Diretor(id);
        ControllerDiretor contDir = new ControllerDiretor();
        Diretor dirSaida = contDir.buscar(dirEnt);
        JOptionPane.showMessageDialog(null,dirSaida.toString());
    }
 
    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Diretor dirEnt = new Diretor(id);
        ControllerDiretor contDir = new ControllerDiretor();
        Diretor dirSaida = contDir.excluir(dirEnt);
        JOptionPane.showMessageDialog(null,dirSaida.toString());
    }
 
    private static void listar() throws SQLException, ClassNotFoundException {
        String area = JOptionPane.showInputDialog("AREA");
        Diretor dirEnt = new Diretor(area);
        ControllerDiretor contDir = new ControllerDiretor();
        List<Diretor> listaDiretor = contDir.listar(dirEnt);
        for (Diretor dirSaida : listaDiretor) {
            JOptionPane.showMessageDialog(null,dirSaida.toString());
        }
    }
 


}
