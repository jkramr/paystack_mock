package eu.taxify.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PaymentApplication {

  public static void main(String[] args) {
    SpringApplication.run(PaymentApplication.class, args);
  }

  @RestController
  public class MockController {

    @GetMapping("/charge")
    public String mockCharge()
            throws InterruptedException {

      Thread.sleep(10000);

      return "[]";
    }

    @GetMapping("/verify")
    public String mockVerify()
            throws InterruptedException {

      Thread.sleep(10000);

      return "[]";
    }

    @GetMapping("/getCustomer")
    public String mockGetCustomer()
            throws InterruptedException {

      Thread.sleep(10000);

      return "[]";
    }
  }
}
