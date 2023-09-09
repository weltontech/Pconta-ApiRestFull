package med.voll.api.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table (name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String nome_Mae;
	private String nome_Pai;
	private String senha;
	private String cpf;
	
	
	public Usuario(DadosCadastroUsuario dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.nome_Mae = dados.nome_mae();
		this.nome_Pai = dados.nome_pai();
		this.senha = dados.senha();
		this.cpf = dados.cpf();
		
	}


	public void atualizarInformacoes(@Valid DadosAtualizacaoUsuario dados) {
		
		if(dados.nome() != null) {
			this.nome = dados.nome();
		}
		if(dados.email() != null) {
			this.email = dados.email();
		}
		if(dados.nome_Mae() != null) {
			this.nome_Mae = dados.nome_Mae();
		}
		if(dados.nome_Pai() != null) {
			this.nome_Pai = dados.nome_Pai();
		}
		if(dados.senha() != null) {
			this.senha = dados.senha();
		}
		if(dados.cpf() != null) {
			this.cpf = dados.cpf();
		}
		
		
		

		
	}
	
}
