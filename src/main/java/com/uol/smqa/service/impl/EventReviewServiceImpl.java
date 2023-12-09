package com.uol.smqa.service.impl;

import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.*;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.EventReviewRepository;
import com.uol.smqa.repository.ReviewReplyRepository;
import com.uol.smqa.repository.UsersRepository;
import com.uol.smqa.service.EventReviewService;
import com.uol.smqa.service.OrganizerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventReviewServiceImpl implements EventReviewService  {


    private final EventRepository eventRepository;
    private final EventReviewRepository eventReviewRepository;
    private final OrganizerServiceInterface organizerService;
    private final ReviewReplyRepository reviewReplyRepository;
    private final UsersRepository usersRepository;


    @Autowired
    public EventReviewServiceImpl(OrganizerServiceInterface organizerService, EventRepository eventRepository,
                                  EventReviewRepository eventReviewRepository, ReviewReplyRepository reviewReplyRepository,
                                  UsersRepository usersRepository) {
        this.organizerService = organizerService;
        this.eventRepository = eventRepository;
        this.eventReviewRepository = eventReviewRepository;
        this.reviewReplyRepository = reviewReplyRepository;
        this.usersRepository = usersRepository;

    }

    public List<EventReview> getAllEventsReviewsByOrganizer(int eventId, int organizerId) {
        Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
        Event event = eventRepository.findByEventIdAndOrganizer(eventId, organizer).orElseThrow(() -> new ResourceNotFoundException("Event with id not found"));

        return eventReviewRepository.findByEvent(event);
    }

    @Override
    public ReviewReply replyEventReviewsByOrganizer(int reviewId, ReviewReply reviewReply) throws Exception {
        validateEventReviewReply(reviewId, reviewReply);
        return this.reviewReplyRepository.save(reviewReply);
    }


    @Override
    public ReviewReply editReplyEventReviewsByOrganizer(int reviewId, ReviewReply reviewReply) throws Exception {
        validateEditEventReviewReply(reviewReply);
        return this.reviewReplyRepository.save(reviewReply);
    }

    @Override
    public void deleteReplyEventReviewsByOrganizer(int replyId, int organizerId) {
        Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
        ReviewReply reviewReply = reviewReplyRepository.findById(replyId).orElseThrow(() -> new ResourceNotFoundException("Reply with id does not exist"));
        if (reviewReply.getUser() == null || reviewReply.getUser().getOrganizer() == null) {
            throw new BadRequestException("Invalid reply. Kindly check again");
        }
        if (reviewReply.getUser().getOrganizer() != organizer) throw new BadRequestException("You can not delete a reply that does not belong to you");
        reviewReplyRepository.delete(reviewReply);
    }

    private void validateEditEventReviewReply(ReviewReply reviewReply) {
        if (reviewReply.getId() == 0) {
            throw new BadRequestException("Please provide a valid reply id to edit");
        }
        validateEventReviewReply(reviewReply.getReview().getId(), reviewReply);
    }

    private void validateEventReviewReply(int reviewId, ReviewReply reviewReply) {
        eventReviewRepository.findById(reviewId).orElseThrow(() -> new ResourceNotFoundException("Event review id not found. Please specify a valid review in the request"));
        validateEventReviewReply(reviewReply);
    }

    private void validateEventReviewReply(ReviewReply reviewReply) {
        if (reviewReply.getUser() == null || reviewReply.getUser().getUserId() == 0) {
            throw new BadRequestException("Please provide a valid reply user");
        } else if (reviewReply.getReview() == null || reviewReply.getReview().getId() == 0) {
            throw new BadRequestException("Please provide a valid review");
        }
        eventReviewRepository.findById(reviewReply.getReview().getId()).orElseThrow(() -> new ResourceNotFoundException("Event review id not found. Please specify a valid review in the request"));
        Users user = usersRepository.findById(reviewReply.getUser().getUserId()).orElseThrow(() -> new ResourceNotFoundException("User with id does not exist"));
        if (user.getOrganizer() == null || user.getOrganizer().getOrganizerId() == 0) {
            throw new BadRequestException("Only organizers can reply to this review");
        }
        organizerService.findById(user.getOrganizer().getOrganizerId()).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
    }
}
