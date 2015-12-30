package com.togosoft.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by VINCE on 30/12/2015.
 */
@Entity
public class TestEntity implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
}
