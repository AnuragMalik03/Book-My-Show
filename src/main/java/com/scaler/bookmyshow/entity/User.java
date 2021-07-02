package com.scaler.bookmyshow.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User extends Auditable{

    private String userName;
    private String email;
    private String mobile;
}
