package br.com.fiap.records;

import br.com.fiap.entity.CatalogoFilmes;
import br.com.fiap.entity.FichaTecnica;
import br.com.fiap.enuns.Genero;

public record DadosListagemCatalogo(
		String titulo,
		String ator_principal,
		String duracao,
		String ano_lancamento,
		String pais_origem,
		Genero genero,
		FichaTecnica ficha_tecnica		
		) {
	
	public DadosListagemCatalogo(CatalogoFilmes catalogo) {
		this(
				catalogo.getTitulo(),
				catalogo.getAtor_principal(),
				catalogo.getDuracao(),
				catalogo.getAno_lancamento(),
				catalogo.getPais_origem(),
				catalogo.getGenero(),
				catalogo.getFicha_tecnica()		
				);
	}
}
