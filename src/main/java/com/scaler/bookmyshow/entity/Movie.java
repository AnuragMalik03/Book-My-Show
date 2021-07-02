package com.scaler.bookmyshow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Movie can have multiple genere
 * */
@Entity
@Table(name = "MOVIE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie extends Auditable{

    private String name;
    private String language;
    private int duration;
    private String description;
    private String director;
    private Date releaseDate;

    @ManyToMany
    private List<Genre> genres = new ArrayList<>();

    @OneToMany(mappedBy = "movie")
    private List<MovieShow> shows;

}
