package com.uol.smqa.service;

import com.uol.smqa.model.EventReview;

import java.util.List;

public interface EventReviewService {
    List<EventReview> getAllEventsReviewsByOrganizer(int eventId, int organizerId);
}
