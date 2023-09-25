package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MonitorResponse extends TechnologicalResponse {

  private int inches;

  public MonitorResponse() {

  }

  public MonitorResponse(int inches) {
    this.inches = inches;
  }

  public MonitorResponse(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }

  public MonitorResponse(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description,
      Status status, String brand, String location,
      String detail, LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }
}