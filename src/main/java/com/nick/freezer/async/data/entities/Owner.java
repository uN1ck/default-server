package com.nick.freezer.async.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(catalog = "owner")
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Freezer> freezers;

    private String name;

    private String email;

    private String password;
}
