package com.uol.smqa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "organizers")
public class Organizer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizerId")
    private int organizerId;


    @OneToMany(mappedBy = "organizer")
    public List<Event> events;


}
