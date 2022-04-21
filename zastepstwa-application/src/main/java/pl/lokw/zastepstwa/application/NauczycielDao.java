package pl.lokw.zastepstwa.application;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.sql.DataSource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import java.sql.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import pl.lokw.zastepstwa.domain.Nauczyciel;

@Repository
public interface NauczycielDao extends CrudRepository<Nauczyciel, Integer> {

	@Transactional
	public List<Nauczyciel> findAll();
        
        @Transactional
	public List<Nauczyciel> findAll(Sort sort);

	public Nauczyciel save(Nauczyciel nauczyciel);
	
	public Nauczyciel getNauczycielById(Integer id);
	
}
