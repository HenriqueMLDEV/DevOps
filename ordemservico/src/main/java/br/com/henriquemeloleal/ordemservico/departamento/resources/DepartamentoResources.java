package br.com.henriquemeloleal.ordemservico.departamento.resources;

import br.com.henriquemeloleal.ordemservico.departamento.domain.Departamento;
import br.com.henriquemeloleal.ordemservico.departamento.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoResources {
    @Autowired
    private DepartamentoService departamentoService;
    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
           var novoDepartamento = departamentoService.criarDepartamento(departamento);
            return new ResponseEntity<>(novoDepartamento, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamento(){
        var departamentos = departamentoService.listarDepartamento();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);

    }

    @DeleteMapping("/(idDepartamento)")
    public ResponseEntity<Void> deletarDepartamento
            (@PathVariable Integer idDepartamento){
        departamentoService.deletarDepartamento(idDepartamento);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
