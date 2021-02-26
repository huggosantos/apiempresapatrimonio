package br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.form;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;

public class MarcaForm {
	
	@NotEmpty
	@Length(min = 1)
	private String nome;

	public MarcaForm() {
	}

	public MarcaForm(Marca marca) {
		this.nome = marca.getNome();
	}

	public String getNome() {
		return nome;
	}

	public Marca toMarca() {

		return new Marca(this.getNome());
	}

}
