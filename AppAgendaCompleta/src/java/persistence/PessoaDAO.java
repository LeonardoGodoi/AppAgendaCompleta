/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import bean.Pessoa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leogodoi
 */
public class PessoaDAO {

    private String sql;

    public boolean incluir(Pessoa pessoa) {
        boolean isOk = false;

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = null;

        if (conn == null) {
            return isOk;
        }

        sql = "INSERT INTO pessoa (nome, email, telefone, endereco) VALUES(?,?,?,?);";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getTelefone());
            ps.setString(4, pessoa.getEndereco());
            ps.executeUpdate();
            isOk = true;

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, ps);
        }

        return isOk;

    }
    public boolean alterar(Pessoa pessoa) {
        boolean isOk = false;

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = null;

        if (conn == null) {
            return isOk;
        }

        sql = "UPDATE pessoa SET nome=?, email=?, telefone=?, endereco=? "
               + "WHERE id=?;";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getTelefone());
            ps.setString(4, pessoa.getEndereco());
            ps.setInt(5, pessoa.getId());
            ps.executeUpdate();
            isOk = true;

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, ps);
        }

        return isOk;

    }
    public boolean excluir(int id) {
        boolean isOk = false;

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = null;

        if (conn == null) {
            return isOk;
        }

        sql = "DELETE FROM pessoa WHERE id=?;";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            isOk = true;

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, ps);
        }

        return isOk;

    }
    public Pessoa getPessoa(int id) {
       Pessoa pessoa = null;
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (conn == null) {
            return pessoa;
        }

        sql = "SELECT * FROM pessoa ORDER BY id=?;";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEndereco(rs.getString("endereco"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, ps, rs);
        }

        return pessoa;

    }
    public List<Pessoa> getPessoa() {
        List<Pessoa> lstPessoa = null;
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (conn == null) {
            return lstPessoa;
        }

        sql = "SELECT * FROM pessoa ORDER BY nomE;";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            lstPessoa = new ArrayList<Pessoa>();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
              pessoa.setId(rs.getInt("id"));
              pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEndereco(rs.getString("endereco"));
                lstPessoa.add(pessoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, ps, rs);
        }

        return lstPessoa;

    }

}
