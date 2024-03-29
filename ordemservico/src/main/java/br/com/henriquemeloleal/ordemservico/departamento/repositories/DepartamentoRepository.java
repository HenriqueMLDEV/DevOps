package br.com.henriquemeloleal.ordemservico.departamento.repositories;

import br.com.henriquemeloleal.ordemservico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
