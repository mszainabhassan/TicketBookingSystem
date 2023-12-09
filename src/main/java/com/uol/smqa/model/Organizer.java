package com.uol.smqa.model;
import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import com.uol.smqa.Enum.Gender;
import java.util.List;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uol.smqa.Enum.Gender;
@Entity
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id")
    private int organizerId;

    @OneToOne(mappedBy = "organizer", cascade = CascadeType.ALL)
    private Users users;

    @Column(name = "organizer_name", nullable = false)
    private String name;

    @Column(name = "organization_name", nullable = false)
    private String orgName;

    @Column(name = "organizer_email", nullable = false, unique = true)
    private String email;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    @Column(name = "registration_number", nullable = false)
    private String regNo;

    @OneToMany(mappedBy = "organizer")
    @JsonIgnoreProperties("organizer")
    public List<Event> events;

    public int getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @JsonIgnore
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }


    public Organizer(String name, String orgName, String email, LocalDate dob, Gender gender, String contactNumber, String regNo) {
        this.name = name;
        this.orgName = orgName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.regNo = regNo;
    }

    public Organizer(String name, String orgName, String email, LocalDate dob, Gender gender, String contactNumber, String regNo, Users user) {
        this.name = name;
        this.orgName = orgName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.regNo = regNo;
        this.users = user;
    }

    public Organizer() {
    }
}




