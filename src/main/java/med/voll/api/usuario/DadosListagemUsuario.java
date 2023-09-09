package med.voll.api.usuario;

public record DadosListagemUsuario(String nome, String email) {

	
	public DadosListagemUsuario(Usuario usuario) {
		 this(usuario.getNome(), usuario.getEmail());
	}
}


