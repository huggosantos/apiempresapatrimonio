package br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.dto.MarcaDto;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.form.MarcaForm;

public interface MarcaApi {
	
	ResponseEntity<List<MarcaDto>> findAll();

	ResponseEntity<MarcaDto> findById(@PathVariable Integer marcaId);

	ResponseEntity<MarcaDto> save(@Validated @RequestBody MarcaForm marcaForm, UriComponentsBuilder uriBuilder);

	ResponseEntity<MarcaDto> update(@PathVariable Integer marcaId, @RequestBody @Validated MarcaForm marcaForm);

	ResponseEntity<Void> delete(@PathVariable Integer marcaId);

}
