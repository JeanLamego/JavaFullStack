package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.Aluno;
import persistence.AlunoDao;


@Controller
public class AlunoController {
	
	//RESPONSE BODY É JSON
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public @ResponseBody List<Aluno> listar(){ 
//		ModelAndView mv = new ModelAndView("listar");
		try {
			return new AlunoDao().findAll();
		} catch (Exception ex) {
			return null;
		}
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView iniciar() {
		ModelAndView mv = new ModelAndView("sistema");
		try {
			mv.addObject("msgInicial","Bem vindo ao Spring");
			mv.addObject("lista", new AlunoDao().findAll());
			return mv;
		} catch (Exception ex) {
			return null;
		}}
		
		@RequestMapping(value="/gravar",method=RequestMethod.POST)
		public ModelAndView gravar(
				@RequestParam("codigo") String codigo,
				@RequestParam("nome") String nome,
				@RequestParam("email") String email,
				@RequestParam("sexo") String sexo,
				@RequestParam("salario") String salario
				) {
			ModelAndView mv = new ModelAndView("sistema");
			try {
				Aluno a = new Aluno(new Double(codigo),
					nome, email, sexo, new Double(salario));
			new AlunoDao().save(a);
			mv.addObject("lista", new AlunoDao().findAll());
			return mv;
			}catch (Exception ex) {
				return null;
			}
			
		
			
		}
	
	}


