package be.bstorm.akimts.mvc.mapper;

import be.bstorm.akimts.mvc.models.dtos.MovieDTO;
import be.bstorm.akimts.mvc.models.entities.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieDTO toDto(Movie entity){

        if( entity == null )
            return null;

        return MovieDTO.builder()
                .id( entity.getId() )
                .title( entity.getTitle() )
                .country( entity.getCountry() )
                .duration( entity.getDuration() )
                .directors( entity.getDirectors() )
                .genres(
                        entity.getGenres().stream()
                                .map(Enum::name)
                                .toList()
                )
                .actorsNames(
                        entity.getActors().stream()
                                .map( actor -> actor.getFirstName() + " " + actor.getLastName() )
                                .toList()
                )
                .build();

    }

}
