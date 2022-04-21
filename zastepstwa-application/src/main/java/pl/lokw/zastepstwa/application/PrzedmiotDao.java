package pl.lokw.zastepstwa.application;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import pl.lokw.zastepstwa.domain.Przedmiot;

@Repository
public interface PrzedmiotDao extends CrudRepository<Przedmiot, Integer> {

	@Transactional
	public List<Przedmiot> findAll();
        
        @Transactional
	public List<Przedmiot> findAll(Sort sort);

	//public void dodajNauczyciela(Nauczyciel nauczyciel);
	
	public Przedmiot getPrzedmiotById(Integer id);
	
}
