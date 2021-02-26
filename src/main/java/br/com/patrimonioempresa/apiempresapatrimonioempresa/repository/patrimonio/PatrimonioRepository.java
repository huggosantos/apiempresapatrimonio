package br.com.patrimonioempresa.apiempresapatrimonioempresa.repository.patrimonio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.patrimonioempresa.apiempresapatrimonioempresa.modelo.Patrimonio;

@Repository 
public interface PatrimonioRepository extends JpaRepository<Patrimonio, Integer>  {

}
