package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Permanent extends Furniture {

  public Permanent() {

  }

  public Permanent(String manufacturer, String location, Long quantity, String detail) {
    super(manufacturer, location, quantity, detail);
  }

  public Permanent(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description, Status status, String manufacturer, String location,
      Long quantity, String detail) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, manufacturer, location,
        quantity, detail);
  }

}