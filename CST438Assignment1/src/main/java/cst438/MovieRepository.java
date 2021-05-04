package cst438;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository  extends CrudRepository<MovieRatings, Long>{
	
	@Query("select m from MovieRatings m order by movie_name, time desc")
	List<MovieRatings> findAllMovieRatingsOrderByTitleDateDesc();

}
