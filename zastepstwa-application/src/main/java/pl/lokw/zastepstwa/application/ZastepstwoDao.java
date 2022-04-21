package pl.lokw.zastepstwa.application;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.lokw.zastepstwa.domain.Zastepstwo;

@Repository
public interface ZastepstwoDao extends CrudRepository<Zastepstwo, Long> {

	@Transactional
	public List<Zastepstwo> findAll();
        
        @Transactional
	public List<Zastepstwo> findByData(java.sql.Date data);
        
        @Transactional
	public List<Zastepstwo> findByDataOrderByNauczycielNieobecnyAscGodzinaAsc(java.sql.Date data);

	public Zastepstwo save(Zastepstwo zastepstwo);
	
}
