package com.uol.smqa.dtos.specifications;

import com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria;
import com.uol.smqa.model.Event;
import jakarta.persistence.criteria.Predicate;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.convert.QueryByExamplePredicateBuilder;
import org.springframework.data.jpa.domain.Specification;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class EventSpecification {

    public static Specification<Event> buildSearchPredicate(CustomerEventsFilterSearchCriteria searchCriteria) {
        return (root, query, builder) -> {
            final List<Predicate> allSearchPredicates = new ArrayList<>();

            if (Strings.isNotBlank(searchCriteria.getName())) {
                allSearchPredicates.add(builder.equal(root.get("eventName"), searchCriteria.getName()));
            }

            if (searchCriteria.getEventType() != null) {
                allSearchPredicates.add(builder.equal(root.get("eventType").get("typeName"), searchCriteria.getEventType()));
            }

            if (searchCriteria.getEventDate() != null) {
                Instant instant = Instant.ofEpochMilli(searchCriteria.getEventDate());
                LocalDate searchEventDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                allSearchPredicates.add(builder.equal(root.get("eventDateTime").as(LocalDate.class), searchEventDate));
            }

            if (Strings.isNotBlank(searchCriteria.getLocation())) {
                allSearchPredicates.add(builder.equal(root.get("eventLocation"), searchCriteria.getLocation()));
            }

            Predicate[] predicates = allSearchPredicates.toArray(new Predicate[0]);

            Predicate combinedPredicate = builder.and(predicates);
            query.orderBy(builder.desc(root.get("eventDateTime")));
            return combinedPredicate;
        };
    }
}
