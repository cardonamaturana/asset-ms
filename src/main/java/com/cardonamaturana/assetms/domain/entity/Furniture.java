package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Furniture extends Asset {


  private String manufacturer;
  private String location;
  private Long quantity;
  private String detail;

  public Furniture() {

  }

  public Furniture(String manufacturer, String location, Long quantity, String detail) {
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }

  public Furniture(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description, Status status, String manufacturer, String location,
      Long quantity, String detail) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }
}