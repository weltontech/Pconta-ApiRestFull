package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.usuario.DadosCadastroUsuario;
import med.voll.api.usuario.Usuario;
import med.voll.api.usuario.UsuarioRepository;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping
	@Transactional
	//recebo os parametros do meu requestBody
	public void cadastrar(@RequestBody @Valid DadosCadastroUsuario  dados) {
		System.out.println(dados);
		repository.save(new Usuario(dados));
	}

}