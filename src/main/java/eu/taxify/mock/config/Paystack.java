package eu.taxify.mock.config;

import eu.taxify.mock.paystack.PaystackResponse;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@EnableConfigurationProperties
@PropertySource("classpath:paystack.properties")
public class Paystack {

  @Bean
  PaystackResponse paystackResponse() {
    return new PaystackResponse();
  }
}