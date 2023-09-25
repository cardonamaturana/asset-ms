package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import java.time.LocalDate;
import lombok.Data;


@Data
public class ComputerResponse extends TechnologicalResponse {

  private String processor;
  private String ramQuantity;
  private String storageQuantity;

  public ComputerResponse() {

  }


  public ComputerResponse(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity, String storageQuantity) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public ComputerResponse(String processor, String ramQuantity, String storageQuantity) {
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

}