/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backenddmm20232;

import backenddmm20232.views.ManterDepartamento;
import backenddmm20232.views.ManterDiretor;
import backenddmm20232.views.ManterDiretorDepartamento;
import backenddmm20232.views.ManterPessoaFisica;
import backenddmm20232.views.ManterSistema;
import backenddmm20232.views.ManterUsuario;
import backenddmm20232.views.ManterUsuariosSistemas;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 

/**
 *
 * @author Aluno
 */
public class BackEndDmm20232 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if(ManterUsuario.validar()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario Inválido");            
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        int num;
      do{
        String msg = " 0 - Sair \n 1 - Usuario \n 2 - Sistema \n 3 - Pessoa \n 4 - UsuarioSistema \n 5 - Diretor \n 6 - Departamento \n 7 - DiretorDepartamento";
         num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch (num) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if (sair > 0) menu();
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterSistema.menu();
                break;
            case 3:
                ManterPessoaFisica.menu();
                break;
            case 4:
                ManterUsuariosSistemas.menu();
                break;
             case 5:
                ManterDiretor.menu();
                break;
            case 6:
                ManterDepartamento.menu();
                break;
            case 7:
                ManterDiretorDepartamento.menu();
                break;
            default:
                System.out.println("Opção inválido");
        }
      }while(num!= 0);
    
      }   
      
}

