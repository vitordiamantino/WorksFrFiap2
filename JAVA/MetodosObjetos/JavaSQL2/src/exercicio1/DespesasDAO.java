package exercicio1;

import java.sql.*;

public class DespesasDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public DespesasDAO(){
        this.connection = new Conexao().conectar();
    }

    public void inserir(Despesa despesa) {
        sql = "insert into java_despesas(descricao, valor, data, id_categoria)" +
                "values(?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, despesa.getDescricao());
            ps.setDouble(2, despesa.getValor());
            ps.setDate(3, Date.valueOf(despesa.getDataDespesa()));
            ps.setInt(4, despesa.getCategoria().getId());
            ps.execute();

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
