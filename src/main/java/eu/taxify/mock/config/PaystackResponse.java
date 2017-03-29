package eu.taxify.mock.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:paystack.properties")
@ConfigurationProperties("paystack.payment.response")
public class PaystackResponse {

  public String successful;
  public String insufficientFunds;
}
