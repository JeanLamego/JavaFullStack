package controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Produto;
import persistence.ProdutoDao;

@RestController
public class ProdutoController {

	@RequestMapping(value = "/produto", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Produto> findAll() {
		ProdutoDao dao = new ProdutoDao();
		return dao.findAll();
	}

	@RequestMapping(value = "/produto", method = RequestMethod.POST, 
			consumes = "application/json", 
			produces = "application/json")
	public @ResponseBody Produto create(@RequestBody Produto p) {
		try {
			ProdutoDao dao = new ProdutoDao();
			dao.create(p);
			return p;
		} catch (Exception ex) {
			return null;
		}
	}

}
