import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO25 = authServiceImpl3.loginUser("Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = customerController4.PriortyTicketForEvent((java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = customerController4.deleteEventFromWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass17 = organizerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = customerController4.PriortyTicketForEvent((java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList20 = customerController4.getCustomerWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Customer customer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer16 = customerController4.customerRegistration(customer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList20 = customerController4.getCustomerWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList20 = customerController4.getAllEvents(customerEventsFilterSearchCriteria19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.CardDetails cardDetails16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController4.buyMembership(0, cardDetails16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Customer customer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer22 = customerController4.customerRegistration(customer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Organizer organizer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer22 = organizerController4.OrganizerRegistration(organizer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList18 = customerController4.getAllEvents(customerEventsFilterSearchCriteria17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList24 = customerController4.getAllEvents(customerEventsFilterSearchCriteria23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList14 = customerController4.getCustomerWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str22 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str24 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving event analytics: null" + "'", str22, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving event analytics: null" + "'", str24, "Error retrieving event analytics: null");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.CardDetails cardDetails22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 = customerController4.buyMembership((int) (short) 10, cardDetails22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass19 = customerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO11 = authServiceImpl3.loginUser("Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null", "Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController23 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController24 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO27 = authServiceImpl3.loginUser("Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController4.deleteEventFromWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController4.deleteEventFromWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.CardDetails cardDetails18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController4.buyMembership((int) (short) 0, cardDetails18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController23 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO26 = authServiceImpl3.loginUser("Error retrieving event analytics: null", "Error retrieving customer analytics: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList12 = customerController4.getAllBookedEvents((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = customerController4.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList18 = customerController4.getAllBookedEvents((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController23 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController24 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController25 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController26 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO29 = authServiceImpl3.loginUser("Error retrieving customer analytics: null", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = customerController4.bookEvent(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.Organizer organizer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer20 = organizerController4.OrganizerRegistration(organizer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = customerController4.PriortyTicketForEvent((java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList22 = customerController4.getAllEvents(customerEventsFilterSearchCriteria21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController23 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController24 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController25 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController26 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO29 = authServiceImpl3.loginUser("Error retrieving customer analytics: null", "Error retrieving event analytics: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str24 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str26 = customerController4.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.Customer customer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer28 = customerController4.customerRegistration(customer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving customer analytics: null" + "'", str24, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error retrieving customer analytics: null" + "'", str26, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList22 = customerController4.getAllBookedEvents((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 = customerController4.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController17 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController18 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController19 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController20 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController21 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController22 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO25 = authServiceImpl3.loginUser("Error retrieving event analytics: Cannot invoke \"com.uol.smqa.service.EventService.getEventById(java.lang.Integer)\" because \"this.eventService\" is null", "Error retrieving customer analytics: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList20 = customerController4.getAllEvents(customerEventsFilterSearchCriteria19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass15 = customerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList22 = customerController4.getAllEvents(customerEventsFilterSearchCriteria21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.model.CardDetails cardDetails12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 = customerController4.buyMembership((int) 'a', cardDetails12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.model.CardDetails cardDetails16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController4.buyMembership((int) (short) 100, cardDetails16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = customerController4.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = customerController4.PriortyTicketForEvent((java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.CardDetails cardDetails14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController4.buyMembership((int) '4', cardDetails14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO10 = authServiceImpl3.loginUser("Error retrieving event analytics: null", "Error retrieving event analytics: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.model.CardDetails cardDetails18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController4.buyMembership((int) (short) 10, cardDetails18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.CardDetails cardDetails14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 = customerController4.buyMembership((int) (byte) 0, cardDetails14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList20 = customerController4.getCustomerWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str24 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList26 = customerController4.getAllBookedEvents((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving customer analytics: null" + "'", str24, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList22 = customerController4.getAllBookedEvents((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.model.Customer customer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer14 = customerController4.customerRegistration(customer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList14 = customerController4.getAllEvents(customerEventsFilterSearchCriteria13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList16 = customerController4.getAllEvents(customerEventsFilterSearchCriteria15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO16 = authServiceImpl3.loginUser("Error retrieving customer analytics: Cannot invoke \"com.uol.smqa.service.CustomerService.getAnalytics(java.lang.Integer)\" because \"this.customerService\" is null", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = customerController4.bookEvent(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList20 = customerController4.getAllBookedEvents((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer22 = customerController4.customerRegistration(customer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = organizerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Customer customer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer20 = customerController4.customerRegistration(customer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = customerController4.bookEvent(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.CardDetails cardDetails10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 = customerController4.buyMembership((int) (byte) 0, cardDetails10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = customerController4.bookEvent(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = organizerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = customerController4.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.uol.smqa.service.UsersService usersService0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        com.uol.smqa.utils.JwtUtils jwtUtils2 = null;
        com.uol.smqa.service.impl.AuthServiceImpl authServiceImpl3 = new com.uol.smqa.service.impl.AuthServiceImpl(usersService0, authenticationManager1, jwtUtils2);
        com.uol.smqa.controller.AuthController authController4 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController5 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController6 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController7 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController8 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController9 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController10 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController11 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController12 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController13 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController14 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController15 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        com.uol.smqa.controller.AuthController authController16 = new com.uol.smqa.controller.AuthController((com.uol.smqa.service.AuthService) authServiceImpl3);
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.dtos.response.LoginResponseDTO loginResponseDTO19 = authServiceImpl3.loginUser("", "Error retrieving event analytics: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.UsersService.findByEmail(String)\" because \"this.usersService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        com.uol.smqa.model.Event event19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 = organizerController4.createEvent(event19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.model.Event.getEventType()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = organizerController4.createEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.model.Event.getEventType()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList10 = customerController4.getAllEvents(customerEventsFilterSearchCriteria9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController4.deleteEventFromWishList((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = customerController4.bookEvent(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList12 = customerController4.getAllEvents(customerEventsFilterSearchCriteria11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer24 = customerController4.customerRegistration(customer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.CardDetails cardDetails18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 = customerController4.buyMembership((int) '4', cardDetails18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = customerController4.bookEvent(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"requestBody\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.CardDetails cardDetails16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 = customerController4.buyMembership((int) ' ', cardDetails16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = customerController4.PriortyTicketForEvent((java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 = customerController4.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 1);
        com.uol.smqa.model.CardDetails cardDetails20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 = customerController4.buyMembership((int) (byte) 1, cardDetails20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.buyMembership(int, com.uol.smqa.model.CardDetails)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 = customerController4.deleteEventFromWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        com.uol.smqa.model.Customer customer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer22 = customerController4.customerRegistration(customer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 = customerController4.deleteEventFromWishList((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = customerController4.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = organizerController4.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Customer customer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Customer customer20 = customerController4.customerRegistration(customer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.CustomerRegistration(com.uol.smqa.model.Customer)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = customerController4.PriortyTicketForEvent((java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.CustomerBookEvent> customerBookEventList22 = customerController4.getAllBookedEvents((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerService.getCustomerById(int)\" because \"this.customerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController4.deleteEventFromWishList((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList20 = customerController4.getCustomerWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.WishList> wishListList22 = customerController4.getCustomerWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.getCustomerWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Organizer organizer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer22 = organizerController4.OrganizerRegistration(organizer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 100);
        com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria customerEventsFilterSearchCriteria17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.uol.smqa.model.Event> eventList18 = customerController4.getAllEvents(customerEventsFilterSearchCriteria17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.EventService.getAllEventsBySearchCriteria(com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria)\" because \"this.eventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) (-1));
        java.lang.String str20 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str22 = customerController4.getAnalytics((java.lang.Integer) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving customer analytics: null" + "'", str20, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving customer analytics: null" + "'", str22, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str18 = customerController4.getAnalytics((java.lang.Integer) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving customer analytics: null" + "'", str18, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 100);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str12 = customerController4.getAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str16 = customerController4.getAnalytics((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = customerController4.PriortyTicketForEvent((java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.CustomerBookEventService.PriortyTicketForEvent(java.lang.Integer, java.lang.Integer)\" because \"this.customerBookEventService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving customer analytics: null" + "'", str12, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving customer analytics: null" + "'", str14, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving customer analytics: null" + "'", str16, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.model.Organizer organizer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.uol.smqa.model.Organizer organizer16 = organizerController4.OrganizerRegistration(organizer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.OrganizerService.OrganizerRegistration(com.uol.smqa.model.Organizer)\" because \"this.organizerService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        com.uol.smqa.model.Event event21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 = organizerController4.createEvent(event21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.model.Event.getEventType()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.uol.smqa.service.CustomerService customerService0 = null;
        com.uol.smqa.service.CustomerBookEventService customerBookEventService1 = null;
        com.uol.smqa.service.WishListService wishListService2 = null;
        com.uol.smqa.service.EventService eventService3 = null;
        com.uol.smqa.controller.CustomerController customerController4 = new com.uol.smqa.controller.CustomerController(customerService0, customerBookEventService1, wishListService2, eventService3);
        java.lang.String str6 = customerController4.getAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = customerController4.getAnalytics((java.lang.Integer) 1);
        java.lang.String str10 = customerController4.getAnalytics((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 = customerController4.deleteEventFromWishList((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.service.WishListService.deleteEventFromWishList(java.lang.Integer)\" because \"this.wishlistService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving customer analytics: null" + "'", str6, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving customer analytics: null" + "'", str8, "Error retrieving customer analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving customer analytics: null" + "'", str10, "Error retrieving customer analytics: null");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        java.lang.String str22 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str24 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str26 = organizerController4.getEventAnalytics((java.lang.Integer) 1);
        java.lang.String str28 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str30 = organizerController4.getEventAnalytics((java.lang.Integer) (-1));
        com.uol.smqa.model.Event event31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 = organizerController4.createEvent(event31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.uol.smqa.model.Event.getEventType()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving event analytics: null" + "'", str22, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving event analytics: null" + "'", str24, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Error retrieving event analytics: null" + "'", str26, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Error retrieving event analytics: null" + "'", str28, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Error retrieving event analytics: null" + "'", str30, "Error retrieving event analytics: null");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.uol.smqa.service.EventTypeService eventTypeService0 = null;
        com.uol.smqa.service.OrganizerService organizerService1 = null;
        com.uol.smqa.service.EventService eventService2 = null;
        com.uol.smqa.service.EventReviewService eventReviewService3 = null;
        com.uol.smqa.controller.OrganizerController organizerController4 = new com.uol.smqa.controller.OrganizerController(eventTypeService0, organizerService1, eventService2, eventReviewService3);
        java.lang.String str6 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str8 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str10 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str12 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str14 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str16 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str18 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
        java.lang.String str20 = organizerController4.getEventAnalytics((java.lang.Integer) 0);
        java.lang.String str22 = organizerController4.getEventAnalytics((java.lang.Integer) 100);
        java.lang.String str24 = organizerController4.getEventAnalytics((java.lang.Integer) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Error retrieving event analytics: null" + "'", str6, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Error retrieving event analytics: null" + "'", str8, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Error retrieving event analytics: null" + "'", str10, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Error retrieving event analytics: null" + "'", str12, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Error retrieving event analytics: null" + "'", str14, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Error retrieving event analytics: null" + "'", str16, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Error retrieving event analytics: null" + "'", str18, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Error retrieving event analytics: null" + "'", str20, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Error retrieving event analytics: null" + "'", str22, "Error retrieving event analytics: null");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Error retrieving event analytics: null" + "'", str24, "Error retrieving event analytics: null");
    }
}
