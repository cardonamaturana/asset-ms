package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MonitorRequest extends TechnologicalRequest {


  @Schema(name = "inches",
      description = "pulgadas del monitor : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "15",
      type = "text")
  private int inches;


  public MonitorRequest() {

  }

  public MonitorRequest(int inches) {
    this.inches = inches;
  }

  public MonitorRequest(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }

  public MonitorRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }
}