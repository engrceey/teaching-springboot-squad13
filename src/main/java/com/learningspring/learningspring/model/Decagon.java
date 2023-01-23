package com.learningspring.learningspring.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "decagon_tbl")
public class Decagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long decagonId;

    @Column(name = "deca_name")
    private String name;

    @Column(name = "deca_email")
    private String email;



    //Next Decadevs


}
