package DAO;

import Model.jogo;
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

public class JogoDAO {
public void inserirJogo(jogo a)
    {
        try{
        String SQL="INSERT INTO emanuel_doliveira.jogo (nome_do_jogo, mobile_ou_pc, conheceu_onde, ano_do_jogo) VALUES (?,?,?,?)"; 
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getNome_jogo());
        comando.setString(2, a.getMobile_pc());
        comando.setString(3, a.getConheceu_aonde());
        comando.setDouble(4, a.getAno_do_jogo());
        int retorno = comando.executeUpdate();
        if(retorno>0)
        {
            JOptionPane.showMessageDialog(null, "Voce foi cadastrado no jogo: "+a.getNome_jogo()+"!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no jogo: "+a.getNome_jogo()+" Verifique os Logs");
        }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public List <jogo> ListaJogo(){
        try {
            String SQL="SELECT nome_do_jogo, mobile_ou_pc, conheceu_onde, ano_do_jogo FROM emanuel_doliveira.jogo";
            List <jogo>ListaJogo=new ArrayList<jogo>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                jogo atual = new jogo();
                atual = this.pegaDados(resultado);
                ListaJogo.add(atual);
            }
           
            return ListaJogo;
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
   
    private jogo pegaDados(ResultSet resultado){
        try {
            jogo atual=new jogo();
            atual.setNome_jogo(resultado.getString("nome_do_jogo"));
            atual.setMobile_pc(resultado.getString("mobile_ou_pc"));
            atual.setConheceu_aonde(resultado.getString("conheceu_onde"));
            atual.setAno_do_jogo(resultado.getInt("ano_do_jogo"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}

