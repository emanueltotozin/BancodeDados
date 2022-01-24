package DAO;
import Model.Usuario;
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

public class UsuarioDAO {
    public void inserirUsuario(Usuario a)
    {
        try{
        String SQL="INSERT INTO emanuel_doliveira.usuario (email, aparelho, n_de_telefone, primeiro_nome, segundo_nome, data_de_nascimento) VALUES (?,?,?,?,?,?)"; 
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getEmail());
        comando.setString(2, a.getAparelho());
        comando.setString(3, a.getN_de_telefone());
        comando.setString(4, a.getPrimeiro_nome());
        comando.setString(5, a.getSegundo_nome());
        comando.setString(6, a.getData_de_nascimento());
        int retorno = comando.executeUpdate();
        if(retorno>0)
        {
            JOptionPane.showMessageDialog(null, "Usuario: "+a.getPrimeiro_nome()+" Cadastrado com Sucesso!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario: "+a.getPrimeiro_nome()+" Verifique os Logs");
        }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public List <Usuario> listaDeUsuarios(){
        try {
            String SQL="SELECT email, aparelho, n_de_telefone, primeiro_nome, segundo_nome, data_de_nascimento FROM emanuel_doliveira.usuario";
            List <Usuario>listaDeUsuarios=new ArrayList<Usuario>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Usuario atual = new Usuario();
                atual = this.pegaDados(resultado);
                listaDeUsuarios.add(atual);
            }
           
            return listaDeUsuarios;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
   
    private Usuario pegaDados(ResultSet resultado){
        try {
            Usuario atual=new Usuario();
            atual.setPrimeiro_nome(resultado.getString("primeiro_nome"));
            atual.setSegundo_nome(resultado.getString("segundo_nome"));
            atual.setAparelho(resultado.getString("aparelho"));
            atual.setEmail(resultado.getString("email"));
            atual.setData_de_nascimento(resultado.getString("data_de_nascimento"));
            atual.setN_de_telefone(resultado.getString("n_de_telefone"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
       
}