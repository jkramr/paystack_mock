package eu.taxify.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
public class PaymentApplication {

  public static void main(String[] args) {
    SpringApplication.run(PaymentApplication.class, args);
  }

  @RestController
  public class MockController {

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

      if (Objects.equals(reference, "95s05p608n")) {
        return "{  \n" +
               "   \"status\":true,\n" +
               "   \"message\":\"Verification successful\",\n" +
               "   \"data\":{  \n" +
               "      \"amount\":27000,\n" +
               "      \"currency\":\"NGN\",\n" +
               "      \"transaction_date\":\"2016-10-01T11:03:09.000Z\",\n" +
               "      \"status\":\"success\",\n" +
               "      \"reference\":\"95s05p608n\",\n" +
               "      \"domain\":\"test\",\n" +
               "      \"metadata\":0,\n" +
               "      \"gateway_response\":\"Successful\",\n" +
               "      \"message\":null,\n" +
               "      \"channel\":\"card\",\n" +
               "      \"ip_address\":\"41.1.25.1\",\n" +
               "      \"log\":{  \n" +
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
               "      },\n" +
               "      \"fees\":null,\n" +
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
               "      },\n" +
               "      \"customer\":{  \n" +
               "         \"id\":84312,\n" +
               "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
               "         \"first_name\":\"BoJack\",\n" +
               "         \"last_name\":\"Horseman\",\n" +
               "         \"email\":\"bojack@horseman.com\"\n" +
               "      },\n" +
               "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
               "   }\n" +
               "}";
      } else {
        return "{  \n" +
               "   \"status\":true,\n" +
               "   \"message\":\"Verification unsuccessful\",\n" +
               "   \"data\":{  \n" +
               "      \"amount\":27000,\n" +
               "      \"currency\":\"NGN\",\n" +
               "      \"transaction_date\":\"2016-10-01T11:03:09.000Z\",\n" +
               "      \"status\":\"failed\",\n" +
               "      \"reference\":\"DG4uishudoq90LD\",\n" +
               "      \"domain\":\"test\",\n" +
               "      \"metadata\":0,\n" +
               "      \"gateway_response\":\"Failed\",\n" +
               "      \"message\":null,\n" +
               "      \"channel\":\"card\",\n" +
               "      \"ip_address\":\"41.1.25.1\",\n" +
               "      \"log\":{  \n" +
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
               "      },\n" +
               "      \"fees\":null,\n" +
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
               "      },\n" +
               "      \"customer\":{  \n" +
               "         \"id\":84312,\n" +
               "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
               "         \"first_name\":\"BoJack\",\n" +
               "         \"last_name\":\"Horseman\",\n" +
               "         \"email\":\"bojack@horseman.com\"\n" +
               "      },\n" +
               "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
               "   }\n" +
               "}";
      }
    }

    @GetMapping("/getCustomer")
    public String mockGetCustomer()
            throws InterruptedException {

      Thread.sleep(10000);

      return "[]";
    }
  }
}
