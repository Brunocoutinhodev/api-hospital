
package com.bruno_coutinho.hospital_api.controller;

import com.bruno_coutinho.hospital_api.entity.Convenio;
import com.bruno_coutinho.hospital_api.service.ConvenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/convenios")
public class ConvenioController {
    
    @Autowired
    private ConvenioService service;
    
    @PostMapping
     public Convenio salvarConvenio (@RequestBody Convenio novoConvenio){
     return service.salvarConvenio(novoConvenio);
}
     @GetMapping
       public List <Convenio> visualizarConvenios(){
         return service.visualizarConvenios();  
       }
       
       @DeleteMapping ("/{id}")
         public void deleteConvenio(@PathVariable Long id){
          service.deleteConvenio(id);
     }
       
         @PutMapping ("/{id}")
       public Convenio atualizarConvenio(@PathVariable Long id,@RequestBody Convenio convenioAtualizado){
           return service.atualizarConvenio(id, convenioAtualizado);
       }

}
    

