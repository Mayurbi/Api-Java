package br.com.fiap.records;

import br.com.fiap.entity.FichaTecnica;
import br.com.fiap.enuns.Genero;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCatalogo(
		@NotNull
		String titulo,
		String ator_principal,
		String duracao,
		String ano_lancamento,
		String pais_origem,
		Genero genero,
		FichaTecnica ficha_tecnica	
		) {
}
