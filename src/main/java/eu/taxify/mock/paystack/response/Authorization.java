package eu.taxify.mock.paystack.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Authorization {

  public static final String AUTHORISATION          = "      {\n" +
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
                                                      "      }\n";
  public static final String EXAMPLE_AUTHORIZATIONS =
          "    \"authorizations\": [\n" +
          AUTHORISATION +
          "    ],\n";
  public static final String EXAMPLE_AUTHORIZATION =
          "      \"authorization\":" +
          AUTHORISATION + ",";


  @JsonProperty("authorization_code")
  private String authorizationCode;
  private Integer bin;
  private Integer last4;
  @JsonProperty("exp_month")
  private Integer expiryMonth;
  @JsonProperty("exp_year")
  private Integer expiryYear;
  @JsonProperty("card_type")
  private String cardType;
  private String bank;
  @JsonProperty("country_code")
  private String countryCode;
  private String brand;
  private boolean reusable;
  private String signature;
}
