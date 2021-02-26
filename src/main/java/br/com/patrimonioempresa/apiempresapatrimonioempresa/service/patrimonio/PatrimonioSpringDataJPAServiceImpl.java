package br.com.patrimonioempresa.apiempresapatrimonioempresa.service.patrimonio;

import java.util.List;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Patrimonio;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.service.marca.MarcaService;

public class PatrimonioSpringDataJPAServiceImpl implements PatrimonioService {

	
	private MarcaService marcaService;
	
	@Override
	public List<Patrimonio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patrimonio findById(Integer patrimonioId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patrimonio save(Integer marcaId, Patrimonio patrimonio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patrimonio update(Integer patrimonioId, Patrimonio patrimonioForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer patrimonioId) {
		// TODO Auto-generated method stub
		
	}

}
