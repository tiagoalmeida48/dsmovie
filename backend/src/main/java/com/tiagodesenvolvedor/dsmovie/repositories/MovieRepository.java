package com.tiagodesenvolvedor.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagodesenvolvedor.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
