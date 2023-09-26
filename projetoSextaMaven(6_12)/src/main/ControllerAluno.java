package main;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerAluno {
	
	@Autowired
	AlunoRepository repository;
	
	@GetMapping(value="index")
	public ResponseEntity <?> mostrar(){
		
		return ResponseEntity.ok("Bem Vindo ao Spring Boot");
	}
	
	@GetMapping(value="alunos")
	public ResponseEntity <?> listar(){
		
		try {
			
			List<Aluno> resp = repository.findAll();
			return ResponseEntity.ok(resp);
			
		}catch(Exception ex){
			
			return ResponseEntity.ok(Collections.EMPTY_LIST);
		}
	}
	
	@PostMapping(value="aluno", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <?> gravar(@RequestBody Aluno aluno){
		
		try {
			
			aluno.gerarMedia();
			aluno.gerarSituacao();
			
			Aluno resp = repository.save(aluno);
			
			return ResponseEntity.ok(resp);
			
		}catch(Exception ex){
			
			return new ResponseEntity<String>("Error: " + ex.getMessage(), HttpStatus.CONFLICT);
		}
	}
}
