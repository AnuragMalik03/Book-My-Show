package com.scaler.bookmyshow.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "AUDITORIUM")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium extends Auditable{

    private String hallName;
    private int capacity;
    private boolean hasAirConditioner;
    private boolean canHost3D;
    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seats = new ArrayList<>();
    @OneToMany(mappedBy = "auditorium")
    private List<MovieShow> show = new ArrayList<>();
    @ManyToOne
    private Theatre theatre;
}
