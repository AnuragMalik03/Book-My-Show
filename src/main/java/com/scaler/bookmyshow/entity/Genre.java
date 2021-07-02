package com.scaler.bookmyshow.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GENRE")
public class Genre extends Auditable {
    private String name;
    private String description;

    @ManyToMany
    private List<Movie> movies= new ArrayList<>();
}
