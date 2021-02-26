package br.com.patrimonioempresa.apiempresapatrimonioempresa.service.marca;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;
import br.com.patrimonioempresa.apiempresapatrimonioempresa.repository.marca.MarcaRepository;


@Service
public class MarcaSpringDataJPAServiceImpl implements MarcaService {
	
	private MarcaRepository marcaRepository;
	
	public MarcaSpringDataJPAServiceImpl(MarcaRepository marcaRepository) {
		this.marcaRepository = marcaRepository;
	}
	
	@Override
	public List<Marca> findAll() {
		List<Marca> listMarca = this.marcaRepository.findAll();
		return listMarca;
	}

	@Override
	public Marca findById(Integer marcaID) {
		Marca marca = null;
		try {
			marca = this.marcaRepository.findById(marcaID)
					.orElseThrow(() -> new BusinessException(" A marca não existe"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return marca;
	}

	@Override
	public Marca save(Marca marca) {
		return this.marcaRepository.save(marca);
	}

	@Override
	public Marca update(Integer marcaId, Marca marcaByForm) {
		Marca marcaById = findById(marcaId);
		if(marcaById != null) {
		marcaById.updateMarca(marcaByForm);
		this.marcaRepository.save(marcaById);
		}
		return marcaById; 
	}

	@Override
	public void delete(Integer marcaId) {
		findById(marcaId);
		try {
			marcaRepository.deleteById(marcaId);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Não é possível excluir");
		}
		
	}

}
