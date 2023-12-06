package com.uol.smqa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity(name="event_reviews")
public class EventReview {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

    private int rating;

    @Column(name = "review_date")
    private LocalDateTime reviewDate;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonIgnoreProperties(value =  "organizer")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("organizer")
    private Users user;


    @OneToMany(mappedBy = "review")
    @JsonIgnoreProperties("review")
    private List<ReviewReply> repliesList = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


    public List<ReviewReply> getRepliesList() {
        return repliesList;
    }

    public void setRepliesList(List<ReviewReply> repliesList) {
        this.repliesList = repliesList;
    }

    public EventReview() {
    }
}





