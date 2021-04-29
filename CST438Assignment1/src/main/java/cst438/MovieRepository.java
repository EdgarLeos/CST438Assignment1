package cst438;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository  extends CrudRepository<MovieRaitings, Long>{
	
	@Query("select m from MovieRaitings m order by movie_name, time desc")
	List<MovieRaitings> findAllMovieRatingsOrderByTitleDateDesc();

}
