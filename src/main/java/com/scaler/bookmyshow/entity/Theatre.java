package com.scaler.bookmyshow.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "THEATRE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Theatre extends Auditable{

    @Column(name = "NAME")
    private String name;
    @NotBlank
    private String address;
    private boolean hasParking;
    @ManyToOne
    private Address addressId;
    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> halls = new ArrayList<>();
}
