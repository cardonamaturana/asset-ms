package com.cardonamaturana.assetms.infrastructure.repository.maintenance;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.furniture.FurnitureDto;
import java.time.LocalDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("assets")
@TypeAlias("MaintenanceDto")
public class MaintenanceDto extends FurnitureDto {

  private String maintenanceOwnerId;

  public MaintenanceDto() {

  }

  public MaintenanceDto(String maintenanceOwnerId) {
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceDto(String manufacturer, String location, Long quantity, String detail,
      String maintenanceOwnerId) {
    super(manufacturer, location, quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String manufacturer, String location, Long quantity,
      String detail, String maintenanceOwnerId) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, manufacturer, location,
        quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }
}