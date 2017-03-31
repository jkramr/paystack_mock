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

  private PaystackResponse paystackResponse;
  private Logger logger;

  @Autowired
  public MockController(
          PaystackResponse paystackResponse,
          Logger logger
  ) {
    this.paystackResponse = paystackResponse;
    this.logger = logger;
  }

  @PostMapping("/transaction/charge_authorization")
  public String mockCharge()
          throws InterruptedException {

//    Thread.sleep(10000);

    return "[]";
  }

  @GetMapping("/transaction/verify/{reference}")
  public String mockVerify(@PathVariable String reference)
          throws InterruptedException {

//    Thread.sleep(10000);

    if (Objects.equals(reference, paystackResponse.VALID_REFERENCE)) {
      return paystackResponse.verifySuccessful(paystackResponse.VALID_REFERENCE);
    } else {
      return paystackResponse.verify(
              reference,
              false,
              paystackResponse.insufficientFunds
      );
    }
  }

  @GetMapping("/customer/{id}")
  public String mockGetCustomer(@PathVariable Integer id)
          throws InterruptedException {

//    Thread.sleep(10000);

    return "[]";
  }
}
