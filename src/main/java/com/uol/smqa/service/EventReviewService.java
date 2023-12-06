package com.uol.smqa.service;

import com.uol.smqa.model.EventReview;
import com.uol.smqa.model.ReviewReply;

import java.util.List;

public interface EventReviewService {
    List<EventReview> getAllEventsReviewsByOrganizer(int eventId, int organizerId);

    ReviewReply replyEventReviewsByOrganizer(int reviewId, ReviewReply reviewReply);
}
