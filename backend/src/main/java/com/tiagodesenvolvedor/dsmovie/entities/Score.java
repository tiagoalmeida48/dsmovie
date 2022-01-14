package com.tiagodesenvolvedor.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.tiagodesenvolvedor.dsmovie.entities.*;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePk id = new ScorePk();
    private Double value;

    public Score() {
    }

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public ScorePk getId() {
        return id;
    }

    public Score setId(ScorePk id) {
        this.id = id;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Score setValue(Double value) {
        this.value = value;
        return this;
    }
}
