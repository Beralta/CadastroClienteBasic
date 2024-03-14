package br.com.beralta.dao;

import br.com.beralta.domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
