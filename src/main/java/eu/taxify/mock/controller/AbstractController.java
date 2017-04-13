package eu.taxify.mock.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Supplier;

public class AbstractController {

  private Logger logger;

  @Autowired
  public AbstractController(
          Logger logger
  ) {
    this.logger = logger;
  }

  protected String sendResponse(
          Supplier<String> responseSupplier,
          String request,
          String uri
  ) {
    logger.debug("Processing uri: " + uri + " request: " + request);
    System.out.println("Processing uri: " + uri + " request: " + request);

    String response = responseSupplier.get();

    logger.debug(response);
    System.out.println(response);

    return response;
  }
}
