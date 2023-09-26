package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Produto;

public class ProdutoDao {
	Session session;
	Transaction transaction;
	Query query;

	public void create(Produto p) throws Exception {
		// abre o banco de uma vez
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(p); // grava o produto
		transaction.commit();
		session.clear();
		session.close();

	}

	public List<Produto> findAll() {
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("select p from Produto as p");
		List<Produto> resposta = query.list();
		session.clear();
		session.close();
		return resposta;

	}
	
	public static void main(String[] args) {
		try {
			ProdutoDao pd = new ProdutoDao();
			System.out.println(pd.findAll());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
