package pl.lokw.zastepstwa.application;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import pl.lokw.zastepstwa.domain.Godzina;

@Repository
public interface GodzinaDao extends CrudRepository<Godzina, Integer> {

	@Transactional
	public List<Godzina> findAll();
        
        @Transactional
	public List<Godzina> findAll(Sort sort);

	public Godzina save(Godzina godzina);
	
	public Godzina getGodzinaById(Integer id);
	
}
