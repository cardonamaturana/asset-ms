package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MaintenanceResponse extends FurnitureResponse {

  private String maintenanceOwnerId;

  public MaintenanceResponse() {

  }

  public MaintenanceResponse(String maintenanceOwnerId) {
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceResponse(String manufacturer, String location, Long quantity, String detail,
      String maintenanceOwnerId) {
    super(manufacturer, location, quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceResponse(String id, AssigneeResponse assigneeResponse, LocalDate purchaseDate,
      String invoiceNumber, String description,
      Status status, String manufacturer, String location,
      Long quantity, String detail, String maintenanceOwnerId) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status, manufacturer, location,
        quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }
}