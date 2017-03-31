package eu.taxify.mock.paystack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeRequest {

  String reference;
  @JsonProperty("authorization_code")
  String authorizationCode;
  String email;
  Integer amount;
  String currency;
}
