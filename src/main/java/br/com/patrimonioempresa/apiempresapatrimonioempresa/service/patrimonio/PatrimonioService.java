package br.com.patrimonioempresa.apiempresapatrimonioempresa.service.patrimonio;

import java.util.List;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Patrimonio;

public interface PatrimonioService {

	List<Patrimonio> findAll();
	Patrimonio findById(Integer patrimonioId);
	Patrimonio save(Integer marcaId, Patrimonio patrimonio);
	Patrimonio update (Integer patrimonioId, Patrimonio patrimonioForm);
	void delete(Integer patrimonioId);
}
