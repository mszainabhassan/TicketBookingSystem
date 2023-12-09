package com.uol.smqa.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
public class PasswordResetHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt = Timestamp.from(Instant.now());

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt = Timestamp.from(Instant.now());


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PasswordResetHistory() {
    }

    public PasswordResetHistory(Users users) {
        this.users = users;
    }
}
