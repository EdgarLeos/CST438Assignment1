package cst438;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control {
	
	@Autowired
	MovieRepository movieRepository;
	
	
	@GetMapping("/movies")
	public String getAllMovies(Model model) {
		Iterable<MovieRaitings> movieRaitings = movieRepository.findAll();
		model.addAttribute("movieRaitings", movieRaitings);
		return "index";
	}
	
	@GetMapping("/movies/new")
	public String createMovie(Model model) {
		MovieRaitings movieRaitings = new MovieRaitings();
		model.addAttribute("movieRaitings", movieRaitings);
		return "movie_form";
	}
	
	@PostMapping("/movies")
	public String processMovieForm(@Valid MovieRaitings movieRaitings, BindingResult result, Model modle) {
		
		if(result.hasErrors()) {
			return "movie_form";
		}
		movieRepository.save(movieRaitings);
		return "index";
	}

}
