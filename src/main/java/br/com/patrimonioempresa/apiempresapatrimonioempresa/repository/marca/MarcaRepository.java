package br.com.patrimonioempresa.apiempresapatrimonioempresa.repository.marca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Integer>{


}
