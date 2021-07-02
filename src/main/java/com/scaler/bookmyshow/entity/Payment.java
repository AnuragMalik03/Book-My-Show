package com.scaler.bookmyshow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "TRANSACTIONS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {
    @Id
    private String paymentRefId;
    private String paymentDate;
    private String paymentType;
    private String paymentGateway;
    private String status;
    private BigDecimal amount;
    @ManyToOne
    private Booking booking;
}
