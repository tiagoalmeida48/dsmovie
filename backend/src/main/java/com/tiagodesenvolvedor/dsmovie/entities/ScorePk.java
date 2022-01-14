package com.tiagodesenvolvedor.dsmovie.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import com.tiagodesenvolvedor.dsmovie.entities.*;

@Embeddable
public class ScorePk implements Serializable {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public ScorePk() {
    }

    public Movie getMovie() {
        return movie;
    }

    public ScorePk setMovie(Movie movie) {
        this.movie = movie;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ScorePk setUser(User user) {
        this.user = user;
        return this;
    }
}
