import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.String str21 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) (-1), "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity24 = customerController6.validateEmail((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str21, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        com.uol.smqa.model.Customer customer16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.customerRegistration(customer16);
        java.lang.String str21 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        com.uol.smqa.model.Review review23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity24 = customerController6.updateReview((java.lang.Long) 1L, review23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str21, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.model.Review review20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity21 = customerController6.updateReview((java.lang.Long) (-1L), review20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.updateEvent(event10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList12 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.createEvent(event10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 100, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList14 = customerController6.getAllBookedEvents((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.Event event24 = null;
        java.lang.String str26 = adminController5.initiateEventCreation(event24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = adminController5.deleteEvent((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str26, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str8 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        com.uol.smqa.model.Customer customer13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.customerRegistration(customer13);
        java.lang.String str16 = customerController6.cancelBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) (short) 100, strMap20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList23 = customerController6.getEventReviews(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str8, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str12, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Tickets booked successfully!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList18 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str21 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        java.lang.String str24 = customerController6.updateCustomerDetails(100, strMap23);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str21, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str24, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (-1));
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) (byte) 10);
        com.uol.smqa.model.Customer customer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer21 = adminController5.CustomerRegistration(customer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = adminController5.ChangeOrganizerStatus((java.lang.Integer) (-1), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService26 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService27 = null;
        com.uol.smqa.service.WishListService wishListService28 = null;
        com.uol.smqa.service.EventService eventService29 = null;
        com.uol.smqa.repository.EventRepository eventRepository30 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository31 = null;
        com.uol.smqa.controller.CustomerController customerController32 = new com.uol.smqa.controller.CustomerController(customerService26, customerBookEventService27, wishListService28, eventService29, eventRepository30, reviewRepository31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController32.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity37 = customerController32.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 = customerController32.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity44 = customerController32.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController32.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        com.uol.smqa.service.CustomerService customerService49 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService50 = null;
        com.uol.smqa.service.WishListService wishListService51 = null;
        com.uol.smqa.service.EventService eventService52 = null;
        com.uol.smqa.repository.EventRepository eventRepository53 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository54 = null;
        com.uol.smqa.controller.CustomerController customerController55 = new com.uol.smqa.controller.CustomerController(customerService49, customerBookEventService50, wishListService51, eventService52, eventRepository53, reviewRepository54);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity57 = customerController55.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList58 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str59 = customerController55.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str60 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str61 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity64 = customerController6.validateEmail(0, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
        org.junit.Assert.assertNotNull(wildcardResponseEntity37);
        org.junit.Assert.assertNotNull(wildcardResponseEntity40);
        org.junit.Assert.assertNotNull(wildcardResponseEntity44);
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertNotNull(wildcardResponseEntity57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Tickets booked successfully!" + "'", str59, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Tickets booked successfully!" + "'", str60, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Tickets booked successfully!" + "'", str61, "Tickets booked successfully!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.transferTicket((java.lang.Long) 100L, 0, (int) (short) 10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = customerController6.transferTicket((java.lang.Long) 100L, (int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController6.cancelMembership((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertNotNull(wildcardResponseEntity32);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) '#');
        com.uol.smqa.model.Customer customer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer21 = adminController5.CustomerRegistration(customer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.updateEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        java.lang.String str14 = adminController5.initiateEventCreation(event12, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str14, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str12 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = customerController6.getClass();
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str12, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.cancelMembership(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.uol.smqa.service.PasswordResetService passwordResetService0 = null;
        com.uol.smqa.controller.PasswordResetController passwordResetController1 = new com.uol.smqa.controller.PasswordResetController(passwordResetService0);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO2 = null;
        org.springframework.validation.BindingResult bindingResult3 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity4 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO2, bindingResult3);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO5 = null;
        org.springframework.validation.BindingResult bindingResult6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO5, bindingResult6);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO8 = null;
        org.springframework.validation.BindingResult bindingResult9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO8, bindingResult9);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO11 = null;
        org.springframework.validation.BindingResult bindingResult12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO11, bindingResult12);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO14 = null;
        org.springframework.validation.BindingResult bindingResult15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO14, bindingResult15);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO17 = null;
        org.springframework.validation.BindingResult bindingResult18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO17, bindingResult18);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO20 = null;
        org.springframework.validation.BindingResult bindingResult21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO20, bindingResult21);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO23 = null;
        org.springframework.validation.BindingResult bindingResult24 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO23, bindingResult24);
        org.springframework.web.bind.WebDataBinder webDataBinder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            passwordResetController1.initBinder(webDataBinder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.web.bind.WebDataBinder.addValidators(org.springframework.validation.Validator[])\" because \"webDataBinder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity4);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        java.lang.String str21 = adminController5.initiateEventCreation(event19, (int) (short) 10);
        com.uol.smqa.model.Organizer organizer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer23 = adminController5.AdminOrganizerRegistration(organizer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str21, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.createEvent(event10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = adminController5.ChangeOrganizerStatus((java.lang.Integer) (-1), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = adminController5.deleteEvent((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = adminController5.deleteEvent((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 10, (int) ' ');
        java.lang.String str19 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Review review21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity22 = customerController6.createReview((java.lang.Integer) 0, review21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str19, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, 100, 1);
        java.lang.String str26 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        java.lang.String str29 = customerController6.updateCustomerDetails((int) '4', strMap28);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str26, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str29, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = adminController5.updateEvent(event16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = adminController5.deleteEvent((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = adminController5.deleteEvent((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity27 = customerController6.validateEmail((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService15 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService16 = null;
        com.uol.smqa.service.WishListService wishListService17 = null;
        com.uol.smqa.service.EventService eventService18 = null;
        com.uol.smqa.repository.EventRepository eventRepository19 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository20 = null;
        com.uol.smqa.controller.CustomerController customerController21 = new com.uol.smqa.controller.CustomerController(customerService15, customerBookEventService16, wishListService17, eventService18, eventRepository19, reviewRepository20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController21.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str34 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.lang.String str37 = customerController6.updateCustomerDetails((int) (byte) 10, strMap36);
        java.lang.String str39 = customerController6.getAnalytics((java.lang.Integer) 100);
        java.lang.String str41 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Tickets booked successfully!" + "'", str34, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str37, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str39, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str41, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = adminController5.deleteEvent((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (-1));
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) (byte) 10);
        com.uol.smqa.model.Organizer organizer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer21 = adminController5.AdminOrganizerRegistration(organizer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.lang.String str11 = customerController6.updateCustomerDetails((int) (short) 1, strMap10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity13 = customerController6.bookEvent(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str11, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        java.lang.String str25 = adminController5.initiateEventCreation(event23, (int) (short) 10);
        com.uol.smqa.model.Event event26 = null;
        java.lang.String str28 = adminController5.initiateEventCreation(event26, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = adminController5.deleteEventType((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str25, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str28, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 10, (int) ' ');
        java.lang.String str19 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Customer customer20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.customerRegistration(customer20);
        java.lang.String str25 = customerController6.provideEventRating((java.lang.Long) 100L, (java.lang.Integer) 100, "hi!");
        com.uol.smqa.model.CardDetails cardDetails27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.buyMembership((int) (byte) -1, cardDetails27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str19, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str25, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) 'a');
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = adminController5.ChangeEventStatus((java.lang.Integer) 10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) ' ', strMap18);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController6.transferTicket((java.lang.Long) 10L, (int) (short) 0, (int) (short) 10);
        java.lang.String str25 = customerController6.cancelBooking((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.cancelMembership((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str25, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService15 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService16 = null;
        com.uol.smqa.service.WishListService wishListService17 = null;
        com.uol.smqa.service.EventService eventService18 = null;
        com.uol.smqa.repository.EventRepository eventRepository19 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository20 = null;
        com.uol.smqa.controller.CustomerController customerController21 = new com.uol.smqa.controller.CustomerController(customerService15, customerBookEventService16, wishListService17, eventService18, eventRepository19, reviewRepository20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController21.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str34 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.lang.String str37 = customerController6.updateCustomerDetails((int) (byte) 10, strMap36);
        java.lang.String str39 = customerController6.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList41 = customerController6.getEventReviews((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Tickets booked successfully!" + "'", str34, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str37, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str39, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.updateEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.createEvent(event8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.deleteEventType((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Customer customer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer20 = adminController5.CustomerRegistration(customer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = adminController5.deleteEventType((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        java.lang.String str21 = adminController5.initiateEventCreation(event19, (int) (short) 10);
        com.uol.smqa.model.Event event22 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = adminController5.updateEvent(event22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str21, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str28 = customerController24.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService33 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService34 = null;
        com.uol.smqa.service.WishListService wishListService35 = null;
        com.uol.smqa.service.EventService eventService36 = null;
        com.uol.smqa.repository.EventRepository eventRepository37 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository38 = null;
        com.uol.smqa.controller.CustomerController customerController39 = new com.uol.smqa.controller.CustomerController(customerService33, customerBookEventService34, wishListService35, eventService36, eventRepository37, reviewRepository38);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController39.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str53 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity56 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str28, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Tickets booked successfully!" + "'", str53, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity56);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = adminController5.ChangeUserStatus((java.lang.Integer) 100, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 10, (int) ' ');
        java.lang.String str19 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer25 = customerController6.viewCustomerDetails((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str19, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        com.uol.smqa.service.CustomerService customerService25 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService26 = null;
        com.uol.smqa.service.WishListService wishListService27 = null;
        com.uol.smqa.service.EventService eventService28 = null;
        com.uol.smqa.repository.EventRepository eventRepository29 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository30 = null;
        com.uol.smqa.controller.CustomerController customerController31 = new com.uol.smqa.controller.CustomerController(customerService25, customerBookEventService26, wishListService27, eventService28, eventRepository29, reviewRepository30);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity33 = customerController31.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str35 = customerController31.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity37 = customerController31.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService38 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService39 = null;
        com.uol.smqa.service.WishListService wishListService40 = null;
        com.uol.smqa.service.EventService eventService41 = null;
        com.uol.smqa.repository.EventRepository eventRepository42 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository43 = null;
        com.uol.smqa.controller.CustomerController customerController44 = new com.uol.smqa.controller.CustomerController(customerService38, customerBookEventService39, wishListService40, eventService41, eventRepository42, reviewRepository43);
        com.uol.smqa.service.CustomerService customerService45 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService46 = null;
        com.uol.smqa.service.WishListService wishListService47 = null;
        com.uol.smqa.service.EventService eventService48 = null;
        com.uol.smqa.repository.EventRepository eventRepository49 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository50 = null;
        com.uol.smqa.controller.CustomerController customerController51 = new com.uol.smqa.controller.CustomerController(customerService45, customerBookEventService46, wishListService47, eventService48, eventRepository49, reviewRepository50);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity53 = customerController51.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList54 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str55 = customerController51.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList54);
        java.lang.String str56 = customerController44.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList54);
        java.lang.String str57 = customerController31.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList54);
        java.lang.String str58 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = customerController6.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str35, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity37);
        org.junit.Assert.assertNotNull(wildcardResponseEntity53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Tickets booked successfully!" + "'", str55, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Tickets booked successfully!" + "'", str56, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Tickets booked successfully!" + "'", str57, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Tickets booked successfully!" + "'", str58, "Tickets booked successfully!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.transferTicket((java.lang.Long) 1L, (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer15 = customerController6.viewCustomerDetails((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = adminController5.ChangeEventStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer26 = customerController6.viewCustomerDetails((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) ' ', strMap12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.lang.String str15 = customerController6.updateCustomerDetails((int) (byte) 0, strMap14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str15, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService25 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService26 = null;
        com.uol.smqa.service.WishListService wishListService27 = null;
        com.uol.smqa.service.EventService eventService28 = null;
        com.uol.smqa.repository.EventRepository eventRepository29 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository30 = null;
        com.uol.smqa.controller.CustomerController customerController31 = new com.uol.smqa.controller.CustomerController(customerService25, customerBookEventService26, wishListService27, eventService28, eventRepository29, reviewRepository30);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController31.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController31.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity39 = customerController31.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController31.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str54 = customerController6.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity56 = customerController6.deleteEventFromWishList((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity39);
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str54, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.transferTicket((java.lang.Long) (-1L), (-1), 1);
        java.lang.String str15 = customerController6.cancelBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList17 = customerController6.getCustomerWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.model.Review review20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity21 = customerController6.createReview((java.lang.Integer) 100, review20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) -1, strMap18);
        com.uol.smqa.model.Review review21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity22 = customerController6.updateReview((java.lang.Long) 0L, review21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (byte) 1, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) ' ', strMap15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str8 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        java.lang.String str14 = customerController6.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList15 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str8, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str12, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str14, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList19 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.Event event24 = null;
        java.lang.String str26 = adminController5.initiateEventCreation(event24, (int) (byte) 0);
        com.uol.smqa.model.EventType eventType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 = adminController5.updateEventType((java.lang.Long) 1L, eventType28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str26, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str21 = customerController6.getAnalytics((java.lang.Integer) 100);
        java.lang.String str23 = customerController6.getAnalytics((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str21, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str23, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 10, (int) '4');
        com.uol.smqa.service.CustomerService customerService16 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService17 = null;
        com.uol.smqa.service.WishListService wishListService18 = null;
        com.uol.smqa.service.EventService eventService19 = null;
        com.uol.smqa.repository.EventRepository eventRepository20 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository21 = null;
        com.uol.smqa.controller.CustomerController customerController22 = new com.uol.smqa.controller.CustomerController(customerService16, customerBookEventService17, wishListService18, eventService19, eventRepository20, reviewRepository21);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController22.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList25 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str26 = customerController22.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList25);
        java.lang.String str27 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 = customerController6.transferTicket((java.lang.Long) (-1L), 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer33 = customerController6.viewCustomerDetails((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Tickets booked successfully!" + "'", str26, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Tickets booked successfully!" + "'", str27, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity31);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.createEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, 100);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = adminController5.ChangeUserStatus((java.lang.Integer) 100, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList9 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = customerController6.PriortyTicketForEvent((java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        com.uol.smqa.model.Customer customer14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.customerRegistration(customer14);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        java.lang.String str18 = customerController6.updateCustomerDetails(100, strMap17);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        com.uol.smqa.model.Review review22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity23 = customerController6.createReview((java.lang.Integer) (-1), review22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str18, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.deleteEventType((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str28 = customerController24.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService33 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService34 = null;
        com.uol.smqa.service.WishListService wishListService35 = null;
        com.uol.smqa.service.EventService eventService36 = null;
        com.uol.smqa.repository.EventRepository eventRepository37 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository38 = null;
        com.uol.smqa.controller.CustomerController customerController39 = new com.uol.smqa.controller.CustomerController(customerService33, customerBookEventService34, wishListService35, eventService36, eventRepository37, reviewRepository38);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController39.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str53 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str55 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity59 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (short) 100, (int) (short) 10);
        java.lang.String str61 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str28, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Tickets booked successfully!" + "'", str53, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str55, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str61, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.transferTicket((java.lang.Long) 100L, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = customerController6.PriortyTicketForEvent((java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList15 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str8 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        com.uol.smqa.model.Customer customer13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.customerRegistration(customer13);
        java.lang.String str16 = customerController6.cancelBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController6.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str8, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str12, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList19 = customerController6.getAllBookedEvents(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str21 = customerController6.getAnalytics((java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        java.lang.String str26 = customerController6.updateCustomerDetails((int) ' ', strMap25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str21, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str26, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = adminController5.ChangeEventStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str14 = customerController6.getAnalytics((java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.transferTicket((java.lang.Long) 1L, (int) (short) 10, (int) ' ');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str14, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList23 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList12 = customerController6.getAllBookedEvents((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str10, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str28 = customerController24.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService33 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService34 = null;
        com.uol.smqa.service.WishListService wishListService35 = null;
        com.uol.smqa.service.EventService eventService36 = null;
        com.uol.smqa.repository.EventRepository eventRepository37 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository38 = null;
        com.uol.smqa.controller.CustomerController customerController39 = new com.uol.smqa.controller.CustomerController(customerService33, customerBookEventService34, wishListService35, eventService36, eventRepository37, reviewRepository38);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController39.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str53 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str55 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.lang.String str59 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str28, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Tickets booked successfully!" + "'", str53, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str55, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str59, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList14 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str13 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) ' ', strMap15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str13, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.deleteEventType((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList21 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (short) 10);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList19 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) (byte) 10, strMap20);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer23 = customerController6.viewCustomerDetails(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        com.uol.smqa.model.Customer customer13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.customerRegistration(customer13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList16 = customerController6.getEventReviews((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService26 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService27 = null;
        com.uol.smqa.service.WishListService wishListService28 = null;
        com.uol.smqa.service.EventService eventService29 = null;
        com.uol.smqa.repository.EventRepository eventRepository30 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository31 = null;
        com.uol.smqa.controller.CustomerController customerController32 = new com.uol.smqa.controller.CustomerController(customerService26, customerBookEventService27, wishListService28, eventService29, eventRepository30, reviewRepository31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController32.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity37 = customerController32.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 = customerController32.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity44 = customerController32.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController32.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        com.uol.smqa.service.CustomerService customerService49 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService50 = null;
        com.uol.smqa.service.WishListService wishListService51 = null;
        com.uol.smqa.service.EventService eventService52 = null;
        com.uol.smqa.repository.EventRepository eventRepository53 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository54 = null;
        com.uol.smqa.controller.CustomerController customerController55 = new com.uol.smqa.controller.CustomerController(customerService49, customerBookEventService50, wishListService51, eventService52, eventRepository53, reviewRepository54);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity57 = customerController55.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList58 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str59 = customerController55.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str60 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str61 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity64 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass65 = wildcardResponseEntity64.getClass();
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
        org.junit.Assert.assertNotNull(wildcardResponseEntity37);
        org.junit.Assert.assertNotNull(wildcardResponseEntity40);
        org.junit.Assert.assertNotNull(wildcardResponseEntity44);
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertNotNull(wildcardResponseEntity57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Tickets booked successfully!" + "'", str59, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Tickets booked successfully!" + "'", str60, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Tickets booked successfully!" + "'", str61, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Review review20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity21 = customerController6.createReview((java.lang.Integer) 1, review20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) (-1), "hi!");
        java.lang.String str18 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 100, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList20 = customerController6.getEventReviews((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str18, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, 1);
        com.uol.smqa.model.Customer customer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer13 = adminController5.CustomerRegistration(customer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (byte) 1, strMap12);
        com.uol.smqa.service.CustomerService customerService14 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService15 = null;
        com.uol.smqa.service.WishListService wishListService16 = null;
        com.uol.smqa.service.EventService eventService17 = null;
        com.uol.smqa.repository.EventRepository eventRepository18 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository19 = null;
        com.uol.smqa.controller.CustomerController customerController20 = new com.uol.smqa.controller.CustomerController(customerService14, customerBookEventService15, wishListService16, eventService17, eventRepository18, reviewRepository19);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController20.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str24 = customerController20.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController20.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService27 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService28 = null;
        com.uol.smqa.service.WishListService wishListService29 = null;
        com.uol.smqa.service.EventService eventService30 = null;
        com.uol.smqa.repository.EventRepository eventRepository31 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository32 = null;
        com.uol.smqa.controller.CustomerController customerController33 = new com.uol.smqa.controller.CustomerController(customerService27, customerBookEventService28, wishListService29, eventService30, eventRepository31, reviewRepository32);
        com.uol.smqa.service.CustomerService customerService34 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService35 = null;
        com.uol.smqa.service.WishListService wishListService36 = null;
        com.uol.smqa.service.EventService eventService37 = null;
        com.uol.smqa.repository.EventRepository eventRepository38 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository39 = null;
        com.uol.smqa.controller.CustomerController customerController40 = new com.uol.smqa.controller.CustomerController(customerService34, customerBookEventService35, wishListService36, eventService37, eventRepository38, reviewRepository39);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity42 = customerController40.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList43 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str44 = customerController40.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str45 = customerController33.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str46 = customerController20.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str47 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str49 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity52 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Tickets booked successfully!" + "'", str44, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Tickets booked successfully!" + "'", str45, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Tickets booked successfully!" + "'", str46, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str49, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity52);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) 'a');
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        com.uol.smqa.model.Event event22 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = adminController5.updateEvent(event22);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        com.uol.smqa.model.CardDetails cardDetails18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.buyMembership((int) (short) 10, cardDetails18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList13 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str14 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Tickets booked successfully!");
        com.uol.smqa.model.Customer customer21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.customerRegistration(customer21);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Tickets booked successfully!" + "'", str14, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.updateEvent(event6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList8 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.deleteEventFromWishList((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.deleteEventType((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        java.lang.String str25 = adminController5.initiateEventCreation(event23, (int) (short) 10);
        com.uol.smqa.model.Event event26 = null;
        java.lang.String str28 = adminController5.initiateEventCreation(event26, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = adminController5.ChangeEventStatus((java.lang.Integer) 10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str25, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str28, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        com.uol.smqa.model.Customer customer33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController6.customerRegistration(customer33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList36 = customerController6.getEventReviews((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = adminController5.ChangeEventStatus((java.lang.Integer) 100, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.deleteEventType((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) (-1), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.model.Review review18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity19 = customerController6.createReview((java.lang.Integer) 1, review18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.lang.String str15 = customerController6.updateCustomerDetails((int) (byte) -1, strMap14);
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str15, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        java.lang.String str16 = customerController6.cancelBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.deleteEventFromWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str27 = customerController6.cancelBooking((java.lang.Long) 10L);
        com.uol.smqa.model.Review review29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity30 = customerController6.createReview((java.lang.Integer) 1, review29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str27, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList26 = customerController6.getAllBookedEvents((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        com.uol.smqa.model.Review review19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.createReview((java.lang.Integer) (-1), review19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.EventType eventType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = adminController5.updateEventType((java.lang.Long) 0L, eventType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str28 = customerController24.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService33 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService34 = null;
        com.uol.smqa.service.WishListService wishListService35 = null;
        com.uol.smqa.service.EventService eventService36 = null;
        com.uol.smqa.repository.EventRepository eventRepository37 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository38 = null;
        com.uol.smqa.controller.CustomerController customerController39 = new com.uol.smqa.controller.CustomerController(customerService33, customerBookEventService34, wishListService35, eventService36, eventRepository37, reviewRepository38);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController39.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str53 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity57 = customerController6.transferTicket((java.lang.Long) 1L, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity60 = customerController6.validateEmail((int) 'a', "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str28, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Tickets booked successfully!" + "'", str53, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity57);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) '#');
        com.uol.smqa.model.EventType eventType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEventType((java.lang.Long) 0L, eventType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) 1, strMap18);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.deleteEventFromWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService15 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService16 = null;
        com.uol.smqa.service.WishListService wishListService17 = null;
        com.uol.smqa.service.EventService eventService18 = null;
        com.uol.smqa.repository.EventRepository eventRepository19 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository20 = null;
        com.uol.smqa.controller.CustomerController customerController21 = new com.uol.smqa.controller.CustomerController(customerService15, customerBookEventService16, wishListService17, eventService18, eventRepository19, reviewRepository20);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController21.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList24 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str25 = customerController21.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList24);
        java.lang.String str26 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList24);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        java.lang.String str29 = customerController6.updateCustomerDetails((int) (byte) 10, strMap28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList31 = customerController6.getEventReviews((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Tickets booked successfully!" + "'", str25, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Tickets booked successfully!" + "'", str26, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str29, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) 1, strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        java.lang.String str22 = customerController6.updateCustomerDetails((int) 'a', strMap21);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.transferTicket((java.lang.Long) 1L, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str22, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList18 = customerController6.getCustomerWishList((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, 100, 1);
        java.lang.String str28 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 100, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str28, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        java.lang.String str26 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.transferTicket((java.lang.Long) 1L, (int) 'a', 1);
        java.lang.String str32 = customerController6.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str36 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 100, "Failed to initiate event creation. Status: 500");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity38 = customerController6.cancelMembership((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str32, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str36, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService23 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService24 = null;
        com.uol.smqa.service.WishListService wishListService25 = null;
        com.uol.smqa.service.EventService eventService26 = null;
        com.uol.smqa.repository.EventRepository eventRepository27 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository28 = null;
        com.uol.smqa.controller.CustomerController customerController29 = new com.uol.smqa.controller.CustomerController(customerService23, customerBookEventService24, wishListService25, eventService26, eventRepository27, reviewRepository28);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = customerController29.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController29.customerRegistration(customer33);
        java.lang.String str38 = customerController29.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str40 = customerController29.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity42 = customerController29.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str46 = customerController29.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController29.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService49 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService50 = null;
        com.uol.smqa.service.WishListService wishListService51 = null;
        com.uol.smqa.service.EventService eventService52 = null;
        com.uol.smqa.repository.EventRepository eventRepository53 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository54 = null;
        com.uol.smqa.controller.CustomerController customerController55 = new com.uol.smqa.controller.CustomerController(customerService49, customerBookEventService50, wishListService51, eventService52, eventRepository53, reviewRepository54);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity58 = customerController55.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity60 = customerController55.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity63 = customerController55.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity67 = customerController55.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity71 = customerController55.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        com.uol.smqa.service.CustomerService customerService72 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService73 = null;
        com.uol.smqa.service.WishListService wishListService74 = null;
        com.uol.smqa.service.EventService eventService75 = null;
        com.uol.smqa.repository.EventRepository eventRepository76 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository77 = null;
        com.uol.smqa.controller.CustomerController customerController78 = new com.uol.smqa.controller.CustomerController(customerService72, customerBookEventService73, wishListService74, eventService75, eventRepository76, reviewRepository77);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity80 = customerController78.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList81 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str82 = customerController78.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList81);
        java.lang.String str83 = customerController55.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList81);
        java.lang.String str84 = customerController29.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList81);
        java.lang.String str85 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList81);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity87 = customerController6.cancelMembership((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity32);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str38, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str40, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str46, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertNotNull(wildcardResponseEntity58);
        org.junit.Assert.assertNotNull(wildcardResponseEntity60);
        org.junit.Assert.assertNotNull(wildcardResponseEntity63);
        org.junit.Assert.assertNotNull(wildcardResponseEntity67);
        org.junit.Assert.assertNotNull(wildcardResponseEntity71);
        org.junit.Assert.assertNotNull(wildcardResponseEntity80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Tickets booked successfully!" + "'", str82, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Tickets booked successfully!" + "'", str83, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Tickets booked successfully!" + "'", str84, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Tickets booked successfully!" + "'", str85, "Tickets booked successfully!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) 0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        java.lang.String str27 = customerController6.updateCustomerDetails((int) (short) -1, strMap26);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str27, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.updateEvent(event23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList25 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = adminController5.ChangeUserStatus((java.lang.Integer) 0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) (byte) 10);
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer32 = customerController6.viewCustomerDetails((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, 1);
        com.uol.smqa.model.Event event12 = null;
        java.lang.String str14 = adminController5.initiateEventCreation(event12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList15 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str14, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "Tickets booked successfully!");
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        com.uol.smqa.model.Customer customer33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController6.customerRegistration(customer33);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.lang.String str37 = customerController6.updateCustomerDetails((int) (byte) -1, strMap36);
        java.lang.String str39 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str41 = customerController6.getAnalytics((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str37, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str39, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str41, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.uol.smqa.service.PasswordResetService passwordResetService0 = null;
        com.uol.smqa.controller.PasswordResetController passwordResetController1 = new com.uol.smqa.controller.PasswordResetController(passwordResetService0);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO2 = null;
        org.springframework.validation.BindingResult bindingResult3 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity4 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO2, bindingResult3);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO5 = null;
        org.springframework.validation.BindingResult bindingResult6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO5, bindingResult6);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO8 = null;
        org.springframework.validation.BindingResult bindingResult9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO8, bindingResult9);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO11 = null;
        org.springframework.validation.BindingResult bindingResult12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO11, bindingResult12);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO14 = null;
        org.springframework.validation.BindingResult bindingResult15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO14, bindingResult15);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO17 = null;
        org.springframework.validation.BindingResult bindingResult18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO17, bindingResult18);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO20 = null;
        org.springframework.validation.BindingResult bindingResult21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO20, bindingResult21);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO23 = null;
        org.springframework.validation.BindingResult bindingResult24 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO23, bindingResult24);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO26 = null;
        org.springframework.validation.BindingResult bindingResult27 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO26, bindingResult27);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO29 = null;
        org.springframework.validation.BindingResult bindingResult30 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO29, bindingResult30);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO32 = null;
        org.springframework.validation.BindingResult bindingResult33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO32, bindingResult33);
        org.junit.Assert.assertNotNull(wildcardResponseEntity4);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertNotNull(wildcardResponseEntity31);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        com.uol.smqa.model.Customer customer33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController6.customerRegistration(customer33);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController6.acknowledgeBooking((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity14 = customerController6.validateEmail((int) '#', "Failed to initiate event creation. Status: 500");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.createEvent(event8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList10 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str27 = customerController6.cancelBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList32 = customerController6.getCustomerWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str27, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (byte) 1, strMap12);
        com.uol.smqa.model.Review review15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity16 = customerController6.updateReview((java.lang.Long) 1L, review15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList37 = customerController6.getAllBookedEvents((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        java.lang.String str25 = adminController5.initiateEventCreation(event23, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = adminController5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str25, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.Event event24 = null;
        java.lang.String str26 = adminController5.initiateEventCreation(event24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 0, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str26, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 10, (int) '4');
        com.uol.smqa.service.CustomerService customerService16 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService17 = null;
        com.uol.smqa.service.WishListService wishListService18 = null;
        com.uol.smqa.service.EventService eventService19 = null;
        com.uol.smqa.repository.EventRepository eventRepository20 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository21 = null;
        com.uol.smqa.controller.CustomerController customerController22 = new com.uol.smqa.controller.CustomerController(customerService16, customerBookEventService17, wishListService18, eventService19, eventRepository20, reviewRepository21);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController22.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList25 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str26 = customerController22.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList25);
        java.lang.String str27 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList29 = customerController6.getEventReviews((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Tickets booked successfully!" + "'", str26, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Tickets booked successfully!" + "'", str27, "Tickets booked successfully!");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 100L, (int) '4', 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str14 = customerController6.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.deleteEventFromWishList((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str14, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.updateEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.createEvent(event8);
        com.uol.smqa.model.EventType eventType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEventType((java.lang.Long) 0L, eventType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList13 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str14 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass17 = customerController6.getClass();
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Tickets booked successfully!" + "'", str14, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 10, (int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.transferTicket((java.lang.Long) 10L, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList20 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) -1, strMap18);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList21 = customerController6.getAllEvents(customerEventsFilterSearchCriteria20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) 'a');
        com.uol.smqa.model.Event event23 = null;
        java.lang.String str25 = adminController5.initiateEventCreation(event23, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList26 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str25, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 0);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.createEvent(event14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.createEvent(event23);
        com.uol.smqa.model.Event event25 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = adminController5.createEvent(event25);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = adminController5.deleteEventType((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList16 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList14 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Review review19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.createReview((java.lang.Integer) 0, review19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.createEvent(event23);
        com.uol.smqa.model.Event event25 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = adminController5.createEvent(event25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = adminController5.deleteEvent((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.createEvent(event23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList25 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, 100, 1);
        com.uol.smqa.model.Customer customer25 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.customerRegistration(customer25);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity28 = customerController6.bookEvent(strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = adminController5.deleteEvent((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.transferTicket((java.lang.Long) 0L, (int) (byte) 1, 0);
        java.lang.String str16 = customerController6.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer18 = customerController6.viewCustomerDetails((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str16, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.EventType eventType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.updateEventType((java.lang.Long) 0L, eventType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) (-1), "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList18 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController6.transferTicket((java.lang.Long) 10L, (int) (byte) 100, (int) (short) 1);
        com.uol.smqa.model.Customer customer21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.customerRegistration(customer21);
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.String str21 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) (-1), "hi!");
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 = customerController28.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity33 = customerController28.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController28.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 = customerController28.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity44 = customerController28.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity46 = customerController28.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService47 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService48 = null;
        com.uol.smqa.service.WishListService wishListService49 = null;
        com.uol.smqa.service.EventService eventService50 = null;
        com.uol.smqa.repository.EventRepository eventRepository51 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository52 = null;
        com.uol.smqa.controller.CustomerController customerController53 = new com.uol.smqa.controller.CustomerController(customerService47, customerBookEventService48, wishListService49, eventService50, eventRepository51, reviewRepository52);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity56 = customerController53.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity58 = customerController53.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity61 = customerController53.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService62 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService63 = null;
        com.uol.smqa.service.WishListService wishListService64 = null;
        com.uol.smqa.service.EventService eventService65 = null;
        com.uol.smqa.repository.EventRepository eventRepository66 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository67 = null;
        com.uol.smqa.controller.CustomerController customerController68 = new com.uol.smqa.controller.CustomerController(customerService62, customerBookEventService63, wishListService64, eventService65, eventRepository66, reviewRepository67);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity70 = customerController68.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList71 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str72 = customerController68.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList71);
        java.lang.String str73 = customerController53.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList71);
        java.lang.String str74 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList71);
        java.lang.String str75 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList71);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity78 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str21, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity31);
        org.junit.Assert.assertNotNull(wildcardResponseEntity33);
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity40);
        org.junit.Assert.assertNotNull(wildcardResponseEntity44);
        org.junit.Assert.assertNotNull(wildcardResponseEntity46);
        org.junit.Assert.assertNotNull(wildcardResponseEntity56);
        org.junit.Assert.assertNotNull(wildcardResponseEntity58);
        org.junit.Assert.assertNotNull(wildcardResponseEntity61);
        org.junit.Assert.assertNotNull(wildcardResponseEntity70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Tickets booked successfully!" + "'", str72, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Tickets booked successfully!" + "'", str73, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Tickets booked successfully!" + "'", str74, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Tickets booked successfully!" + "'", str75, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity78);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) (-1), "hi!");
        java.lang.String str18 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 100, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController6.cancelMembership((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str18, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.updateEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.createEvent(event14);
        com.uol.smqa.model.EventType eventType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEventType((java.lang.Long) 100L, eventType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str8 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.lang.String str15 = customerController6.updateCustomerDetails(0, strMap14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList16 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str8, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str12, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str15, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList21 = customerController6.getEventReviews((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) 100L, (java.lang.Integer) (-1), "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        java.lang.String str27 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str27, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = adminController5.deleteEvent((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.Event event24 = null;
        java.lang.String str26 = adminController5.initiateEventCreation(event24, (int) (byte) 0);
        com.uol.smqa.model.Customer customer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer28 = adminController5.CustomerRegistration(customer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str26, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Customer customer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer16 = adminController5.CustomerRegistration(customer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (-1));
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = adminController5.ChangeUserStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.transferTicket((java.lang.Long) 1L, (int) ' ', (int) (short) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails(1, strMap18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 = customerController26.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 = customerController26.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController26.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService35 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService36 = null;
        com.uol.smqa.service.WishListService wishListService37 = null;
        com.uol.smqa.service.EventService eventService38 = null;
        com.uol.smqa.repository.EventRepository eventRepository39 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository40 = null;
        com.uol.smqa.controller.CustomerController customerController41 = new com.uol.smqa.controller.CustomerController(customerService35, customerBookEventService36, wishListService37, eventService38, eventRepository39, reviewRepository40);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity43 = customerController41.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList44 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str45 = customerController41.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList44);
        java.lang.String str46 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList44);
        java.lang.String str47 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList44);
        java.lang.String str51 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 10, "");
        java.lang.String str55 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity59 = customerController6.transferTicket((java.lang.Long) 100L, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity29);
        org.junit.Assert.assertNotNull(wildcardResponseEntity31);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertNotNull(wildcardResponseEntity43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Tickets booked successfully!" + "'", str45, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Tickets booked successfully!" + "'", str46, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str51, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str55, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity59);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList18 = customerController6.getEventReviews((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService15 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService16 = null;
        com.uol.smqa.service.WishListService wishListService17 = null;
        com.uol.smqa.service.EventService eventService18 = null;
        com.uol.smqa.repository.EventRepository eventRepository19 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository20 = null;
        com.uol.smqa.controller.CustomerController customerController21 = new com.uol.smqa.controller.CustomerController(customerService15, customerBookEventService16, wishListService17, eventService18, eventRepository19, reviewRepository20);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController21.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList24 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str25 = customerController21.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList24);
        java.lang.String str26 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList24);
        java.lang.String str30 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 100, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList31 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Tickets booked successfully!" + "'", str25, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Tickets booked successfully!" + "'", str26, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str30, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService25 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService26 = null;
        com.uol.smqa.service.WishListService wishListService27 = null;
        com.uol.smqa.service.EventService eventService28 = null;
        com.uol.smqa.repository.EventRepository eventRepository29 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository30 = null;
        com.uol.smqa.controller.CustomerController customerController31 = new com.uol.smqa.controller.CustomerController(customerService25, customerBookEventService26, wishListService27, eventService28, eventRepository29, reviewRepository30);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController31.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController31.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity39 = customerController31.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str51 = customerController31.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str52 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        com.uol.smqa.model.Customer customer53 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity54 = customerController6.customerRegistration(customer53);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity39);
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Tickets booked successfully!" + "'", str51, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Tickets booked successfully!" + "'", str52, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity54);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.deleteEventType((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.updateEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.createEvent(event14);
        com.uol.smqa.model.Organizer organizer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer17 = adminController5.AdminOrganizerRegistration(organizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService17 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService18 = null;
        com.uol.smqa.service.WishListService wishListService19 = null;
        com.uol.smqa.service.EventService eventService20 = null;
        com.uol.smqa.repository.EventRepository eventRepository21 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository22 = null;
        com.uol.smqa.controller.CustomerController customerController23 = new com.uol.smqa.controller.CustomerController(customerService17, customerBookEventService18, wishListService19, eventService20, eventRepository21, reviewRepository22);
        java.lang.String str25 = customerController23.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.service.CustomerService customerService26 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService27 = null;
        com.uol.smqa.service.WishListService wishListService28 = null;
        com.uol.smqa.service.EventService eventService29 = null;
        com.uol.smqa.repository.EventRepository eventRepository30 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository31 = null;
        com.uol.smqa.controller.CustomerController customerController32 = new com.uol.smqa.controller.CustomerController(customerService26, customerBookEventService27, wishListService28, eventService29, eventRepository30, reviewRepository31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController32.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList35 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str36 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList35);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity38 = customerController32.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList39 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str40 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        java.lang.String str41 = customerController23.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        java.lang.String str42 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        com.uol.smqa.service.CustomerService customerService43 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService44 = null;
        com.uol.smqa.service.WishListService wishListService45 = null;
        com.uol.smqa.service.EventService eventService46 = null;
        com.uol.smqa.repository.EventRepository eventRepository47 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository48 = null;
        com.uol.smqa.controller.CustomerController customerController49 = new com.uol.smqa.controller.CustomerController(customerService43, customerBookEventService44, wishListService45, eventService46, eventRepository47, reviewRepository48);
        java.lang.String str51 = customerController49.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.service.CustomerService customerService52 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService53 = null;
        com.uol.smqa.service.WishListService wishListService54 = null;
        com.uol.smqa.service.EventService eventService55 = null;
        com.uol.smqa.repository.EventRepository eventRepository56 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository57 = null;
        com.uol.smqa.controller.CustomerController customerController58 = new com.uol.smqa.controller.CustomerController(customerService52, customerBookEventService53, wishListService54, eventService55, eventRepository56, reviewRepository57);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity60 = customerController58.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList61 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str62 = customerController58.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList61);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity64 = customerController58.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList65 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str66 = customerController58.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str67 = customerController49.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str68 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str25, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Tickets booked successfully!" + "'", str36, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Tickets booked successfully!" + "'", str40, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Tickets booked successfully!" + "'", str41, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Tickets booked successfully!" + "'", str42, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str51, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Tickets booked successfully!" + "'", str62, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Tickets booked successfully!" + "'", str66, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Tickets booked successfully!" + "'", str67, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Tickets booked successfully!" + "'", str68, "Tickets booked successfully!");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) 'a');
        com.uol.smqa.model.EventType eventType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = adminController5.updateEventType((java.lang.Long) 10L, eventType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.EventType eventType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = adminController5.updateEventType((java.lang.Long) 0L, eventType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, 100, 1);
        java.lang.String str26 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Customer customer27 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.customerRegistration(customer27);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str26, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        java.lang.String str17 = customerController6.updateCustomerDetails((int) (short) 10, strMap16);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.validateEmail((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str17, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        com.uol.smqa.model.Customer customer33 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController6.customerRegistration(customer33);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.lang.String str37 = customerController6.updateCustomerDetails((int) (byte) -1, strMap36);
        java.lang.String str39 = customerController6.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Review review41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity42 = customerController6.updateReview((java.lang.Long) (-1L), review41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str37, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str39, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        java.lang.String str17 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 1, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.validateEmail((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str17, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 0, (int) 'a');
        java.lang.String str40 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 100, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList42 = customerController6.getAllEvents(customerEventsFilterSearchCriteria41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str40, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.String str15 = customerController6.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList17 = customerController6.getEventReviews(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str15, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        java.lang.String str21 = adminController5.initiateEventCreation(event19, (int) (short) 10);
        com.uol.smqa.model.EventType eventType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.updateEventType((java.lang.Long) 0L, eventType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str21, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Organizer organizer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer14 = adminController5.AdminOrganizerRegistration(organizer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str21 = customerController6.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer23 = customerController6.viewCustomerDetails((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str21, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList20 = customerController6.getEventReviews((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.uol.smqa.service.PasswordResetService passwordResetService0 = null;
        com.uol.smqa.controller.PasswordResetController passwordResetController1 = new com.uol.smqa.controller.PasswordResetController(passwordResetService0);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO2 = null;
        org.springframework.validation.BindingResult bindingResult3 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity4 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO2, bindingResult3);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO5 = null;
        org.springframework.validation.BindingResult bindingResult6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO5, bindingResult6);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO8 = null;
        org.springframework.validation.BindingResult bindingResult9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO8, bindingResult9);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO11 = null;
        org.springframework.validation.BindingResult bindingResult12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO11, bindingResult12);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO14 = null;
        org.springframework.validation.BindingResult bindingResult15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO14, bindingResult15);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO17 = null;
        org.springframework.validation.BindingResult bindingResult18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO17, bindingResult18);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO20 = null;
        org.springframework.validation.BindingResult bindingResult21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO20, bindingResult21);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO23 = null;
        org.springframework.validation.BindingResult bindingResult24 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO23, bindingResult24);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO26 = null;
        org.springframework.validation.BindingResult bindingResult27 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO26, bindingResult27);
        com.uol.smqa.dtos.request.PasswordResetRequestDTO passwordResetRequestDTO29 = null;
        org.springframework.validation.BindingResult bindingResult30 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 = passwordResetController1.initiateResetPassword(passwordResetRequestDTO29, bindingResult30);
        org.springframework.web.bind.WebDataBinder webDataBinder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            passwordResetController1.initBinder(webDataBinder32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.web.bind.WebDataBinder.addValidators(org.springframework.validation.Validator[])\" because \"webDataBinder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity4);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertNotNull(wildcardResponseEntity31);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.transferTicket((java.lang.Long) (-1L), (-1), 1);
        java.lang.String str15 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = customerController6.PriortyTicketForEvent((java.lang.Integer) 10, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.transferTicket((java.lang.Long) 100L, (-1), (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        java.lang.String str17 = customerController6.updateCustomerDetails((int) (short) 10, strMap16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str17, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = customerController6.PriortyTicketForEvent((java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = adminController5.ChangeEventStatus((java.lang.Integer) 0, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) 1, strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        java.lang.String str22 = customerController6.updateCustomerDetails((int) 'a', strMap21);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer24 = customerController6.viewCustomerDetails((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str22, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.customerRegistration(customer14);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer17 = customerController6.viewCustomerDetails(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails(0, strMap15);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        java.lang.String str15 = adminController5.initiateEventCreation(event13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = adminController5.deleteEvent((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str15, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService13 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService14 = null;
        com.uol.smqa.service.WishListService wishListService15 = null;
        com.uol.smqa.service.EventService eventService16 = null;
        com.uol.smqa.repository.EventRepository eventRepository17 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository18 = null;
        com.uol.smqa.controller.CustomerController customerController19 = new com.uol.smqa.controller.CustomerController(customerService13, customerBookEventService14, wishListService15, eventService16, eventRepository17, reviewRepository18);
        com.uol.smqa.service.CustomerService customerService20 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService21 = null;
        com.uol.smqa.service.WishListService wishListService22 = null;
        com.uol.smqa.service.EventService eventService23 = null;
        com.uol.smqa.repository.EventRepository eventRepository24 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository25 = null;
        com.uol.smqa.controller.CustomerController customerController26 = new com.uol.smqa.controller.CustomerController(customerService20, customerBookEventService21, wishListService22, eventService23, eventRepository24, reviewRepository25);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController26.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList29 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str30 = customerController26.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str31 = customerController19.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        java.lang.String str32 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList29);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList36 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Tickets booked successfully!" + "'", str30, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Tickets booked successfully!" + "'", str31, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        java.lang.String str26 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 10, "hi!");
        java.lang.String str30 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str30, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 10, (int) ' ');
        java.lang.String str19 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str19, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (short) 10);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList19 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) 'a');
        com.uol.smqa.model.Event event23 = null;
        java.lang.String str25 = adminController5.initiateEventCreation(event23, 10);
        com.uol.smqa.model.Event event26 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = adminController5.createEvent(event26);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str25, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        com.uol.smqa.model.Customer customer16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.customerRegistration(customer16);
        com.uol.smqa.model.Review review19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.updateReview((java.lang.Long) 1L, review19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (short) 10, strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList20 = customerController6.getEventReviews((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController6.customerRegistration(customer14);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = adminController5.ChangeUserStatus((java.lang.Integer) 10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService17 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService18 = null;
        com.uol.smqa.service.WishListService wishListService19 = null;
        com.uol.smqa.service.EventService eventService20 = null;
        com.uol.smqa.repository.EventRepository eventRepository21 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository22 = null;
        com.uol.smqa.controller.CustomerController customerController23 = new com.uol.smqa.controller.CustomerController(customerService17, customerBookEventService18, wishListService19, eventService20, eventRepository21, reviewRepository22);
        java.lang.String str25 = customerController23.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.service.CustomerService customerService26 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService27 = null;
        com.uol.smqa.service.WishListService wishListService28 = null;
        com.uol.smqa.service.EventService eventService29 = null;
        com.uol.smqa.repository.EventRepository eventRepository30 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository31 = null;
        com.uol.smqa.controller.CustomerController customerController32 = new com.uol.smqa.controller.CustomerController(customerService26, customerBookEventService27, wishListService28, eventService29, eventRepository30, reviewRepository31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController32.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList35 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str36 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList35);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity38 = customerController32.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList39 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str40 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        java.lang.String str41 = customerController23.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        java.lang.String str42 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList44 = customerController6.getAllBookedEvents((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str25, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Tickets booked successfully!" + "'", str36, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Tickets booked successfully!" + "'", str40, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Tickets booked successfully!" + "'", str41, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Tickets booked successfully!" + "'", str42, "Tickets booked successfully!");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.createEvent(event23);
        com.uol.smqa.model.Event event25 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = adminController5.updateEvent(event25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) 'a');
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str19, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        java.lang.String str26 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.cancelMembership((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        com.uol.smqa.service.CustomerService customerService15 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService16 = null;
        com.uol.smqa.service.WishListService wishListService17 = null;
        com.uol.smqa.service.EventService eventService18 = null;
        com.uol.smqa.repository.EventRepository eventRepository19 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository20 = null;
        com.uol.smqa.controller.CustomerController customerController21 = new com.uol.smqa.controller.CustomerController(customerService15, customerBookEventService16, wishListService17, eventService18, eventRepository19, reviewRepository20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController21.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str34 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.lang.String str37 = customerController6.updateCustomerDetails((int) (byte) 10, strMap36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList39 = customerController6.getAllBookedEvents((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Tickets booked successfully!" + "'", str34, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str37, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer26 = customerController6.viewCustomerDetails((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.lang.String str16 = customerController6.updateCustomerDetails((int) '#', strMap15);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = customerController6.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str16, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.cancelMembership((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        com.uol.smqa.service.CustomerService customerService25 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService26 = null;
        com.uol.smqa.service.WishListService wishListService27 = null;
        com.uol.smqa.service.EventService eventService28 = null;
        com.uol.smqa.repository.EventRepository eventRepository29 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository30 = null;
        com.uol.smqa.controller.CustomerController customerController31 = new com.uol.smqa.controller.CustomerController(customerService25, customerBookEventService26, wishListService27, eventService28, eventRepository29, reviewRepository30);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 = customerController31.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity38 = customerController31.transferTicket((java.lang.Long) 1L, (int) ' ', (int) (short) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity41 = customerController31.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = null;
        java.lang.String str44 = customerController31.updateCustomerDetails(1, strMap43);
        com.uol.smqa.service.CustomerService customerService45 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService46 = null;
        com.uol.smqa.service.WishListService wishListService47 = null;
        com.uol.smqa.service.EventService eventService48 = null;
        com.uol.smqa.repository.EventRepository eventRepository49 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository50 = null;
        com.uol.smqa.controller.CustomerController customerController51 = new com.uol.smqa.controller.CustomerController(customerService45, customerBookEventService46, wishListService47, eventService48, eventRepository49, reviewRepository50);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity54 = customerController51.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity56 = customerController51.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity59 = customerController51.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        com.uol.smqa.service.CustomerService customerService60 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService61 = null;
        com.uol.smqa.service.WishListService wishListService62 = null;
        com.uol.smqa.service.EventService eventService63 = null;
        com.uol.smqa.repository.EventRepository eventRepository64 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository65 = null;
        com.uol.smqa.controller.CustomerController customerController66 = new com.uol.smqa.controller.CustomerController(customerService60, customerBookEventService61, wishListService62, eventService63, eventRepository64, reviewRepository65);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity68 = customerController66.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList69 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str70 = customerController66.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList69);
        java.lang.String str71 = customerController51.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList69);
        java.lang.String str72 = customerController31.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList69);
        java.lang.String str73 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList69);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity34);
        org.junit.Assert.assertNotNull(wildcardResponseEntity38);
        org.junit.Assert.assertNotNull(wildcardResponseEntity41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str44, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity54);
        org.junit.Assert.assertNotNull(wildcardResponseEntity56);
        org.junit.Assert.assertNotNull(wildcardResponseEntity59);
        org.junit.Assert.assertNotNull(wildcardResponseEntity68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Tickets booked successfully!" + "'", str70, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Tickets booked successfully!" + "'", str71, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Tickets booked successfully!" + "'", str72, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Tickets booked successfully!" + "'", str73, "Tickets booked successfully!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, (int) (short) 100, 10);
        java.lang.String str26 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str26, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.validateEmail((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = adminController5.ChangeEventStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Event event23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = adminController5.createEvent(event23);
        com.uol.smqa.model.EventType eventType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = adminController5.addEventType(eventType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.addEventType(com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.createEvent(event20);
        com.uol.smqa.model.Event event22 = null;
        java.lang.String str24 = adminController5.initiateEventCreation(event22, 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str24, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, (int) 'a');
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) 'a');
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, (int) (byte) 100);
        com.uol.smqa.model.Event event21 = null;
        java.lang.String str23 = adminController5.initiateEventCreation(event21, (int) (byte) 0);
        com.uol.smqa.model.Event event24 = null;
        java.lang.String str26 = adminController5.initiateEventCreation(event24, (int) (byte) 0);
        com.uol.smqa.model.EventType eventType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 = adminController5.updateEventType((java.lang.Long) 100L, eventType28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str23, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str26, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.lang.String str12 = customerController6.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.cancelMembership((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str12, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        java.lang.String str26 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 10, "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        java.lang.String str29 = customerController6.updateCustomerDetails((-1), strMap28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList30 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str29, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.model.CardDetails cardDetails34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController6.buyMembership((-1), cardDetails34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertNotNull(wildcardResponseEntity32);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        java.lang.String str26 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        java.lang.String str30 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList32 = customerController6.getAllBookedEvents((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str30, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        java.lang.String str21 = adminController5.initiateEventCreation(event19, (int) (short) 10);
        com.uol.smqa.model.Event event22 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = adminController5.updateEvent(event22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = adminController5.ChangeUserStatus((java.lang.Integer) 0, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str21, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.model.CardDetails cardDetails26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.buyMembership((-1), cardDetails26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Event event19 = null;
        java.lang.String str21 = adminController5.initiateEventCreation(event19, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList22 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str21, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        java.lang.String str15 = adminController5.initiateEventCreation(event13, 10);
        com.uol.smqa.model.EventType eventType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEventType((java.lang.Long) 10L, eventType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str15, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.transferTicket((java.lang.Long) 100L, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.transferTicket((java.lang.Long) 10L, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList15 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        com.uol.smqa.model.Review review18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity19 = customerController6.createReview((java.lang.Integer) 0, review18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) (-1), (java.lang.Integer) 100);
        com.uol.smqa.model.Review review24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity25 = customerController6.createReview((java.lang.Integer) 1, review24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) (-1), "hi!");
        java.lang.String str18 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 1, "hi!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str18, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.deleteEventType((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = customerController6.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) 1, strMap18);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList24 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList13 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str14 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Tickets booked successfully!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList22 = customerController6.getCustomerWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Tickets booked successfully!" + "'", str14, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        java.lang.String str13 = customerController6.updateCustomerDetails((int) (byte) 1, strMap12);
        com.uol.smqa.service.CustomerService customerService14 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService15 = null;
        com.uol.smqa.service.WishListService wishListService16 = null;
        com.uol.smqa.service.EventService eventService17 = null;
        com.uol.smqa.repository.EventRepository eventRepository18 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository19 = null;
        com.uol.smqa.controller.CustomerController customerController20 = new com.uol.smqa.controller.CustomerController(customerService14, customerBookEventService15, wishListService16, eventService17, eventRepository18, reviewRepository19);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController20.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str24 = customerController20.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController20.acknowledgeBooking((java.lang.Long) 0L);
        com.uol.smqa.service.CustomerService customerService27 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService28 = null;
        com.uol.smqa.service.WishListService wishListService29 = null;
        com.uol.smqa.service.EventService eventService30 = null;
        com.uol.smqa.repository.EventRepository eventRepository31 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository32 = null;
        com.uol.smqa.controller.CustomerController customerController33 = new com.uol.smqa.controller.CustomerController(customerService27, customerBookEventService28, wishListService29, eventService30, eventRepository31, reviewRepository32);
        com.uol.smqa.service.CustomerService customerService34 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService35 = null;
        com.uol.smqa.service.WishListService wishListService36 = null;
        com.uol.smqa.service.EventService eventService37 = null;
        com.uol.smqa.repository.EventRepository eventRepository38 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository39 = null;
        com.uol.smqa.controller.CustomerController customerController40 = new com.uol.smqa.controller.CustomerController(customerService34, customerBookEventService35, wishListService36, eventService37, eventRepository38, reviewRepository39);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity42 = customerController40.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList43 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str44 = customerController40.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str45 = customerController33.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str46 = customerController20.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str47 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList43);
        java.lang.String str49 = customerController6.getAnalytics((java.lang.Integer) 0);
        java.lang.String str51 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str13, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Tickets booked successfully!" + "'", str44, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Tickets booked successfully!" + "'", str45, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Tickets booked successfully!" + "'", str46, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str49, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str51, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str14 = customerController6.getAnalytics((java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) 100);
        com.uol.smqa.model.Review review19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity20 = customerController6.createReview((java.lang.Integer) 0, review19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str14, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.createEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        java.lang.String str14 = adminController5.initiateEventCreation(event12, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = adminController5.ChangeUserStatus((java.lang.Integer) (-1), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str14, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, 1);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) '4');
        com.uol.smqa.model.Event event18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.updateEvent(event18);
        com.uol.smqa.model.Event event20 = null;
        java.lang.String str22 = adminController5.initiateEventCreation(event20, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 100, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str22, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str26 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController6.transferTicket((java.lang.Long) 100L, (int) (short) 100, 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str26, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertNotNull(wildcardResponseEntity32);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.lang.String str12 = customerController6.updateCustomerDetails((-1), strMap11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.transferTicket((java.lang.Long) (-1L), (int) (byte) 1, (int) '#');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.model.Customer customer23 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.customerRegistration(customer23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object[]> objArrayList25 = customerController6.getAllUpcomingEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.getAllEvents()\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str12, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = adminController5.updateEvent(event8);
        com.uol.smqa.model.Event event10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = adminController5.createEvent(event10);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, 100);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.createEvent(event17);
        com.uol.smqa.model.Organizer organizer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer20 = adminController5.AdminOrganizerRegistration(organizer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.lang.String str19 = customerController6.updateCustomerDetails((int) (short) -1, strMap18);
        com.uol.smqa.model.Customer customer20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.customerRegistration(customer20);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str19, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.updateEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        java.lang.String str15 = adminController5.initiateEventCreation(event13, (int) (short) -1);
        com.uol.smqa.model.Event event16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = adminController5.updateEvent(event16);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = adminController5.deleteEventType((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str15, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        com.uol.smqa.service.CustomerService customerService7 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService8 = null;
        com.uol.smqa.service.WishListService wishListService9 = null;
        com.uol.smqa.service.EventService eventService10 = null;
        com.uol.smqa.repository.EventRepository eventRepository11 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository12 = null;
        com.uol.smqa.controller.CustomerController customerController13 = new com.uol.smqa.controller.CustomerController(customerService7, customerBookEventService8, wishListService9, eventService10, eventRepository11, reviewRepository12);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController13.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList16 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str17 = customerController13.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str18 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList16);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.transferTicket((java.lang.Long) 100L, 100, 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tickets booked successfully!" + "'", str17, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tickets booked successfully!" + "'", str18, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.lang.String str11 = customerController6.updateCustomerDetails((int) (short) 1, strMap10);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str11, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer27 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 = customerController6.customerRegistration(customer27);
        com.uol.smqa.model.Review review30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity31 = customerController6.createReview((java.lang.Integer) 10, review30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity28);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str10 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "hi!");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.transferTicket((java.lang.Long) 100L, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList16 = customerController6.getAllBookedEvents((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        com.uol.smqa.model.Customer customer10 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.customerRegistration(customer10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "");
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        java.lang.String str23 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService26 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService27 = null;
        com.uol.smqa.service.WishListService wishListService28 = null;
        com.uol.smqa.service.EventService eventService29 = null;
        com.uol.smqa.repository.EventRepository eventRepository30 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository31 = null;
        com.uol.smqa.controller.CustomerController customerController32 = new com.uol.smqa.controller.CustomerController(customerService26, customerBookEventService27, wishListService28, eventService29, eventRepository30, reviewRepository31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController32.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity37 = customerController32.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 = customerController32.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity44 = customerController32.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController32.transferTicket((java.lang.Long) 1L, (int) (byte) 1, 100);
        com.uol.smqa.service.CustomerService customerService49 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService50 = null;
        com.uol.smqa.service.WishListService wishListService51 = null;
        com.uol.smqa.service.EventService eventService52 = null;
        com.uol.smqa.repository.EventRepository eventRepository53 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository54 = null;
        com.uol.smqa.controller.CustomerController customerController55 = new com.uol.smqa.controller.CustomerController(customerService49, customerBookEventService50, wishListService51, eventService52, eventRepository53, reviewRepository54);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity57 = customerController55.acknowledgeBooking((java.lang.Long) 100L);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList58 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str59 = customerController55.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str60 = customerController32.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        java.lang.String str61 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList58);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity63 = customerController6.deleteEventFromWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str23, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
        org.junit.Assert.assertNotNull(wildcardResponseEntity37);
        org.junit.Assert.assertNotNull(wildcardResponseEntity40);
        org.junit.Assert.assertNotNull(wildcardResponseEntity44);
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertNotNull(wildcardResponseEntity57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Tickets booked successfully!" + "'", str59, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Tickets booked successfully!" + "'", str60, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Tickets booked successfully!" + "'", str61, "Tickets booked successfully!");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        java.lang.String str8 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 0, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        com.uol.smqa.model.Customer customer13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.customerRegistration(customer13);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        java.lang.String str17 = customerController6.updateCustomerDetails((int) (byte) 0, strMap16);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.transferTicket((java.lang.Long) 10L, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str8, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str12, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str17, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) 100L);
        java.lang.String str10 = customerController6.cancelBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        com.uol.smqa.model.Customer customer13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.customerRegistration(customer13);
        com.uol.smqa.model.Customer customer15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.customerRegistration(customer15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str10, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
    }
}

