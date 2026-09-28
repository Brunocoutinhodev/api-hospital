
package com.bruno_coutinho.hospital_api.service;

import com.bruno_coutinho.hospital_api.entity.Convenio;
import com.bruno_coutinho.hospital_api.repository.ConvenioRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvenioService {
    
    @Autowired
    private ConvenioRepository repository;
    
    public Convenio salvarConvenio (Convenio novoConvenio){
     if(repository.findByCnpj(novoConvenio.getCnpj()).isPresent()) {
      throw new IllegalArgumentException("Erro: Este CNPJ ja registrado!");
     }
     return repository.save(novoConvenio);
  }
     public List <Convenio> visualizarConvenios(){
         return repository.findAll();
     }
     
     public void deleteConvenio(Long id){
          repository.deleteById(id);
     }
     
     public Convenio atualizarConvenio(Long id,Convenio convenioAtualizado){
         Convenio convenio = repository.findById(id).orElseThrow(()->new EntityNotFoundException("Convenio não encontrado"));
         convenio.setCnpj(convenioAtualizado.getCnpj());
         convenio.setNome(convenioAtualizado.getNome());
         convenio.setTempoCarencia(convenioAtualizado.getTempoCarencia());
         
         return repository.save(convenio);
         
         
         
     }
}

    

