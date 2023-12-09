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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (byte) 0);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, (int) '4');
        com.uol.smqa.model.EventType eventType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEventType((java.lang.Long) 100L, eventType21);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        java.lang.String str20 = customerController6.updateCustomerDetails((int) 'a', strMap19);
        java.lang.String str22 = customerController6.cancelBooking((java.lang.Long) 1L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.acknowledgeBooking((java.lang.Long) 1L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Review> reviewList28 = customerController6.getEventReviews((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(int)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str20, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        com.uol.smqa.model.Event event12 = null;
        org.springframework.validation.BindingResult bindingResult13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = organizerController4.editEvent((int) (short) 10, event12, bindingResult13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = organizerController4.deleteEvent((int) (byte) 100, 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = organizerController4.deleteEvent((int) '#', (int) (short) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = organizerController4.deleteEvent((int) '#', (int) (byte) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = organizerController4.deleteEvent((int) (byte) 1, (-1));
        com.uol.smqa.model.Event event28 = null;
        org.springframework.validation.BindingResult bindingResult29 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = organizerController4.editEvent((int) (byte) 10, event28, bindingResult29);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = organizerController4.getAllEvents((int) (short) 0);
        com.uol.smqa.model.Discount discount33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Discount discount34 = organizerController4.setDiscount(discount33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.setDiscount(com.uol.smqa.model.Discount)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertNotNull(wildcardResponseEntity32);
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
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.createEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) '4');
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (short) 1);
        com.uol.smqa.model.Organizer organizer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer20 = adminController5.AdminOrganizerRegistration(organizer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.lang.String str11 = customerController6.updateCustomerDetails((int) (short) 0, strMap10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 1, "Tickets booked successfully!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        java.lang.String str18 = customerController6.updateCustomerDetails((int) (short) -1, strMap17);
        com.uol.smqa.model.Customer customer19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController6.customerRegistration(customer19);
        java.lang.String str22 = customerController6.cancelBooking((java.lang.Long) 1L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str11, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str18, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity25);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        java.lang.String str20 = customerController6.updateCustomerDetails((int) (short) 0, strMap19);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) 10L);
        com.uol.smqa.model.Review review26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity27 = customerController6.createReview((java.lang.Integer) 0, review26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findById(Object)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str20, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str14 = customerController6.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) ' ');
        com.uol.smqa.service.CustomerService customerService19 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService20 = null;
        com.uol.smqa.service.WishListService wishListService21 = null;
        com.uol.smqa.service.EventService eventService22 = null;
        com.uol.smqa.repository.EventRepository eventRepository23 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository24 = null;
        com.uol.smqa.controller.CustomerController customerController25 = new com.uol.smqa.controller.CustomerController(customerService19, customerBookEventService20, wishListService21, eventService22, eventRepository23, reviewRepository24);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController25.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList28 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str29 = customerController25.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList28);
        java.lang.String str33 = customerController25.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController25.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService37 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService38 = null;
        com.uol.smqa.service.WishListService wishListService39 = null;
        com.uol.smqa.service.EventService eventService40 = null;
        com.uol.smqa.repository.EventRepository eventRepository41 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository42 = null;
        com.uol.smqa.controller.CustomerController customerController43 = new com.uol.smqa.controller.CustomerController(customerService37, customerBookEventService38, wishListService39, eventService40, eventRepository41, reviewRepository42);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity45 = customerController43.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList46 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str47 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str51 = customerController43.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        java.lang.String str55 = customerController43.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService56 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService57 = null;
        com.uol.smqa.service.WishListService wishListService58 = null;
        com.uol.smqa.service.EventService eventService59 = null;
        com.uol.smqa.repository.EventRepository eventRepository60 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository61 = null;
        com.uol.smqa.controller.CustomerController customerController62 = new com.uol.smqa.controller.CustomerController(customerService56, customerBookEventService57, wishListService58, eventService59, eventRepository60, reviewRepository61);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity64 = customerController62.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList65 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str66 = customerController62.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str67 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str68 = customerController25.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str69 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity71 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity73 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str14, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Tickets booked successfully!" + "'", str29, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str33, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str51, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str55, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Tickets booked successfully!" + "'", str66, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Tickets booked successfully!" + "'", str67, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Tickets booked successfully!" + "'", str68, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Tickets booked successfully!" + "'", str69, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity71);
        org.junit.Assert.assertNotNull(wildcardResponseEntity73);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, 1);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        com.uol.smqa.model.Event event15 = null;
        java.lang.String str17 = adminController5.initiateEventCreation(event15, (int) (byte) 0);
        com.uol.smqa.model.EventType eventType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEventType((java.lang.Long) 100L, eventType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str17, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.uol.smqa.model.Event event10 = null;
        java.lang.String str12 = adminController5.initiateEventCreation(event10, 1);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.createEvent(event13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeOrganizerStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str12, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.customerRegistration(customer15);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.String str25 = customerController6.cancelBooking((java.lang.Long) 0L);
        java.lang.String str27 = customerController6.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str29 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str25, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str27, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str29, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList27 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str28 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList27);
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        java.lang.String str36 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService37 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService38 = null;
        com.uol.smqa.service.WishListService wishListService39 = null;
        com.uol.smqa.service.EventService eventService40 = null;
        com.uol.smqa.repository.EventRepository eventRepository41 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository42 = null;
        com.uol.smqa.controller.CustomerController customerController43 = new com.uol.smqa.controller.CustomerController(customerService37, customerBookEventService38, wishListService39, eventService40, eventRepository41, reviewRepository42);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity45 = customerController43.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList46 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str47 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str48 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str49 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity51 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.lang.String str53 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str57 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 100, "Failed to initiate event creation. Status: 500");
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = null;
        java.lang.String str60 = customerController6.updateCustomerDetails((int) ' ', strMap59);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Tickets booked successfully!" + "'", str28, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str36, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Tickets booked successfully!" + "'", str48, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Tickets booked successfully!" + "'", str49, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str53, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str57, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str60, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) 0L, (int) 'a', (int) (short) -1);
        com.uol.smqa.service.CustomerService customerService19 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService20 = null;
        com.uol.smqa.service.WishListService wishListService21 = null;
        com.uol.smqa.service.EventService eventService22 = null;
        com.uol.smqa.repository.EventRepository eventRepository23 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository24 = null;
        com.uol.smqa.controller.CustomerController customerController25 = new com.uol.smqa.controller.CustomerController(customerService19, customerBookEventService20, wishListService21, eventService22, eventRepository23, reviewRepository24);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 = customerController25.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList28 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str29 = customerController25.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList28);
        java.lang.String str33 = customerController25.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController25.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService37 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService38 = null;
        com.uol.smqa.service.WishListService wishListService39 = null;
        com.uol.smqa.service.EventService eventService40 = null;
        com.uol.smqa.repository.EventRepository eventRepository41 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository42 = null;
        com.uol.smqa.controller.CustomerController customerController43 = new com.uol.smqa.controller.CustomerController(customerService37, customerBookEventService38, wishListService39, eventService40, eventRepository41, reviewRepository42);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity45 = customerController43.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList46 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str47 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str51 = customerController43.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        java.lang.String str55 = customerController43.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService56 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService57 = null;
        com.uol.smqa.service.WishListService wishListService58 = null;
        com.uol.smqa.service.EventService eventService59 = null;
        com.uol.smqa.repository.EventRepository eventRepository60 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository61 = null;
        com.uol.smqa.controller.CustomerController customerController62 = new com.uol.smqa.controller.CustomerController(customerService56, customerBookEventService57, wishListService58, eventService59, eventRepository60, reviewRepository61);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity64 = customerController62.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList65 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str66 = customerController62.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str67 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str68 = customerController25.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        java.lang.String str69 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList65);
        com.uol.smqa.model.Customer customer70 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity71 = customerController6.customerRegistration(customer70);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Tickets booked successfully!" + "'", str29, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str33, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str51, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str55, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Tickets booked successfully!" + "'", str66, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Tickets booked successfully!" + "'", str67, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Tickets booked successfully!" + "'", str68, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Tickets booked successfully!" + "'", str69, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity71);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService12 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService13 = null;
        com.uol.smqa.service.WishListService wishListService14 = null;
        com.uol.smqa.service.EventService eventService15 = null;
        com.uol.smqa.repository.EventRepository eventRepository16 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository17 = null;
        com.uol.smqa.controller.CustomerController customerController18 = new com.uol.smqa.controller.CustomerController(customerService12, customerBookEventService13, wishListService14, eventService15, eventRepository16, reviewRepository17);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController18.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList21 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str22 = customerController18.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList21);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController18.transferTicket((java.lang.Long) 0L, 10, (int) (short) 1);
        com.uol.smqa.service.CustomerService customerService27 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService28 = null;
        com.uol.smqa.service.WishListService wishListService29 = null;
        com.uol.smqa.service.EventService eventService30 = null;
        com.uol.smqa.repository.EventRepository eventRepository31 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository32 = null;
        com.uol.smqa.controller.CustomerController customerController33 = new com.uol.smqa.controller.CustomerController(customerService27, customerBookEventService28, wishListService29, eventService30, eventRepository31, reviewRepository32);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController33.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList36 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str37 = customerController33.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        java.lang.String str38 = customerController18.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        java.lang.String str39 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        com.uol.smqa.service.CustomerService customerService40 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService41 = null;
        com.uol.smqa.service.WishListService wishListService42 = null;
        com.uol.smqa.service.EventService eventService43 = null;
        com.uol.smqa.repository.EventRepository eventRepository44 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository45 = null;
        com.uol.smqa.controller.CustomerController customerController46 = new com.uol.smqa.controller.CustomerController(customerService40, customerBookEventService41, wishListService42, eventService43, eventRepository44, reviewRepository45);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity48 = customerController46.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList49 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str50 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList49);
        java.lang.String str54 = customerController46.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity57 = customerController46.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = null;
        java.lang.String str60 = customerController46.updateCustomerDetails((int) (short) 0, strMap59);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity62 = customerController46.acknowledgeBooking((java.lang.Long) 10L);
        com.uol.smqa.service.CustomerService customerService63 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService64 = null;
        com.uol.smqa.service.WishListService wishListService65 = null;
        com.uol.smqa.service.EventService eventService66 = null;
        com.uol.smqa.repository.EventRepository eventRepository67 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository68 = null;
        com.uol.smqa.controller.CustomerController customerController69 = new com.uol.smqa.controller.CustomerController(customerService63, customerBookEventService64, wishListService65, eventService66, eventRepository67, reviewRepository68);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity71 = customerController69.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList72 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str73 = customerController69.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList72);
        com.uol.smqa.model.Customer customer74 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity75 = customerController69.customerRegistration(customer74);
        java.lang.String str77 = customerController69.getAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity81 = customerController69.transferTicket((java.lang.Long) (-1L), (int) 'a', (int) ' ');
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList82 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str83 = customerController69.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList82);
        java.lang.String str84 = customerController46.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList82);
        java.lang.String str85 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList82);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Tickets booked successfully!" + "'", str22, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Tickets booked successfully!" + "'", str37, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Tickets booked successfully!" + "'", str38, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Tickets booked successfully!" + "'", str39, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Tickets booked successfully!" + "'", str50, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str54, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str60, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity62);
        org.junit.Assert.assertNotNull(wildcardResponseEntity71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Tickets booked successfully!" + "'", str73, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str77, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Tickets booked successfully!" + "'", str83, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Tickets booked successfully!" + "'", str84, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Tickets booked successfully!" + "'", str85, "Tickets booked successfully!");
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity11 = customerController6.validateEmail((-1), "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = adminController5.ChangeEventStatus((java.lang.Integer) 100, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = organizerController4.deleteEvent((int) (byte) -1, (int) '#');
        com.uol.smqa.model.Event event8 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.requestEventCreation(event8, 1);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.validation.BindingResult bindingResult13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = organizerController4.editEvent((int) (byte) -1, event12, bindingResult13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = organizerController4.deleteEvent(0, (int) (byte) 100);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.validation.BindingResult bindingResult20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = organizerController4.editEvent(0, event19, bindingResult20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.String str19 = customerController6.cancelBooking((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (byte) 0);
        com.uol.smqa.model.Event event17 = null;
        java.lang.String str19 = adminController5.initiateEventCreation(event17, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = adminController5.deleteEventType((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
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
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 10);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, 100);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.createEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = adminController5.createEvent(event16);
        com.uol.smqa.model.Organizer organizer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer19 = adminController5.AdminOrganizerRegistration(organizer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.transferTicket((java.lang.Long) (-1L), 100, 1);
        java.lang.String str16 = customerController6.getAnalytics((java.lang.Integer) 10);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 10, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str16, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) 100L, (java.lang.Integer) 0, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        java.lang.String str24 = customerController6.cancelBooking((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.cancelMembership((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
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
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 1);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, (int) (byte) 1);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.createEvent(event12);
        com.uol.smqa.model.Customer customer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer15 = adminController5.CustomerRegistration(customer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) 0L, (int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity21 = customerController6.validateEmail(0, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.validateEmailFormat(int, String)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (short) 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.createEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList14 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = organizerController4.getAllEvents((int) (byte) -1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = organizerController4.getAllEvents((int) ' ');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = organizerController4.getAllEvents((int) (byte) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = organizerController4.deleteEvent((int) '4', (int) (short) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = organizerController4.getAllEvents((int) (short) 0);
        java.lang.String str23 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str23, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.customerRegistration(customer15);
        java.lang.String str20 = customerController6.provideEventRating((java.lang.Long) 10L, (java.lang.Integer) 1, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 100);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.addEventInWishList((java.lang.Integer) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = organizerController4.deleteEvent((int) (byte) -1, (int) '#');
        java.lang.String str9 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = organizerController4.getAllEvents((int) (byte) -1);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.validation.BindingResult bindingResult14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = organizerController4.editEvent((int) (byte) 100, event13, bindingResult14);
        com.uol.smqa.model.Organizer organizer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer17 = organizerController4.OrganizerRegistration(organizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str9, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.lang.String str16 = customerController6.provideEventRating((java.lang.Long) 100L, (java.lang.Integer) (-1), "");
        com.uol.smqa.model.Customer customer17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.customerRegistration(customer17);
        java.lang.String str20 = customerController6.cancelBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController6.deleteEventFromWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str16, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null" + "'", str20, "Error canceling booking: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.cancelEventBooking(java.lang.Long)\" because \"this.customerBookEventService\" is null");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (byte) 0);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = adminController5.ChangeUserStatus((java.lang.Integer) (-1), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) '4', strMap20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 0);
        java.lang.String str38 = customerController6.getAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 = customerController6.acknowledgeBooking((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList42 = customerController6.getAllBookedEvents(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str38, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity40);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.createEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        java.lang.String str15 = adminController5.initiateEventCreation(event13, (int) (short) 100);
        com.uol.smqa.model.Event event16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = adminController5.createEvent(event16);
        com.uol.smqa.model.Event event18 = null;
        java.lang.String str20 = adminController5.initiateEventCreation(event18, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.EventType> eventTypeList21 = adminController5.getAllEventTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.getAllEventTypes()\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str15, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str20, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.transferTicket((java.lang.Long) 0L, (int) 'a', (int) (short) -1);
        java.lang.String str22 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) (-1), "");
        java.lang.String str24 = customerController6.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.Review review26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity27 = customerController6.updateReview((java.lang.Long) 0L, review26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.ReviewRepository.findById(Object)\" because \"this.reviewRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str22, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str24, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.model.Event event7 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = organizerController4.requestEventCreation(event7, 0);
        java.lang.String str11 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str11, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = organizerController4.getAllEvents((int) '4');
        com.uol.smqa.model.Event event14 = null;
        org.springframework.validation.BindingResult bindingResult15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = organizerController4.editEvent((int) ' ', event14, bindingResult15);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = organizerController4.requestEventCreation(event17, (int) ' ');
        com.uol.smqa.model.Event event20 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = organizerController4.requestEventCreation(event20, (int) (short) 10);
        java.lang.String str24 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str24, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 = adminController5.createEvent(event6);
        com.uol.smqa.model.Event event8 = null;
        java.lang.String str10 = adminController5.initiateEventCreation(event8, 100);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.createEvent(event11);
        com.uol.smqa.model.Event event13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = adminController5.updateEvent(event13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str10, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.lang.String str15 = customerController6.updateCustomerDetails((int) (byte) 0, strMap14);
        java.lang.String str17 = customerController6.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList19 = customerController6.getAllBookedEvents((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str15, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str17, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.lang.String str11 = customerController6.updateCustomerDetails((int) (short) 0, strMap10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 1, "Failed to initiate event creation. Status: 500");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.acknowledgeBooking((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.deleteEventFromWishList((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str11, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = organizerController4.getAllEvents((int) (byte) -1);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = organizerController4.getAllEvents((int) ' ');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = organizerController4.getAllEvents((int) ' ');
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = organizerController4.requestEventCreation(event17, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.String str19 = customerController6.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController6.cancelMembership(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.cancelMembership(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str19, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = organizerController4.getAllEvents((int) (byte) -1);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.validation.BindingResult bindingResult15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = organizerController4.editEvent((int) (short) 0, event14, bindingResult15);
        com.uol.smqa.model.Event event17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = organizerController4.createEvent(event17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.model.Event.getEventType()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 0, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer18 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController6.customerRegistration(customer18);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity19);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.createEvent(event15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = adminController5.ChangeOrganizerStatus((java.lang.Integer) 1, (java.lang.Boolean) true);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.model.Event event7 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 = organizerController4.requestEventCreation(event7, 0);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.validation.BindingResult bindingResult12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = organizerController4.editEvent((int) (byte) 1, event11, bindingResult12);
        com.uol.smqa.model.Event event15 = null;
        org.springframework.validation.BindingResult bindingResult16 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = organizerController4.editEvent((int) 'a', event15, bindingResult16);
        com.uol.smqa.model.Discount discount18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Discount discount19 = organizerController4.setDiscount(discount18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.setDiscount(com.uol.smqa.model.Discount)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity9);
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 1);
        com.uol.smqa.model.Event event9 = null;
        java.lang.String str11 = adminController5.initiateEventCreation(event9, (int) (byte) 1);
        com.uol.smqa.model.Event event12 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = adminController5.updateEvent(event12);
        com.uol.smqa.model.Event event14 = null;
        java.lang.String str16 = adminController5.initiateEventCreation(event14, (int) (short) 100);
        com.uol.smqa.model.Event event17 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = adminController5.updateEvent(event17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str11, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str16, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity18);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        com.uol.smqa.model.Customer customer11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController6.customerRegistration(customer11);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        com.uol.smqa.model.Customer customer15 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.customerRegistration(customer15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController6.deleteEventFromWishList((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
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
        java.lang.String str10 = adminController5.initiateEventCreation(event8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList11 = adminController5.getAllEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEvents()\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str10, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Organizer organizer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer24 = adminController5.AdminOrganizerRegistration(organizer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) '4', strMap20);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.String> strResponseEntity26 = customerController6.bookEvent(strMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity24);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController6.addEventInWishList((java.lang.Integer) 100, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService12 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService13 = null;
        com.uol.smqa.service.WishListService wishListService14 = null;
        com.uol.smqa.service.EventService eventService15 = null;
        com.uol.smqa.repository.EventRepository eventRepository16 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository17 = null;
        com.uol.smqa.controller.CustomerController customerController18 = new com.uol.smqa.controller.CustomerController(customerService12, customerBookEventService13, wishListService14, eventService15, eventRepository16, reviewRepository17);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController18.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList21 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str22 = customerController18.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList21);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController18.transferTicket((java.lang.Long) 0L, 10, (int) (short) 1);
        com.uol.smqa.service.CustomerService customerService27 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService28 = null;
        com.uol.smqa.service.WishListService wishListService29 = null;
        com.uol.smqa.service.EventService eventService30 = null;
        com.uol.smqa.repository.EventRepository eventRepository31 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository32 = null;
        com.uol.smqa.controller.CustomerController customerController33 = new com.uol.smqa.controller.CustomerController(customerService27, customerBookEventService28, wishListService29, eventService30, eventRepository31, reviewRepository32);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 = customerController33.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList36 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str37 = customerController33.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        java.lang.String str38 = customerController18.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        java.lang.String str39 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList36);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity43 = customerController6.transferTicket((java.lang.Long) (-1L), 10, (int) (byte) 10);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList44 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str45 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList44);
        java.lang.String str47 = customerController6.getAnalytics((java.lang.Integer) 0);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity49 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity11);
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Tickets booked successfully!" + "'", str22, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertNotNull(wildcardResponseEntity35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Tickets booked successfully!" + "'", str37, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Tickets booked successfully!" + "'", str38, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Tickets booked successfully!" + "'", str39, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Tickets booked successfully!" + "'", str45, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str47, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity49);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        java.lang.String str20 = customerController6.updateCustomerDetails((int) (short) 0, strMap19);
        java.lang.String str24 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) (-1), "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController6.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str20, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str24, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEvent(event21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = adminController5.ChangeEventStatus((java.lang.Integer) (-1), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.ChangeEventStatus(int, java.lang.Boolean)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.repository.EventRepository eventRepository4 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository5 = null;
        com.uol.smqa.controller.CustomerController customerController6 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3, eventRepository4, reviewRepository5);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) '4', strMap20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer38 = customerController6.viewCustomerDetails((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = adminController5.deleteEvent((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.deleteEvent(int)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController6.addEventInWishList((java.lang.Integer) 1, (java.lang.Integer) (-1));
        com.uol.smqa.service.CustomerService customerService18 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService19 = null;
        com.uol.smqa.service.WishListService wishListService20 = null;
        com.uol.smqa.service.EventService eventService21 = null;
        com.uol.smqa.repository.EventRepository eventRepository22 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository23 = null;
        com.uol.smqa.controller.CustomerController customerController24 = new com.uol.smqa.controller.CustomerController(customerService18, customerBookEventService19, wishListService20, eventService21, eventRepository22, reviewRepository23);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 = customerController24.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList27 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str28 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList27);
        java.lang.String str32 = customerController24.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        java.lang.String str36 = customerController24.provideEventRating((java.lang.Long) (-1L), (java.lang.Integer) 10, "Failed to initiate event creation. Status: 500");
        com.uol.smqa.service.CustomerService customerService37 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService38 = null;
        com.uol.smqa.service.WishListService wishListService39 = null;
        com.uol.smqa.service.EventService eventService40 = null;
        com.uol.smqa.repository.EventRepository eventRepository41 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository42 = null;
        com.uol.smqa.controller.CustomerController customerController43 = new com.uol.smqa.controller.CustomerController(customerService37, customerBookEventService38, wishListService39, eventService40, eventRepository41, reviewRepository42);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity45 = customerController43.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList46 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str47 = customerController43.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str48 = customerController24.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        java.lang.String str49 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList46);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity51 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.lang.String str53 = customerController6.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.service.CustomerService customerService54 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService55 = null;
        com.uol.smqa.service.WishListService wishListService56 = null;
        com.uol.smqa.service.EventService eventService57 = null;
        com.uol.smqa.repository.EventRepository eventRepository58 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository59 = null;
        com.uol.smqa.controller.CustomerController customerController60 = new com.uol.smqa.controller.CustomerController(customerService54, customerBookEventService55, wishListService56, eventService57, eventRepository58, reviewRepository59);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity62 = customerController60.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList63 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str64 = customerController60.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList63);
        java.lang.String str68 = customerController60.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity70 = customerController60.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str72 = customerController60.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = null;
        java.lang.String str75 = customerController60.updateCustomerDetails((int) '4', strMap74);
        com.uol.smqa.service.CustomerService customerService76 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService77 = null;
        com.uol.smqa.service.WishListService wishListService78 = null;
        com.uol.smqa.service.EventService eventService79 = null;
        com.uol.smqa.repository.EventRepository eventRepository80 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository81 = null;
        com.uol.smqa.controller.CustomerController customerController82 = new com.uol.smqa.controller.CustomerController(customerService76, customerBookEventService77, wishListService78, eventService79, eventRepository80, reviewRepository81);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity84 = customerController82.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList85 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str86 = customerController82.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList85);
        java.lang.String str87 = customerController60.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList85);
        java.lang.String str88 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList85);
        java.lang.Class<?> wildcardClass89 = strMapList85.getClass();
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertNotNull(wildcardResponseEntity26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Tickets booked successfully!" + "'", str28, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str32, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str36, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tickets booked successfully!" + "'", str47, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Tickets booked successfully!" + "'", str48, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Tickets booked successfully!" + "'", str49, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str53, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Tickets booked successfully!" + "'", str64, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str68, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str72, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str75, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Tickets booked successfully!" + "'", str86, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Tickets booked successfully!" + "'", str87, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Tickets booked successfully!" + "'", str88, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.uol.smqa.service.EventService eventService0 = null;
        com.uol.smqa.service.EventTypeService eventTypeService1 = null;
        com.uol.smqa.service.OrganizerService organizerService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.service.CustomerService customerService4 = null;
        com.uol.smqa.controller.AdminController adminController5 = new com.uol.smqa.controller.AdminController(eventService0, eventTypeService1, organizerService2, adminService3, customerService4);
        com.uol.smqa.model.Event event6 = null;
        java.lang.String str8 = adminController5.initiateEventCreation(event6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = adminController5.ChangeUserStatus((java.lang.Integer) (-1), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.AdminService.ChangeUserStatus(int, boolean)\" because \"this.adminService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.updateEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.updateEvent(event21);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.deleteEventType((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.deleteEventType(java.lang.Long)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.AdminService adminService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, adminService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = organizerController4.getAllEvents((int) '4');
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = organizerController4.getAllEvents((int) 'a');
        com.uol.smqa.model.Event event12 = null;
        org.springframework.validation.BindingResult bindingResult13 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = organizerController4.editEvent((int) (short) 10, event12, bindingResult13);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = organizerController4.deleteEvent((int) (byte) 100, 1);
        java.lang.String str19 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.validation.BindingResult bindingResult22 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = organizerController4.editEvent((int) '4', event21, bindingResult22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str6, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity14);
        org.junit.Assert.assertNotNull(wildcardResponseEntity17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null" + "'", str19, "Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity23);
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList9 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str10 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList9);
        java.lang.String str14 = customerController6.provideEventRating((java.lang.Long) 1L, (java.lang.Integer) 100, "");
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController6.acknowledgeBooking((java.lang.Long) 10L);
        java.lang.String str18 = customerController6.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.lang.String str21 = customerController6.updateCustomerDetails((int) '4', strMap20);
        com.uol.smqa.service.CustomerService customerService22 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService23 = null;
        com.uol.smqa.service.WishListService wishListService24 = null;
        com.uol.smqa.service.EventService eventService25 = null;
        com.uol.smqa.repository.EventRepository eventRepository26 = null;
        com.uol.smqa.repository.ReviewRepository reviewRepository27 = null;
        com.uol.smqa.controller.CustomerController customerController28 = new com.uol.smqa.controller.CustomerController(customerService22, customerBookEventService23, wishListService24, eventService25, eventRepository26, reviewRepository27);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 = customerController28.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> strMapList31 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        java.lang.String str32 = customerController28.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        java.lang.String str33 = customerController6.bookMultipleTickets((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) strMapList31);
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 = customerController6.addEventInWishList((java.lang.Integer) 10, (java.lang.Integer) 10);
        com.uol.smqa.model.Customer customer37 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity38 = customerController6.customerRegistration(customer37);
        java.lang.String str40 = customerController6.getAnalytics((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tickets booked successfully!" + "'", str10, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str14, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str18, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str21, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertNotNull(wildcardResponseEntity30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Tickets booked successfully!" + "'", str32, "Tickets booked successfully!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tickets booked successfully!" + "'", str33, "Tickets booked successfully!");
        org.junit.Assert.assertNotNull(wildcardResponseEntity36);
        org.junit.Assert.assertNotNull(wildcardResponseEntity38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null" + "'", str40, "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
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
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 = customerController6.acknowledgeBooking((java.lang.Long) (-1L));
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.lang.String str11 = customerController6.updateCustomerDetails((int) (short) 0, strMap10);
        java.lang.String str15 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 1, "Tickets booked successfully!");
        java.lang.String str19 = customerController6.provideEventRating((java.lang.Long) 0L, (java.lang.Integer) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList20 = customerController6.getPastEvents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.repository.EventRepository.findByeventDateTime(java.time.LocalDate)\" because \"this.eventRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null" + "'", str11, "Error updating customer details: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str15, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null" + "'", str19, "Error providing rating and review: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.provideEventRating(java.lang.Long, java.lang.Integer, String)\" because \"this.customerBookEventService\" is null");
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
        java.lang.String str10 = adminController5.initiateEventCreation(event8, 100);
        com.uol.smqa.model.Event event11 = null;
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (short) 10);
        com.uol.smqa.model.EventType eventType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = adminController5.updateEventType((java.lang.Long) 1L, eventType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventTypeService.updateEventType(java.lang.Long, com.uol.smqa.model.EventType)\" because \"this.eventTypeService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardResponseEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str10, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
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
        java.lang.String str8 = adminController5.initiateEventCreation(event6, 10);
        com.uol.smqa.model.Event event9 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = adminController5.createEvent(event9);
        com.uol.smqa.model.Event event11 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = adminController5.updateEvent(event11);
        com.uol.smqa.model.Customer customer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer14 = adminController5.CustomerRegistration(customer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertNotNull(wildcardResponseEntity12);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.lang.String str13 = adminController5.initiateEventCreation(event11, (int) (byte) 10);
        com.uol.smqa.model.Event event14 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = adminController5.updateEvent(event14);
        com.uol.smqa.model.Event event16 = null;
        java.lang.String str18 = adminController5.initiateEventCreation(event16, (int) (byte) -1);
        com.uol.smqa.model.Event event19 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = adminController5.createEvent(event19);
        com.uol.smqa.model.Event event21 = null;
        org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = adminController5.createEvent(event21);
        com.uol.smqa.model.Customer customer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer24 = adminController5.AdminCustomerRegistration(customer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str8, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str13, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Failed to initiate event creation. Status: 500" + "'", str18, "Failed to initiate event creation. Status: 500");
        org.junit.Assert.assertNotNull(wildcardResponseEntity20);
        org.junit.Assert.assertNotNull(wildcardResponseEntity22);
    }
}

