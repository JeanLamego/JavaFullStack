package adapter;

import org.bson.Document;

import entity.Aluno;

public class AlunoAdapter {

	//Converto em Documento
	public static Document paraDocumentoSemID(Aluno a) {
		Document doc = new Document();
		doc.append("codigo", a.getCodigo());
		doc.append("nome", a.getNome());
		doc.append("email", a.getEmail());
		doc.append("sexo", a.getSexo());
		doc.append("salario", a.getSalario());
		return doc;
	}
	
	//PARA LER
	public static Aluno paraObjeto(Document doc) {
		Aluno a = new Aluno(doc.getObjectId("_id"),
				doc.getDouble("codigo"),
				doc.getString("nome"),
				doc.getString("email"),
				doc.getString("sexo"),
				doc.getDouble("salario")
				);
		return a;
	}
}
