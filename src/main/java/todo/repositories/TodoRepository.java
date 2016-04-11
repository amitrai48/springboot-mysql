package todo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{
	
	public List<Todo> findAll();
	public Todo findOne(Long id);
	public Todo save(Todo todo);
	public void delete(Long id);

}
