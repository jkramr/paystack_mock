package eu.taxify.mock.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePaymentMethodRequest {
  @JsonProperty("payment_method_data")
  PaymentMethodData paymentMethodData;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class PaymentMethodData {
    @JsonProperty("first_name")
    String firstName;
  }
}