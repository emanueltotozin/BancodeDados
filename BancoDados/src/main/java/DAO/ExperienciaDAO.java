package DAO;

import Model.experiencia;
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

public class ExperienciaDAO {
 public void inserirxp(experiencia a)
    {
        try{
        String SQL="INSERT INTO emanuel_doliveira.experiencia (xp_com_jogo, media_tempo, satisfacao) VALUES (?,?,?)"; 
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getXp());
        comando.setString(2, a.getMedia_tempo());
        comando.setString(3, a.getSatisfacao());
        int retorno = comando.executeUpdate();
        if(retorno>0)
        {
            JOptionPane.showMessageDialog(null, "Obrigado pelo Feedback!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ou não :c algo deu errado, verifique os Logs");
        }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ExperienciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public List <experiencia> ListaExperiencia(){
        try {
            String SQL="SELECT xp_com_jogo, media_tempo, satisfacao FROM emanuel_doliveira.experiencia";
            List <experiencia>ListaExperiencia=new ArrayList<experiencia>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                experiencia atual = new experiencia();
                atual = this.pegaDados(resultado);
                ListaExperiencia.add(atual);
            }
           
            return ListaExperiencia;
        } catch (SQLException ex) {
            Logger.getLogger(ExperienciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
   
    private experiencia pegaDados(ResultSet resultado){
        try {
            experiencia atual=new experiencia();
            atual.setXp(resultado.getString("Xp"));
            atual.setMedia_tempo(resultado.getString("Media_Tempo"));
            atual.setSatisfacao(resultado.getString("Satisfacao"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(ExperienciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}   

