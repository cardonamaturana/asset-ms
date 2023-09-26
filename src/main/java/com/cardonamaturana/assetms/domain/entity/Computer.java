package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Computer extends Technological {

  private String processor;
  private String ramQuantity;
  private String storageQuantity;

  public Computer() {

  }


  public Computer(String processor, String ramQuantity, String storageQuantity) {
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public Computer(String brand, String location, String detail, LocalDate warrantyExpirationDate,
      String warrantyDetails, String processor, String ramQuantity, String storageQuantity) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public Computer(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity,
      String storageQuantity) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }
}