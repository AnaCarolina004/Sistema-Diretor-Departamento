/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.daos;

import backenddmm20232.models.beans.Diretor;
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
public class DaoDiretor {
    private final Connection c;
    public DaoDiretor() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }
 
    public Diretor inserir(Diretor dirEnt) throws SQLException {
        String sql = "insert into diretor" + " (idPes, area, graduacao)" + " values (?,?,?)";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
 
        // seta os valores
        stmt.setInt(1,dirEnt.getIdPes());
        stmt.setString(2,dirEnt.getArea());
        stmt.setString(3,dirEnt.getGraduacao());
 
        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            dirEnt.setId(id);
        }
        stmt.close();
        return dirEnt;
    }
 
    public Diretor alterar(Diretor dirEnt) throws SQLException {
        String sql = "UPDATE diretor SET idPes = ?, area = ?, graduacao = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,dirEnt.getIdPes());
        stmt.setString(2,dirEnt.getArea());
        stmt.setString(3,dirEnt.getGraduacao());
        stmt.setInt(4,dirEnt.getId());
 
        // executa
        stmt.execute();
        stmt.close();
        return dirEnt;
    }
 
    public Diretor buscar(Diretor dirEnt) throws SQLException {
        String sql = "select * from diretor WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,dirEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Diretor dirSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                dirSaida = new Diretor(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return dirSaida;
    }
 
    public Diretor excluir(Diretor dirEnt) throws SQLException {
        String sql = "delete from diretor WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,dirEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        return dirEnt; 
    }
 
    public List<Diretor> listar(Diretor dirEnt) throws SQLException {
        List<Diretor> diretor = new ArrayList<>();
        String sql = "select * from diretor where area like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + dirEnt.getArea() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {      
            // criando o objeto Usuario
            Diretor d = new Diretor(
                rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getString(4)
            );
            // adiciona o usu à lista de usus
            diretor.add(d);
        }
        rs.close();
        stmt.close();
        return diretor;
    }
}
