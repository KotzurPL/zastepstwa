package pl.lokw.zastepstwa.application;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import pl.lokw.zastepstwa.domain.Klasa;

@Repository
public interface KlasaDao extends CrudRepository<Klasa, Integer> {

	@Transactional
	public List<Klasa> findAll();
        
        @Transactional
	public List<Klasa> findAll(Sort sort);

        public Klasa save(Klasa klasa);
        
	public Klasa getKlasaById(Integer id);
	
}
