package br.com.patrimonioempresa.apiempresapatrimonioempresa.service.marca;

import java.util.List;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;

public interface MarcaService {

	List<Marca> findAll();

	Marca findById(Integer marcaID);

	Marca save(Marca marca);

	Marca update(Integer marcaId, Marca marcaByForm);

	void delete(Integer marcaId);
}
