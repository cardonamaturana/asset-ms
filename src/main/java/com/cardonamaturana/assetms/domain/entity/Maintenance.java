package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;

@Data
public class Maintenance extends Furniture {

  private String maintenanceOwnerId;

  public Maintenance(){

  }

  public Maintenance(String maintenanceOwnerId) {
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public Maintenance(String manufacturer, String location, Long quantity, String detail,
      String maintenanceOwnerId) {
    super(manufacturer, location, quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public Maintenance(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description, Status status, String manufacturer, String location,
      Long quantity, String detail, String maintenanceOwnerId) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, manufacturer, location,
        quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }
}