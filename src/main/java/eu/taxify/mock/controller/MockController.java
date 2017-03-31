package eu.taxify.mock.controller;

import eu.taxify.mock.config.PaystackResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class MockController {

  public static final String CUSTOMER_URI = "/customer";
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
  public String mockCharge()
          throws InterruptedException {

//    Thread.sleep(10000);

    return "[]";
  }

  @GetMapping(TRANSACTION_VERIFY_URI + "/{reference}")
  public String mockVerify(@PathVariable String reference)
          throws InterruptedException {

    logger.debug("Processing " + TRANSACTION_VERIFY_URI + " request: { reference: " + reference + " }");
//    Thread.sleep(10000);

    String response;

    if (Objects.equals(reference, paystackResponse.VALID_REFERENCE)) {
      response =
              paystackResponse.verifySuccessful(paystackResponse.VALID_REFERENCE);
    } else {
      response =
              paystackResponse.verify(
                      reference,
                      false,
                      paystackResponse.insufficientFunds
              );
    }

    logger.debug(response);

    return response;
  }

  @GetMapping(CUSTOMER_URI + "/{id}")
  public String mockGetCustomer(@PathVariable Integer id)
          throws InterruptedException {

    String request = "{ user_id: " + id + " }";

    logger.debug("Processing uri: " + CUSTOMER_URI + " request: " + request);
//    Thread.sleep(10000);

    String response;

    response = paystackResponse.customer(id, true);

    logger.debug(response);

    return response;
  }

}
