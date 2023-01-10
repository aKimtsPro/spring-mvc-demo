package be.bstorm.akimts.mvc.repository;

import be.bstorm.akimts.mvc.models.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findByDirectorsContains(String director);

}