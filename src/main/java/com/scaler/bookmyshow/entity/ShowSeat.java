package com.scaler.bookmyshow.entity;

import com.scaler.bookmyshow.constants.ShowSeatStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SHOW_SEAT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat extends Auditable{

    private ShowSeatStatus seatStatus = ShowSeatStatus.AVAILABLE;
    @ManyToOne
    private Booking booking;
    @ManyToOne
    private MovieShow show;
    @ManyToOne
    private Seat seat;

}
