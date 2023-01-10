package be.bstorm.akimts.mvc.service;

import be.bstorm.akimts.mvc.models.dtos.MovieDTO;

import java.util.List;

public interface MovieService {

    List<MovieDTO> getAll();

    MovieDTO getOne(Long id);

}
