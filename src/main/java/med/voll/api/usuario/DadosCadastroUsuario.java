package med.voll.api.usuario;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(
		
		@NotBlank
		String nome,
		
		@NotBlank
		String email,
		
		String nome_mae,
		
		String nome_pai,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String senha,
		
		@NotBlank
		@CPF
		String cpf
		
		) {

}
