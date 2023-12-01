package com.uol.smqa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PasswordResetHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    @Builder.Default
    private Timestamp createdAt = Timestamp.from(Instant.now());

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    @Builder.Default
    private Timestamp updatedAt = Timestamp.from(Instant.now());

}
