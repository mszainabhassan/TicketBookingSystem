package com.uol.smqa.repository;
import com.uol.smqa.model.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uol.smqa.model.Event;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
	Event findById(int eventId);

	List<Event> findAllByOrganizer(Organizer organizer);


	void deleteByEventIdAndOrganizer(int eventId, Organizer organizer);

	Optional<Event> findByEventIdAndOrganizer(int eventId, Organizer organizer);

}
