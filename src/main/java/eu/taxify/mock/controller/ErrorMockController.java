package eu.taxify.mock.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.taxify.mock.internal.CreateOrderRequest;
import eu.taxify.mock.internal.CreatePaymentMethodRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ErrorMockController
        extends AbstractController {

  private static final String
          USER_CREATE_PAYMENT_METHOD
          = "/user/createPaymentMethod";

  private static final String CLIENT_CREATE_ORDER = "/client/createOrder";
  private static final String GET_PREPARE_PAYMENT_ERROR = "/user/getPreparePaymentError/{order_id}";

  @Autowired
  public ErrorMockController(Logger logger) {
    super(logger);
  }

  @PostMapping(USER_CREATE_PAYMENT_METHOD)
  public String createPaymentMethod(
          @RequestBody CreatePaymentMethodRequest request
  )
          throws InterruptedException, JsonProcessingException {

    String jsonRequest = new ObjectMapper().writeValueAsString(request);

    return sendResponse(
            () -> parseRequest(request),
            jsonRequest,
            USER_CREATE_PAYMENT_METHOD
    );
  }

  @GetMapping(GET_PREPARE_PAYMENT_ERROR)
  public String getPreparePaymentError(
          @PathVariable("order_id") String orderId
  )
          throws InterruptedException, JsonProcessingException {


    return sendResponse(
            () -> parseRequest(orderId),
            orderId,
            USER_CREATE_PAYMENT_METHOD
    );
  }

  private String parseRequest(CreatePaymentMethodRequest request) {
    return "{ code: " + request.getPaymentMethodData().getFirstName() + " }";
  }

  private String parseRequest(CreateOrderRequest request) {
    return "{ code: " + request.getExtraInfo() + " }";
  }

  private String parseRequest(String orderId) {
    return "{ code: 0, client_error: " + orderId + " }";
  }

  @PostMapping(CLIENT_CREATE_ORDER)
  public String createOrder(
          @RequestBody CreateOrderRequest request
  )
          throws InterruptedException, JsonProcessingException {

    String jsonRequest = new ObjectMapper().writeValueAsString(request);

    return sendResponse(
            () -> parseRequest(request),
            jsonRequest,
            CLIENT_CREATE_ORDER
    );
  }
}
