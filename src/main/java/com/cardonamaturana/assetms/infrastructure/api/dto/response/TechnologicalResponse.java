package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;


@Data
public class TechnologicalResponse extends AssetResponse {

  private String brand;
  private String location;
  private String detail;
  private LocalDate warrantyExpirationDate;
  private String warrantyDetails;

  public TechnologicalResponse() {

  }

  public TechnologicalResponse(String brand, String location, String detail,
      LocalDate warrantyExpirationDate,
      String warrantyDetails) {
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }

  public TechnologicalResponse(String id, AssigneeResponse assigneeResponse, LocalDate purchaseDate,
      String invoiceNumber,
      String description, Status status, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status);
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }

}