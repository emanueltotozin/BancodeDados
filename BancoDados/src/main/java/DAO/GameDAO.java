
package DAO;

import Model.cadastro_Jogo;
import ConexaoServ.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class GameDAO {
     public void inserirGame(cadastro_Jogo a)
    {
        try{
        String SQL="INSERT INTO emanuel_doliveira.cadastro_game (nick, sexo, brasileiro, cpf, robo) VALUES (?,?,?,?,?)"; 
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getNick());
        comando.setString(2, a.getSexo());
        comando.setBoolean(3, a.isBrasileiro());
        comando.setString(4, a.getCpf());
        comando.setBoolean(5, a.isRobo());
        int retorno = comando.executeUpdate();
        if(retorno>0)
        {
            JOptionPane.showMessageDialog(null, "Nickname: "+a.getNick()+" Cadastrado com Sucesso!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario: "+a.getNick()+" Verifique os Logs");
        }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(GameDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public List <cadastro_Jogo> ListaGame(){
        try {
            String SQL="SELECT nick, sexo, brasileiro, cpf, robo FROM emanuel_doliveira.cadastro_game";
            List <cadastro_Jogo>ListaGame=new ArrayList<cadastro_Jogo>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                cadastro_Jogo atual = new cadastro_Jogo();
                atual = this.pegaDados(resultado);
                ListaGame.add(atual);
            }
           
            return ListaGame;
        } catch (SQLException ex) {
            Logger.getLogger(GameDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
   
    private cadastro_Jogo pegaDados(ResultSet resultado){
        try {
            cadastro_Jogo atual=new cadastro_Jogo();
            atual.setNick(resultado.getString("Nick"));
            atual.setSexo(resultado.getString("Sexo"));
            atual.setBrasileiro(resultado.getBoolean("Brasileiro"));
            atual.setCpf(resultado.getString("Cpf"));
            atual.setRobo(resultado.getBoolean("Robo"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(GameDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}

