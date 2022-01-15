package com.tiagodesenvolvedor.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagodesenvolvedor.dsmovie.entities.Score;
import com.tiagodesenvolvedor.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
