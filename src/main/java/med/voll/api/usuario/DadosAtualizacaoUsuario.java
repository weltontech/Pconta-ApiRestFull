package med.voll.api.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
		
		@NotNull
		Long id,
		String nome,
		String email,
		String nome_Mae,
		String nome_Pai,
		String senha,
		String cpf
		
		) {

}
