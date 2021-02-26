package br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.dto;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;

public class MarcaDto {
	
	private Integer id;
	private String nome;

	public MarcaDto(Marca m) {
		this.id = m.getId();
		this.nome = m.getNome();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	

}
