package med.voll.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.usuario.DadosAtualizacaoUsuario;
import med.voll.api.usuario.DadosCadastroUsuario;
import med.voll.api.usuario.DadosListagemUsuario;
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
	
	@GetMapping
	public Page<DadosListagemUsuario> listar(@PageableDefault Pageable paginacao){
		return repository.findAll(paginacao).map(DadosListagemUsuario::new);
	}
	
	@GetMapping("/{id}")
	public Optional<Object> listarPorId(@RequestBody Long id){
		return repository.findById(id).map(DadosListagemUsuario::new);
	}
	
	
	
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoUsuario dados) {
		//criado var do tipo Usuario, esta var recebe o usuario do Id passado
		Usuario usuario = repository.getReferenceById(dados.id());
		usuario.atualizarInformacoes(dados);
	}

}
