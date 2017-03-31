package eu.taxify.mock.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.taxify.mock.paystack.ChargeRequest;
import eu.taxify.mock.paystack.PaystackResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.function.Supplier;

@RestController
public class MockController {

  public static final String CUSTOMER_URI           = "/customer";
  public static final String TRANSACTION_VERIFY_URI = "/transaction/verify";
  public static final String
                             TRANSACTION_CHARGE_AUTHORIZATION_URI
                                                    = "/transaction/charge_authorization";
  private PaystackResponse paystackResponse;
  private Logger           logger;

  @Autowired
  public MockController(
          PaystackResponse paystackResponse,
          Logger logger
  ) {
    this.paystackResponse = paystackResponse;
    this.logger = logger;
  }

  @PostMapping(TRANSACTION_CHARGE_AUTHORIZATION_URI)
  public String mockCharge(@RequestBody ChargeRequest chargeRequest)
          throws InterruptedException, JsonProcessingException {

//    Thread.sleep(10000);

    String jsonRequest = new ObjectMapper().writeValueAsString(chargeRequest);

    return sendResponse(() -> {
      if ("NGN".equals(chargeRequest.getCurrency())) {
        return paystackResponse.charge(
                chargeRequest.getAuthorizationCode(),
                100000,
                true
        );
      } else {
        return paystackResponse.chargeCurrencyNotSupported();
      }
    }, jsonRequest, TRANSACTION_CHARGE_AUTHORIZATION_URI);
  }

  @GetMapping(TRANSACTION_VERIFY_URI + "/{reference}")
  public String mockVerify(@PathVariable String reference)
          throws InterruptedException {

    String request = "{ reference: " +
                     reference +
                     " }";
//    Thread.sleep(10000);

    return sendResponse(() -> {
      if (Objects.equals(reference, paystackResponse.VALID_REFERENCE)) {
        return paystackResponse.verifySuccessful(paystackResponse.VALID_REFERENCE);
      } else {
        return paystackResponse.verify(
                reference,
                false,
                paystackResponse.insufficientFunds
        );
      }
    }, request, TRANSACTION_VERIFY_URI);
  }

  @GetMapping(CUSTOMER_URI + "/{id}")
  public String mockGetCustomer(@PathVariable Integer id)
          throws InterruptedException {

    String request = "{ user_id: " + id + " }";

    return sendResponse(() -> {
      if (Objects.equals(id, paystackResponse.VALID_CUSTOMER_ID)) {
        return paystackResponse.customer(id, true);
      } else {
        return paystackResponse.customer(id, false);
      }
    }, request, CUSTOMER_URI);
  }

  private String sendResponse(
          Supplier<String> responseSupplier,
          String request,
          String uri
  ) {
    logger.info("Processing uri: " + uri + " request: " + request);

    String response = responseSupplier.get();

    logger.debug(response);

    return response;
  }

}
