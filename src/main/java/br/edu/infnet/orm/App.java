package br.edu.infnet.orm;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import br.edu.infnet.orm.modelo.entidade.Contato;
import br.edu.infnet.orm.modelo.entidade.TipoContato;
import br.edu.infnet.orm.modelo.persistencia.ClienteDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ClienteDAO dao = new ClienteDAO();
    	Cliente cliente = new Cliente("Mg"
    			+ "anuel Santos");
    	cliente.setContatos(new ArrayList<>());
    	cliente.getContatos().add(new Contato(TipoContato.EMAIL, "pjoa@gmail.com"));    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "3223235435"));
    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "32324423423"));
//    	
		dao.salvar(cliente);
//    	
//    	List<Cliente> clientes = dao.listaTodos();
//    	System.out.println(clientes);
    	
//    	
//    	for (Cliente cliente : clientes) {
//			System.out.println(cliente.getContatos());
//		}
//    	
    	
    	
    	
    	
    	
    }
}
