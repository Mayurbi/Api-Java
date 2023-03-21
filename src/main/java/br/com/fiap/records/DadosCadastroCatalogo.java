package br.com.fiap.records;


import br.com.fiap.entity.FichaTecnica;
import br.com.fiap.enuns.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCatalogo(
		@NotBlank
		String titulo,
		@NotBlank
		String ator_principal,
		@NotBlank
		@Pattern(regexp = "[0-9]{2-3}")
		String duracao,
		@NotBlank
		@Pattern(regexp = "[0-9]{4}")
		String ano_lancamento,
		@NotBlank
		String pais_origem,
		@NotNull
		Genero genero,
		@NotNull
		@Valid
		FichaTecnica ficha_tecnica
		) {

}
