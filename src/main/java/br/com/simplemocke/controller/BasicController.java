package br.com.simplemocke.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.simplemocke.entity.Resultado;
import br.com.simplemocke.entity.RetornoEntity;
import br.com.simplemocke.repository.RetornoRepository;

@RestController
public class BasicController {
	
	@Autowired
	private RetornoRepository retornoRepository;

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	// public String sayHello(@RequestParam(name="name", required=false,
	// defaultValue="Stranger") String name) {
	public List<RetornoEntity> findAll(@RequestParam(name = "protocolo", required=false) String protocolo) {
		
		if(protocolo==null || protocolo.isEmpty())
			return retornoRepository.findAll();
		else return retornoRepository.findByProtocolo(protocolo);
	}

	@RequestMapping(value="/save/{protocolo}", method = RequestMethod.POST)
	public void insert(@PathVariable String protocolo, @RequestBody Resultado json) throws UnsupportedEncodingException {
		
		RetornoEntity retornoEntity = new RetornoEntity(protocolo, json.toString());
		retornoRepository.save(retornoEntity);
		retornoEntity.getProtocolo();
		
	}

	/*
	 * @RequestMapping(value = "/cursos/{id}", method = RequestMethod.GET) public
	 * ResponseEntity<Curso> buscar(@PathVariable("id") Integer id) { Curso curso =
	 * cursos.get(id);
	 * 
	 * if (curso == null) { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
	 * 
	 * return new ResponseEntity<Curso>(curso, HttpStatus.OK); }
	 */

}
