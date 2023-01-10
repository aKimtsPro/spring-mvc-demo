package be.bstorm.akimts.mvc.service.impl;

import be.bstorm.akimts.mvc.mapper.MovieMapper;
import be.bstorm.akimts.mvc.models.dtos.MovieDTO;
import be.bstorm.akimts.mvc.repository.MovieRepository;
import be.bstorm.akimts.mvc.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;
    private final MovieMapper mapper;

    public MovieServiceImpl(MovieRepository repository, MovieMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<MovieDTO> getAll() {
        return repository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }

    @Override
    public MovieDTO getOne(Long id) {
        return repository.findById(id)
                .map( mapper::toDto )
                .orElseThrow( () -> new RuntimeException("movie not found") );
    }
}
