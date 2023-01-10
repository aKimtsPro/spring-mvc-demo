package be.bstorm.akimts.mvc.controller;

import be.bstorm.akimts.mvc.models.dtos.MovieDTO;
import be.bstorm.akimts.mvc.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    // GET - http://localhost:8080/movie
    //                            /movie/all
    @GetMapping({"","/all"})
    public String viewAll(Model model){
        List<MovieDTO> movies = service.getAll();
        model.addAttribute("movies", movies);
        return "movies/displayAll";
    }

}
