package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(service.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getSingleMovie(@PathVariable String imdbId) {
        Optional<Movie> movie = service.findMovieByImdbId(imdbId);

        // ✅ Return 404 if movie not found
        return movie.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }
}
