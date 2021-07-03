package com.scaler.bookmyshow.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
@Getter
@Setter
public class User extends Auditable{

    private String name;
    private String emailId;
    private String mobile;
}
