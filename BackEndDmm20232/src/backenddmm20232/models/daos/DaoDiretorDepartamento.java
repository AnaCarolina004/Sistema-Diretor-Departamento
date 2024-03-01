 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.daos;

import backenddmm20232.models.beans.DiretorDepartamento;
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
public class DaoDiretorDepartamento {
    private final Connection c;
    
    public DaoDiretorDepartamento() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }

    public DiretorDepartamento inserir(DiretorDepartamento dirDep) throws SQLException{
        String sql = "insert into diretordepartamento" + " (idDir, idDep, dataInicio, dataFim, nomeProj ,obs)" + " values (?,?,?,?,?,?)";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        // seta os valores
        stmt.setInt(1,dirDep.getIdDir());
        stmt.setInt(2,dirDep.getIdDep());
        stmt.setString(3,dirDep.getDataInicio());
        stmt.setString(4,dirDep.getDataFim());
        stmt.setString(5,dirDep.getNomeProj());
        stmt.setString(6,dirDep.getObs());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            dirDep.setId(id);
        }
        stmt.close();
        return dirDep;
    }

    public DiretorDepartamento alterar(DiretorDepartamento dirDep) throws SQLException{
        String sql = "UPDATE diretordepartamento SET idDir = ?, idDep = ?, dataInicio = ?, dataFim = ?, nomeProj = ?, obs = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,dirDep.getIdDir());
        stmt.setInt(2,dirDep.getIdDep());
        stmt.setString(3,dirDep.getDataInicio());
        stmt.setString(4,dirDep.getDataFim());
        stmt.setString(5,dirDep.getNomeProj());
        
        stmt.setString(6,dirDep.getObs());
        stmt.setInt(7,dirDep.getId());
        // executa
        stmt.execute();
        stmt.close();
        return dirDep;
    }

    public DiretorDepartamento buscar(DiretorDepartamento dirDep) throws SQLException{
        String sql = "select * from diretordepartamento WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,dirDep.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            DiretorDepartamento dirDepSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                dirDepSaida = new DiretorDepartamento(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                       rs.getString(7));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return dirDepSaida;

    }

    public DiretorDepartamento excluir(DiretorDepartamento dirDep) throws SQLException{
        String sql = "delete from diretordepartamento WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,dirDep.getId());
        // executa
        stmt.execute();
        stmt.close();
        return dirDep;

    }

    public List<DiretorDepartamento> listar(DiretorDepartamento dirDep) throws SQLException{
        // usus: array armazena a lista de registros

        List<DiretorDepartamento> direDepa = new ArrayList<>();
        
        String sql = "select * from diretordepartamento where id like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,  dirDep.getId());
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            DiretorDepartamento dd = new DiretorDepartamento(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7)
            );
            // adiciona o usu à lista de usus
            direDepa.add(dd);
        }
        
        rs.close();
        stmt.close();
        return direDepa;

    }
    
    
}
