/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gustavo.creutzberg.dao;

import gustavo.creutzberg.modules.Veiculo;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author GUSTAVO
 */
public class VeiculoDAO extends DAO {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    public static List<Veiculo> listar() {
        Query q = criarQuery("SELECT c FROM Veiculo c ORDER BY c.id");
        List<Veiculo> l = q.getResultList();
        System.out.println("total: " + l.size());
        return l;
    }

    public static Object lerEstado(long id) {
        return ler(Veiculo.class, id);
    }
}
