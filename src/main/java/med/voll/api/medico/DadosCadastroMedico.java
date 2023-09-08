package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
		@NotBlank
		String nome, 
		
		@NotBlank
		@Email
		String email, 
		
		@NotBlank
		String telefone,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		
		@NotNull
		Especialidade especialidade, 
		
		@NotNull
		//A anotação Valid serve para dizer que tambem quero que seje validado as outras anotações que estão dentro desta classe.
		@Valid
		DadosEndereco endereco
		
		) {
	
}
