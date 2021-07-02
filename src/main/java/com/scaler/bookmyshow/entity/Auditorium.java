package com.scaler.bookmyshow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "AUDITORIUM")
@Getter
@Setter
public class Auditorium extends Auditable{

    private String name;
    private int capacity;
    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seats = new ArrayList<>();
    @OneToMany(mappedBy = "auditorium")
    private List<MovieShow> show = new ArrayList<>();
    @ManyToOne
    private Theatre theatre;
}
