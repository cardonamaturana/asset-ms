package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MaintenanceRequest extends FurnitureRequest {

  @Schema(name = "maintenanceOwnerId",
      description = "id del responsable del mantenimiento : Campo Obligarorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Activo",
      type = "text")
  @NotBlank(message = "id del responsable del mantenimiento : Campo Obligarorio")
  private String maintenanceOwnerId;

  public MaintenanceRequest() {

  }

  public MaintenanceRequest(String maintenanceOwnerId) {
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceRequest(String manufacturer, String location, Long quantity, String detail,
      String maintenanceOwnerId) {
    super(manufacturer, location, quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }

  public MaintenanceRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String manufacturer, String location, Long quantity,
      String detail, String maintenanceOwnerId) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId, manufacturer, location,
        quantity, detail);
    this.maintenanceOwnerId = maintenanceOwnerId;
  }
}