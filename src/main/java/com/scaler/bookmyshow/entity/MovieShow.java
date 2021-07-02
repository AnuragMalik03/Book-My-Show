package com.scaler.bookmyshow.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * MovieShow has duration from and to
 * Movie show has many bookings so manyToOne
 * Many MovieShow's happen in one Audi so ManyToOne
 * One Movie can have many shows ManyToOne
 **/
@Entity
@Table(name = "MOVIE_SHOW")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieShow extends Auditable{

    private Date timeFrom;
    private Date timeTo;

    @OneToMany(mappedBy = "show")
    private List<Booking> bookings = new ArrayList<>();

    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
}
