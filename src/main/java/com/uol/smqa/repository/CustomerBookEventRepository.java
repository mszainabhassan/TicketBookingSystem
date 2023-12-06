package com.uol.smqa.repository;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBookEventRepository extends JpaRepository<CustomerBookEvent, Long> {
    // Add custom query methods if needed
    List<CustomerBookEvent> findByCustomer(Customer customer);

    List<CustomerBookEvent> findByCustomerAndEvent(Customer customer, Event event);

    List<CustomerBookEvent> findByIsPriorityAndCustomer(Boolean isPriority, Customer customer);

}
