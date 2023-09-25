package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;

@Data
public class Computer extends Technological {

  private String processor;
  private String ramQuantity;
  private String storageQuantity;

  public Computer() {

  }


  public Computer(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity, String storageQuantity) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public Computer(String processor, String ramQuantity, String storageQuantity) {
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }
}