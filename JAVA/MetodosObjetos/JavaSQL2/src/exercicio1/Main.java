package exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // testa a inserção da categoria
        /*CategoriaDAO categoriaDAO = new CategoriaDAO();
        exercicio1.Categoria categoria  = new exercicio1.Categoria("def");
        //categoriaDAO.inserir(categoria);

        // testa a listagem
        List<exercicio1.Categoria> lista = categoriaDAO.listar();
        for(exercicio1.Categoria c : lista) {
            System.out.print("ID: " + c.getId() + "  ");
            System.out.println("exercicio1.Categoria: " + c.getCategoria());
        }

        System.out.println(categoriaDAO.pesquisar(31));*/

        // testando a insrção na tabela java_despesa
        DespesaDAO despesaDAO = new DespesaDAO();
        Despesa despesa = new Despesa();
        despesa.setDescricao("camiseta");
        despesa.setValor(100.32);
        despesa.setDataDespesa(LocalDate.now());
        despesa.setCategoria(new Categoria(31));
        despesaDAO.inserir(despesa);




    }
}