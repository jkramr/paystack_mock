package eu.taxify.mock.paystack.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
  public static final        String EXAMPLE_CUSTOMER =
          "      \"customer\":{  \n" +
          "         \"id\":" + 189122 + ",\n" +
          "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
          "         \"first_name\":\"BoJack\",\n" +
          "         \"last_name\":\"Horseman\",\n" +
          "         \"email\":\"bojack@horseman.com\"\n" +
          "      },\n";
}
