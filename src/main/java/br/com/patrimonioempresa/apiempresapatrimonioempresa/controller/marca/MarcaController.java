package br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca;


import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.dto.MarcaDto;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.controller.marca.form.MarcaForm;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.service.marca.MarcaService;

@RestController
@RequestMapping("/v1/marca")
public class MarcaController implements MarcaApi {
	

private MarcaService marcaService;

public MarcaController(MarcaService marcaService) {
	this.marcaService = marcaService;
}


@GetMapping
@ResponseStatus(value = HttpStatus.OK)
public ResponseEntity<List<MarcaDto>> findAll() {
	List<Marca> listMarca = this.marcaService.findAll();
	List<MarcaDto> listMarcaDto = listMarca.stream().map(m -> new MarcaDto(m)).collect(Collectors.toList());
	return ResponseEntity.ok().body(listMarcaDto);
}

@GetMapping("/{marcaId}")
@Override
public ResponseEntity<MarcaDto> findById(Integer marcaId) {
	Marca marca = marcaService.findById(marcaId);
	if(marca != null)
	return ResponseEntity.ok().body(new MarcaDto(marca));
	return ResponseEntity.notFound().build();
	
}

@PutMapping("/{marcaId}")
@Override
@Transactional
public ResponseEntity<MarcaDto> update(Integer marcaId, MarcaForm marcaForm) {
	Marca marca = marcaService.update(marcaId, marcaForm.toMarca());
	if (marca != null)
		return ResponseEntity.ok(new MarcaDto(marca));
	return ResponseEntity.noContent().build();
}

@DeleteMapping("/{marcaId}")
@Transactional
public ResponseEntity<Void> delete(Integer marcaId) {
	Marca marca = marcaService.findById(marcaId);
	if(marca != null) {
		marcaService.delete(marcaId);
		return ResponseEntity.noContent().build();
	}
	return ResponseEntity.notFound().build();
}

@Override
@PostMapping
@Transactional
public ResponseEntity<MarcaDto> save(MarcaForm marcaForm, UriComponentsBuilder uriBuilder) {
	Marca marca = marcaService.save(marcaForm.toMarca());
	URI uri = uriBuilder.path("/marca/{marcaId}").buildAndExpand(marca.getId()).toUri();
	return ResponseEntity.created(uri).body(new MarcaDto(marca));
}

}
