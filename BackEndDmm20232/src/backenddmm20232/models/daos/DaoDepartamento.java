/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.daos;

import backenddmm20232.models.beans.Departamento;
import backenddmm20232.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aninha04
 */
public class DaoDepartamento {
    private final Connection c;
    
    public DaoDepartamento() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }

    public Departamento excluir(Departamento depEnt) throws SQLException{
        String sql = "delete from departamento WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,depEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        return depEnt;
    }
    
    public Departamento buscar(Departamento depEnt) throws SQLException{
        String sql = "select * from departamento WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,depEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Departamento depSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                depSaida = new Departamento(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return depSaida;
   }

    public Departamento inserir(Departamento depEnt) throws SQLException{
        String sql = "insert into departamento" + " (nome, sigla, descricao)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,depEnt.getNome());
        stmt.setString(2,depEnt.getSigla());
        stmt.setString(3,depEnt.getDesc());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            depEnt.setId(id);
        }
        stmt.close();
        return depEnt;
    }

    public Departamento alterar(Departamento depEnt) throws SQLException{
        String sql = "UPDATE departamento SET nome = ?, sigla = ?, descricao = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,depEnt.getNome());
        stmt.setString(2,depEnt.getSigla());
        stmt.setString(3,depEnt.getDesc());
        stmt.setInt(4,depEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return depEnt;
    }

   public List<Departamento> listar(Departamento depEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Departamento> depart = new ArrayList<>();
        
        String sql = "select * from departamento where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + depEnt.getNome() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Departamento d = new Departamento(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)
            );
            // adiciona o usu à lista de usus
            depart.add(d);
        }
        
        rs.close();
        stmt.close();
        return depart;
   
   }
   
}
