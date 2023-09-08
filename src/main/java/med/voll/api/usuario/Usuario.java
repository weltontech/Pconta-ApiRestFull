package med.voll.api.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	
}
