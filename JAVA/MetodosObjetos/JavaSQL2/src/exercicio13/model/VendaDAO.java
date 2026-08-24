package exercicio13.model;

import exercicio13.dao.GenericDAO;

import java.util.List;

public class VendaDAO implements GenericDAO<Venda, Integer> {
    @Override
    public void inserir(Venda entidade) {

    }

    @Override
    public List<Venda> listar() {
        return List.of();
    }
}
