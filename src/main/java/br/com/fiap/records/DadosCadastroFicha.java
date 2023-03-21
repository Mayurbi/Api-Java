package br.com.fiap.records;

import br.com.fiap.enuns.ClassificacaoIndicativa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroFicha(
		@NotBlank
		String direcao,
		@NotBlank
		String elenco,
		@NotBlank
		String roteiro,
		@NotBlank
		String producao,
		@NotNull
		ClassificacaoIndicativa classificacao_indicativa
		) {

}
