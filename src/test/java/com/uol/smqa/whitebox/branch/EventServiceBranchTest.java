package com.uol.smqa.whitebox.branch;

import com.uol.smqa.Enum.DiscountType;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.model.Discount;
import com.uol.smqa.model.Event;
import com.uol.smqa.service.EventService;
import com.uol.smqa.util.EventGenerator;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

public class EventServiceBranchTest extends TicketBookingSystemApplicationTests {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventGenerator eventGenerator;

    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void ComputeDiscountForFixedAmountAndEventFeeGreaterThanDiscount() {
        Event event = eventList.get(0);
        event.setEventFees(1000f);

        Discount discount = new Discount("000999888", 90f, DiscountType.FIXED_AMOUNT, event.getOrganizer(),  event);

        Float discountAmount = eventService.computeDiscountAmount(discount, event);
        Assertions.assertEquals(discount.getDiscountValue(), discountAmount);
    }


    @Test
    public void testShouldComputeDiscountForPercentageDiscount() {
        Event event = eventList.get(0);
        event.setEventFees(1000f);
        Discount discount = new Discount("100999888", 10f, DiscountType.PERCENTAGE, event.getOrganizer(),  event);

        Float discountAmount = eventService.computeDiscountAmount(discount, event);
        Assertions.assertEquals(discountAmount, (discount.getDiscountValue() /100.0f) * event.getEventFees());
    }
}
