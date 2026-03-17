package br.edu.ifpr.dao.object;

import java.util.List;

import br.edu.ifpr.dao.Produto;

public class ObjectDAOLista implements ObjectDAO{
    private List<Object> objects;

    public ObjectDAOLista() {
        this.objects = new java.util.ArrayList<>();
    }

    @Override
    public void inserir(Object object) {
        objects.add(object);
    }

    @Override
    public List<Object> listar() {
        return objects;
    }

    @Override
    public Object buscarPorId(int id) {
        for (Object o : objects) {
            if (o instanceof Produto){
                Produto p = (Produto)o;
                if(p.getId() == id){
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public void remover(int id) {
        objects.removeIf(o -> {
            if (o instanceof Produto) {
                Produto p = (Produto) o;
                return p.getId() == id;
            }
            return false;
        });
    }

}
