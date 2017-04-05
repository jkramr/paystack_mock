package eu.taxify.mock.paystack;

import lombok.Data;

@Data
public class PaystackResponse {

  public static final String  EXAMPLE_AUTHORIZATIONS =
          "    \"authorizations\": [\n" +
          "      {\n" +
          "        \"authorization_code\": \"AUTH_xnf39jtr\",\n" +
          "        \"bin\": \"412345\",\n" +
          "        \"last4\": \"1381\",\n" +
          "        \"exp_month\": \"02\",\n" +
          "        \"exp_year\": \"2020\",\n" +
          "        \"channel\": \"card\",\n" +
          "        \"card_type\": \"visa\",\n" +
          "        \"bank\": \"TEST BANK\",\n" +
          "        \"country_code\": \"NG\",\n" +
          "        \"brand\": \"visa\",\n" +
          "        \"reusable\": true,\n" +
          "        \"signature\": \"SIG_y8PqDaob8DcMVqt9vHJj\"\n" +
          "      }\n" +
          "    ],\n";
  public static final String
                              GENERATED_EMAIL
                                                     = "ce432e7f8d6fde4@payment.taxify.eu";
  public static final String  CUSTOMER_SUCCESS       = "Customer retrieved";
  public final        Integer VALID_CUSTOMER_ID      = 189122;
  public final        String  VALID_REFERENCE        = "95s05p608n";
  public final        String  VERIFICATION_SUCCESSFUL
                                                     = "Verification successful";
  public final        String  VERIFICATION_UNSUCCESSFUL
                                                     = "Verification unsuccessful";
  public final        String  EXAMPLE_AUTHORIZATION  =
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
          "         \"country_code\":\"NG\",\n" +
          "         \"signature\":\"SIG_7UkxQpDbSm3jQNKdo19uYaAFj8Teqx\"\n" +
          "      },\n";
  public final        String  CUSTOMER               =
          "      \"customer\":{  \n" +
          "         \"id\":" + VALID_CUSTOMER_ID + ",\n" +
          "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
          "         \"first_name\":\"BoJack\",\n" +
          "         \"last_name\":\"Horseman\",\n" +
          "         \"email\":\"bojack@horseman.com\"\n" +
          "      },\n";
  public final        String  LOG
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

  public final String EXAMPLE_TRANSACTIONS = "    \"transactions\": [\n" +
                                             "      {\n" +
                                             "        \"id\": 731980,\n" +
                                             "        \"domain\": \"test\",\n" +
                                             "        \"status\": \"success\",\n" +
                                             "        \"reference\": \"95s05p608n\",\n" +
                                             "        \"amount\": 500000,\n" +
                                             "        \"message\": null,\n" +
                                             "        \"gateway_response\": \"Successful\",\n" +
                                             "        \"paid_at\": \"2017-02-06T16:17:26.000Z\",\n" +
                                             "        \"created_at\": \"2017-02-06T16:16:47.000Z\",\n" +
                                             "        \"channel\": \"card\",\n" +
                                             "        \"currency\": \"NGN\",\n" +
                                             "        \"ip_address\": \"90.190.180.5\",\n" +
                                             "        \"metadata\": \"\",\n" +
                                             "        \"log\": {\n" +
                                             "          \"time_spent\": 27,\n" +
                                             "          \"attempts\": 1,\n" +
                                             "          \"authentication\": null,\n" +
                                             "          \"errors\": 0,\n" +
                                             "          \"success\": true,\n" +
                                             "          \"mobile\": false,\n" +
                                             "          \"input\": [],\n" +
                                             "          \"channel\": null,\n" +
                                             "          \"history\": [\n" +
                                             "            {\n" +
                                             "              \"type\": \"input\",\n" +
                                             "              \"message\": \"Filled these fields: card expiry, card cvv\",\n" +
                                             "              \"time\": 26\n" +
                                             "            },\n" +
                                             "            {\n" +
                                             "              \"type\": \"action\",\n" +
                                             "              \"message\": \"Attempted to pay\",\n" +
                                             "              \"time\": 26\n" +
                                             "            },\n" +
                                             "            {\n" +
                                             "              \"type\": \"success\",\n" +
                                             "              \"message\": \"Successfully paid\",\n" +
                                             "              \"time\": 27\n" +
                                             "            }\n" +
                                             "          ]\n" +
                                             "        },\n" +
                                             "        \"fees\": 5000,\n" +
                                             "        \"fees_split\": null,\n" +
                                             "        \"customer\": {},\n" +
                                             "        \"authorization\": {},\n" +
                                             "        \"plan\": {},\n" +
                                             "        \"subaccount\": {},\n" +
                                             "        \"paidAt\": \"2017-02-06T16:17:26.000Z\",\n" +
                                             "        \"createdAt\": \"2017-02-06T16:16:47.000Z\"\n" +
                                             "      }\n" +
                                             "    ],\n";
  public String successful = "Successful";
  public String insufficientFunds = "Insufficient Funds";


  public String customer(
          final Integer id,
          boolean success
  ) {
    String customerSuccess = success ? CUSTOMER_SUCCESS
                                     : "Invalid id";

    String data = success ? "  \"data\": {\n" +
                            EXAMPLE_TRANSACTIONS +
                            "    \"subscriptions\": [],\n" +
                            EXAMPLE_AUTHORIZATIONS +
                            "    \"first_name\": \"\",\n" +
                            "    \"last_name\": \"\",\n" +
                            "    \"email\": \"" + GENERATED_EMAIL + "\",\n" +
                            "    \"phone\": \"\",\n" +
                            "    \"metadata\": null,\n" +
                            "    \"domain\": \"test\",\n" +
                            "    \"customer_code\": \"CUS_mdv4cfk2jehfdfg\",\n" +
                            "    \"risk_action\": \"default\",\n" +
                            "    \"id\": " + id + ",\n" +
                            "    \"integration\": 105221,\n" +
                            "    \"createdAt\": \"2017-02-06T16:13:17.000Z\",\n" +
                            "    \"updatedAt\": \"2017-03-07T19:42:53.000Z\",\n" +
                            "    \"total_transactions\": 605,\n" +
                            "    \"total_transaction_value\": [\n" +
                            "      {\n" +
                            "        \"currency\": \"NGN\",\n" +
                            "        \"amount\": 62100000\n" +
                            "      }\n" +
                            "    ]\n" +
                            "  }\n"
                          : "";
    return "{\n" +
           "  \"status\": " + success + ",\n" +
           "  \"message\": \"" + customerSuccess + "\",\n" +
           data +
           "}";
  }

  public String verify(
          final String reference,
          boolean success,
          String gatewayResponse
  ) {
    String status = success ? "success"
                            : "failed";

    String message = success ? VERIFICATION_SUCCESSFUL
                             : VERIFICATION_UNSUCCESSFUL;

    String data = success ? "   \"data\":{  \n" +
                            "      \"amount\":27000,\n" +
                            "      \"currency\":\"NGN\",\n" +
                            "      \"transaction_date\":\"2016-10-01T11:03:09.000Z\",\n" +
                            "      \"status\":\"" +
                            status +
                            "\",\n" +
                            "      \"reference\":\"" +
                            reference +
                            "\",\n" +
                            "      \"domain\":\"test\",\n" +
                            "      \"metadata\":0,\n" +
                            "      \"gateway_response\":\"" +
                            gatewayResponse +
                            "\",\n" +
                            "      \"message\":null,\n" +
                            "      \"channel\":\"card\",\n" +
                            "      \"ip_address\":\"41.1.25.1\",\n" +
                            LOG +
                            "      \"fees\":null,\n" +
                            EXAMPLE_AUTHORIZATION +
                            CUSTOMER +
                            "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
                            "   }\n"
                          : "";

    return "{  \n" +
           "   \"status\":" + success + ",\n" +
           "   \"message\":\"" + message + "\",\n" +
           data +
           "}";
  }

  public String verifySuccessful(String validReference) {
    return verify(
            validReference,
            true,
            successful
    );
  }

  public String charge(
          String authorisationCode,
          Integer amount,
          boolean acceptRequest,
          boolean success,
          String gatewayResponse
  ) {
    String status = success ? "success" : "failed";

    String data = acceptRequest ? "  \"data\": {\n" +
                                  "    \"amount\": " +
                                  amount +
                                  ",\n" +
                                  "    \"currency\": \"NGN\",\n" +
                                  "    \"transaction_date\": \"2017-03-31T12:05:51.000Z\",\n" +
                                  "    \"status\": \"" +
                                  status +
                                  "\",\n" +
                                  "    \"reference\": \"action-33b100fa3a77f8445226\",\n" +
                                  "    \"domain\": \"test\",\n" +
                                  "    \"metadata\": \"\",\n" +
                                  "    \"gateway_response\": \"" +
                                  gatewayResponse +
                                  "\",\n" +
                                  "    \"message\": null,\n" +
                                  "    \"channel\": \"card\",\n" +
                                  "    \"ip_address\": null,\n" +
                                  "    \"log\": null,\n" +
                                  "    \"fees\": 1000,\n" +
                                  "    \"authorization\": {\n" +
                                  "      \"authorization_code\": \"" +
                                  authorisationCode +
                                  "\",\n" +
                                  "      \"bin\": \"412345\",\n" +
                                  "      \"last4\": \"1381\",\n" +
                                  "      \"exp_month\": \"02\",\n" +
                                  "      \"exp_year\": \"2020\",\n" +
                                  "      \"channel\": \"card\",\n" +
                                  "      \"card_type\": \"visa\",\n" +
                                  "      \"bank\": \"TEST BANK\",\n" +
                                  "      \"country_code\": \"NG\",\n" +
                                  "      \"brand\": \"visa\",\n" +
                                  "      \"reusable\": true,\n" +
                                  "      \"signature\": \"SIG_y8PqDaob8DcMVqt9vHJj\"\n" +
                                  "    },\n" +
                                  "    \"customer\": {\n" +
                                  "      \"id\": 189122,\n" +
                                  "      \"first_name\": \"\",\n" +
                                  "      \"last_name\": \"\",\n" +
                                  "      \"email\": \"" +
                                  GENERATED_EMAIL +
                                  "\",\n" +
                                  "      \"customer_code\": \"CUS_mdv4cfk2jehfdfg\",\n" +
                                  "      \"phone\": \"\",\n" +
                                  "      \"metadata\": null,\n" +
                                  "      \"risk_action\": \"default\"\n" +
                                  "    },\n" +
                                  "    \"plan\": 0\n" +
                                  "  }\n"
                                : "";

    return "{\n" +
           "  \"status\": " + acceptRequest + ",\n" +
           "  \"message\": \"Charge attempted\",\n" +
           data +
           "}";
  }

  public String chargeCurrencyNotSupported() {
    return "{\"status\":false,\"message\":\"Currency not supported by merchant\"}";
  }

  public String chargeFail() {
    return charge(
            VALID_REFERENCE,
            0,
            true,
            false,
            insufficientFunds
    );
  }
}
