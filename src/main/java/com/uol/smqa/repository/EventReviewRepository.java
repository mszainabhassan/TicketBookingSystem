package com.uol.smqa.repository;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventReview;
import com.uol.smqa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EventReviewRepository extends JpaRepository<EventReview, Integer> {

	List<EventReview> findByEvent(Event event);

}
