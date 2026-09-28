
package com.bruno_coutinho.hospital_api.repository;

import com.bruno_coutinho.hospital_api.entity.Convenio;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConvenioRepository extends JpaRepository <Convenio , Long> {
    
    Optional<Convenio> findByCnpj(String cnpj);
}
