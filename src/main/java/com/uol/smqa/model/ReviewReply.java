package com.uol.smqa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity(name="review_replies")
public class ReviewReply {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String replyText;

    @Column(name = "reply_date")
    private LocalDateTime replyDate;

    @ManyToOne
    @JoinColumn(name = "event_review_id")
    private EventReview review;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private boolean isOrganizerReply;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public LocalDateTime getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(LocalDateTime replyDate) {
        this.replyDate = replyDate;
    }

    public EventReview getReview() {
        return review;
    }

    public void setReview(EventReview review) {
        this.review = review;
    }


    public boolean isOrganizerReply() {
        return isOrganizerReply;
    }

    public void setOrganizerReply(boolean organizerReply) {
        isOrganizerReply = organizerReply;
    }

    public ReviewReply() {
    }


    public ReviewReply(String replyText, LocalDateTime replyDate, EventReview review, Users user, boolean isOrganizerReply) {
        this.replyText = replyText;
        this.replyDate = replyDate;
        this.review = review;
        this.user = user;
        this.isOrganizerReply = isOrganizerReply;
    }
}





