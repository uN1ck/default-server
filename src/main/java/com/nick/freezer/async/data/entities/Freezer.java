package com.nick.freezer.async.data.entities;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(catalog = "freezer")
public class Freezer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    private Owner owner;

    private String name;
}
