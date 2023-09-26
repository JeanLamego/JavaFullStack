package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	AlunoRepository repository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		try {
//		
//			Aluno a = new Aluno(null,"carlos","java",7.,8.);
//			a.gerarMedia();
//			a.gerarSituacao();
//			repository.save(a);
//
//			Aluno b = new Aluno(null,"maria","csharp",6.,7.);
//			b.gerarMedia();
//			b.gerarSituacao();
//			repository.save(b);
//			
//			System.out.println("Dados gravados: " + repository.findAll());
//		
//		}catch(Exception ex) {
//			
//			System.out.println("Erro: " + ex.getMessage());
//			ex.printStackTrace();
//		}
	}
}
