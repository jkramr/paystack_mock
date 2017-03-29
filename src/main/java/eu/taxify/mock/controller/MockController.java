package eu.taxify.mock.controller;

import eu.taxify.mock.config.PaystackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class MockController {

  public static final String AUTHORIZATION =
          "      \"authorization\":{  \n" +
          "         \"authorization_code\":\"AUTH_8dfhjjdt\",\n" +
          "         \"card_type\":\"visa\",\n" +
          "         \"last4\":\"1381\",\n" +
          "         \"exp_month\":\"08\",\n" +
          "         \"exp_year\":\"2018\",\n" +
          "         \"bin\":\"412345\",\n" +
          "         \"bank\":\"TEST BANK\",\n" +
          "         \"channel\":\"card\",\n" +
          "         \"reusable\":true,\n" +
          "         \"country_code\":\"NG\"\n" +
          "         \"signature\":\"SIG_7UkxQpDbSm3jQNKdo19uYaAFj8Teqx\"\n" +
          "      },\n";
  public static final String LOG
          = "      \"log\":{  \n" +
            "         \"time_spent\":9,\n" +
            "         \"attempts\":1,\n" +
            "         \"authentication\":null,\n" +
            "         \"errors\":0,\n" +
            "         \"success\":true,\n" +
            "         \"mobile\":false,\n" +
            "         \"input\":[ ],\n" +
            "         \"channel\":null,\n" +
            "         \"history\":[  \n" +
            "            {  \n" +
            "               \"type\":\"input\",\n" +
            "               \"message\":\"Filled these fields: card number, card expiry, card cvv\",\n" +
            "               \"time\":7\n" +
            "            },\n" +
            "            {  \n" +
            "               \"type\":\"action\",\n" +
            "               \"message\":\"Attempted to pay\",\n" +
            "               \"time\":7\n" +
            "            },\n" +
            "            {  \n" +
            "               \"type\":\"success\",\n" +
            "               \"message\":\"Successfully paid\",\n" +
            "               \"time\":8\n" +
            "            },\n" +
            "            {  \n" +
            "               \"type\":\"close\",\n" +
            "               \"message\":\"Page closed\",\n" +
            "               \"time\":9\n" +
            "            }\n" +
            "         ]\n" +
            "      },\n";
  public static final String CUSTOMER =
          "      \"customer\":{  \n" +
          "         \"id\":84312,\n" +
          "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
          "         \"first_name\":\"BoJack\",\n" +
          "         \"last_name\":\"Horseman\",\n" +
          "         \"email\":\"bojack@horseman.com\"\n" +
          "      },\n";

  public static final String VALID_REFERENCE = "95s05p608n";
  public static final String VERIFICATION_SUCCESSFUL
          = "Verification successful";
  public static final String VERIFICATION_UNSUCCESSFUL
          = "Verification unsuccessful";
  private PaystackResponse paystackResponse;

  @Autowired
  public MockController(PaystackResponse paystackResponse) {
    this.paystackResponse = paystackResponse;
  }

  @GetMapping("/charge")
  public String mockCharge()
          throws InterruptedException {

    Thread.sleep(10000);

    return "[]";
  }

  @GetMapping("/transaction/verify")
  public String mockVerify(@PathVariable String reference)
          throws InterruptedException {

    Thread.sleep(10000);

    if (Objects.equals(reference, VALID_REFERENCE)) {
      return verifySuccessful(VALID_REFERENCE);
    } else {
      return verify(
              reference,
              false,
              paystackResponse.insufficientFunds
      );
    }
  }

  private String verifySuccessful(String validReference) {
    return verify(
            validReference,
            true,
            paystackResponse.successful
    );
  }

  private String verify(
          final String reference,
          boolean success,
          String gatewayResponse
  ) {
    String status = success ? "success" : "failed";

    String message = success ? VERIFICATION_SUCCESSFUL
                             : VERIFICATION_UNSUCCESSFUL;

    return "{  \n" +
           "   \"status\":true,\n" +
           "   \"message\":\"" + message + "\",\n" +
           "   \"data\":{  \n" +
           "      \"amount\":27000,\n" +
           "      \"currency\":\"NGN\",\n" +
           "      \"transaction_date\":\"2016-10-01T11:03:09.000Z\",\n" +
           "      \"status\":\"" + status + "\",\n" +
           "      \"reference\":\"" + reference + "\",\n" +
           "      \"domain\":\"test\",\n" +
           "      \"metadata\":0,\n" +
           "      \"gateway_response\":\"" + gatewayResponse + "\",\n" +
           "      \"message\":null,\n" +
           "      \"channel\":\"card\",\n" +
           "      \"ip_address\":\"41.1.25.1\",\n" +
           LOG +
           "      \"fees\":null,\n" +
           AUTHORIZATION +
           CUSTOMER +
           "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
           "   }\n" +
           "}";
  }

  @GetMapping("/getCustomer")
  public String mockGetCustomer()
          throws InterruptedException {

    Thread.sleep(10000);

    return "[]";
  }
}
