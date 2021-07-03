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
import java.util.List;

@Entity
@Table(name = "AUDI_SEAT")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seat extends Auditable{

    private String audiRow;
    private String seatNo;
    @ManyToOne
    private Auditorium auditorium;

    @OneToMany(mappedBy = "seat")
    private List<ShowSeat> showSeats;
}
