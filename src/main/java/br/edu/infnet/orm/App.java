package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.Fornecedor;
import br.edu.infnet.orm.modelo.persistencia.FornecedorDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		IDAO dao = new ClienteDAO();
//		Cliente cliente = new Cliente("Mg" + "anuel Santos");
//		cliente.setContatos(new ArrayList<>());
//		cliente.getContatos().add(new Contato(TipoContato.EMAIL, "pjoa@gmail.com"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "3223235435"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "32324423423"));
//    	
//		dao.salvar(cliente);
//    	
//    	List<Cliente> clientes = dao.listaTodos();
//    	System.out.println(clientes);

//    	
//    	for (Cliente cliente : clientes) {
//			System.out.println(cliente.getContatos());
//		}
//    	
		
		//ProdutoDAO dao = new ProdutoDAO();
		//Produto produto;
		/*Produto produto = new Produto();
		produto.setCodigo(10);
		produto.setNome("Suco de Laranja");
		produto.setValor(12);
		dao.incluir(produto);*/
		//produto = dao.buscarPeloId(1l);
		//System.out.println(produto);
		//List<Produto> listaTodos = dao.listaTodos();
		//System.out.println(listaTodos);
		
//		Sobremesa sobremesa = new Sobremesa();
//		sobremesa.setCodigo(54345);
//		sobremesa.setDoce(true);
//		sobremesa.setInformacao("Icecream");
//		sobremesa.setQuantidade(2);
//		sobremesa.setValor(15);
//		sobremesa.setNome("Sorvete");
		
		/*Comida comida = new Comida();
		comida.setCodigo(98);
		comida.setNome("Bife");
		comida.setVegano(true);
		
		dao.salvar(comida);*/


		IDAO dao = new FornecedorDAO();
		Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", "031.897.349-92", "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");

		dao.incluir(fornecedor);
	}
}
