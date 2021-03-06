package eu.taxify.mock.paystack;

import eu.taxify.mock.paystack.response.Authorization;
import eu.taxify.mock.paystack.response.Customer;
import lombok.Data;

@Data
public class PaystackResponseHandler {

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
                                             "        \"log\": {},\n" +
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
  public       String successful           = "Successful";
  public       String insufficientFunds    = "Insufficient Funds";


  public String customer(
          final Integer id,
          boolean success
  ) {
    String customerSuccess = success ? CUSTOMER_SUCCESS
                                     : "Invalid id";

    String data = success ? "  \"data\": {\n" +
                            EXAMPLE_TRANSACTIONS +
                            "    \"subscriptions\": [],\n" +
                            Authorization.EXAMPLE_AUTHORIZATIONS +
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

    String data = "   \"data\":{  \n" +
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
                  "      \"log\":{},\n" +
                  "      \"fees\":null,\n" +
                  Authorization.EXAMPLE_AUTHORIZATION +
                  Customer.EXAMPLE_CUSTOMER +
                  "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
                  "   }\n";

    return "{  \n" +
           "   \"status\":" + true + ",\n" +
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
