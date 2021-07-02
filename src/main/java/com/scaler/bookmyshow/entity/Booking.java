package com.scaler.bookmyshow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BOOKINGS")
@Getter
@Setter
public class Booking extends Auditable{



    private String status;
    private int totalSeats;
    private BigDecimal totalPrice;

    @ManyToOne
    private User UserId;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payment = new ArrayList<>();
    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> seat = new ArrayList<>();
    @ManyToOne
    private MovieShow show;

}
