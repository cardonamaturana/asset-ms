package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;


@Data
@ToString(callSuper = true)
public class Technological extends Asset {

  private String brand;
  private String location;
  private String detail;
  private LocalDate warrantyExpirationDate;
  private String warrantyDetails;

  public Technological() {

  }

  public Technological(String brand, String location, String detail,
      LocalDate warrantyExpirationDate,
      String warrantyDetails) {
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }

  public Technological(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }
}