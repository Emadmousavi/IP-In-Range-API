package com.mahsan.springwebapi.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class IPInfoEntity {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 1000)
    private String startIP;
    @Column(length = 1000)
    private String endIP;
    @Column(length = 1000)
    private String country;
    @Column(length = 1000)
    private String latitude;
    @Column(length = 1000)
    private String longtitude;
    @Column(length = 1000)
    private String company;
    @Column
    private Date createDate;



}
