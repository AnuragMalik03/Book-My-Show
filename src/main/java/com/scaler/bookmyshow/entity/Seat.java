package com.scaler.bookmyshow.entity;

import com.scaler.bookmyshow.constants.SeatType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SEAT")
public class Seat extends Auditable{
    private SeatType type;
    private String row;
    private String seatNo;

    @ManyToOne
    private Auditorium auditorium;
}
