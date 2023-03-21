package br.com.fiap.entity;

import java.util.Objects;

import br.com.fiap.enuns.Genero;
import br.com.fiap.records.DadosAtualizacaoCatalogo;
import br.com.fiap.records.DadosCadastroCatalogo;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "catalogo")
@Entity(name = "Filmes")
public class CatalogoFilmes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String titulo;
	private String ator_principal;
	private String duracao;
	private String ano_lancamento;
	private String pais_origem;

	@Enumerated(EnumType.STRING)
	private Genero genero;
	@Embedded
	private FichaTecnica ficha_tecnica;
	

	public void atualizarInformocoes(DadosAtualizacaoCatalogo dados) {
		if (dados.titulo() != null) {
			this.titulo = dados.titulo();
		}
		if (dados.ator_principal() != null) {
			this.ator_principal = dados.ator_principal();
		}
		if (dados.duracao() != null) {
			this.duracao = dados.duracao();

		}
		if (dados.ano_lancamento() != null) {
			this.ano_lancamento = dados.ano_lancamento();
		}
		if (dados.pais_origem() != null) {
			this.pais_origem = dados.pais_origem();
		}
		if (dados.genero() != null) {
			this.genero = dados.genero();
		}
		if (dados.ficha_tecnica() != null) {
			this.ficha_tecnica = dados.ficha_tecnica();
		}
	}

	// construtor vazio
	public CatalogoFilmes() {

	}

	// construto com passagem de parametro
	public CatalogoFilmes(DadosCadastroCatalogo dados) {
		this.titulo = dados.titulo();
		this.ator_principal = dados.ator_principal();
		this.duracao = dados.duracao();
		this.ano_lancamento = dados.ano_lancamento();
		this.pais_origem = dados.pais_origem();
		this.genero = dados.genero();
		//this.ficha_tecnica = new FichaTecnica(dados.ficha_tecnica());
	}

	// getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAtor_principal() {
		return ator_principal;
	}

	public void setAtor_principal(String ator_principal) {
		this.ator_principal = ator_principal;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(String ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public String getPais_origem() {
		return pais_origem;
	}

	public void setPais_origem(String pais_origem) {
		this.pais_origem = pais_origem;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public FichaTecnica getFicha_tecnica() {
		return ficha_tecnica;
	}

	public void setFicha_tecnica(FichaTecnica ficha_tecnica) {
		this.ficha_tecnica = ficha_tecnica;
	}

	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(ano_lancamento, ator_principal, duracao, ficha_tecnica, genero, pais_origem, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatalogoFilmes other = (CatalogoFilmes) obj;
		return Objects.equals(ano_lancamento, other.ano_lancamento)
				&& Objects.equals(ator_principal, other.ator_principal) && Objects.equals(duracao, other.duracao)
				&& Objects.equals(ficha_tecnica, other.ficha_tecnica) && genero == other.genero
				&& Objects.equals(pais_origem, other.pais_origem) && Objects.equals(titulo, other.titulo);
	}

	// metodo to string
	@Override
	public String toString() {
		return "CatalogoFilmes [titulo=" + titulo + ", ator_principal=" + ator_principal + ", duracao=" + duracao
				+ ", ano_lancamento=" + ano_lancamento + ", pais_origem=" + pais_origem + ", genero=" + genero
				+ ", ficha_tecnica=" + ficha_tecnica + "]";
	}

}