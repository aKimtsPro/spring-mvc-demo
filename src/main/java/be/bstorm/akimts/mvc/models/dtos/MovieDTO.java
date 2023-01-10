package be.bstorm.akimts.mvc.models.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MovieDTO {

    private Long id;
    private String title;
    private int duration;
    private String country;
    private List<String> directors;
    private List<String> genres;
    private List<String> actorsNames;

}
