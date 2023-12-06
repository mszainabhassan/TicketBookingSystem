package com.uol.smqa.repository;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventReview;
import com.uol.smqa.model.ReviewReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReviewReplyRepository extends JpaRepository<ReviewReply, Integer> {

}
