package eu.taxify.mock.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "paystack.payment.response")
public class PaystackResponse {

  public final String VALID_REFERENCE       = "95s05p608n";
  public final String VERIFICATION_SUCCESSFUL
                                            = "Verification successful";
  public final String VERIFICATION_UNSUCCESSFUL
                                            = "Verification unsuccessful";
  public final String EXAMPLE_AUTHORIZATION =
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
  public final String CUSTOMER              =
          "      \"customer\":{  \n" +
          "         \"id\":84312,\n" +
          "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
          "         \"first_name\":\"BoJack\",\n" +
          "         \"last_name\":\"Horseman\",\n" +
          "         \"email\":\"bojack@horseman.com\"\n" +
          "      },\n";
  public final String LOG
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
  public String successful;
  public String insufficientFunds;

  public String verify(
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
           EXAMPLE_AUTHORIZATION +
           CUSTOMER +
           "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
           "   }\n" +
           "}";
  }

  public String verifySuccessful(String validReference) {
    return verify(
            validReference,
            true,
            successful
    );
  }
}
