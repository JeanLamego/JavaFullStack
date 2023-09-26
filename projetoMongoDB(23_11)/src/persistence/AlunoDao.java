package persistence;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import adapter.AlunoAdapter;
import entity.Aluno;

public class AlunoDao extends Dao {

	public static final String COLECAOALUNO = "aluno";

	public void save(Aluno a) throws Exception {
		try {
			MongoCollection<Document> coll = getDB().getCollection(COLECAOALUNO);
			coll.insertOne(AlunoAdapter.paraDocumentoSemID(a));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		close();
	}

	public List<Aluno> findAll() {
		MongoCursor<Document> doc = null;
		List<Aluno> lista = null;
		try {
			MongoCollection<Document> coll = getDB().getCollection(COLECAOALUNO);
			doc = coll.find().iterator();// iterar é listar
			 lista = new ArrayList<Aluno>();
			lista.clear();
			while (doc.hasNext()) {
				lista.add(AlunoAdapter.paraObjeto(doc.next()));
			}
			close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return lista;

	}
	public static void main(String[] args) {
		try {

			AlunoDao dao = new AlunoDao();
			Aluno a = new Aluno(10d,"gabigol","gabi@gol.com","m",100000d);
			
			dao.save(a);
			System.out.println("Gravei" + a.getNome());
			
			List<Aluno> lista = dao.findAll();
			
			for(Aluno res : lista) {
				System.out.println(res);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
