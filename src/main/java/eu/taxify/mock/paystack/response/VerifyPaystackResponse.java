package eu.taxify.mock.paystack.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerifyPaystackResponse
        extends PaystackResponse {

  private VerifyData data;

  @Data
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  private class VerifyData {
    private Integer amount;

    private String currency;

    @JsonProperty("transaction_date")
    private String transactionDate;

    private String status;

    private String reference;

    private String domain;

    private String metadata;

    @JsonProperty("gateway_response")
    private String gatewayResponse;

    private String channel;

    @JsonProperty("ip_address")
    private String ipAddress;

    private String log;

    private String fees;

    private Authorization authorization;

    private Customer customer;

    private String plan;
  }
}
