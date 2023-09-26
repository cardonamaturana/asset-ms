package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;

@Data
public class FurnitureResponse extends AssetResponse {


  private String manufacturer;
  private String location;
  private Long quantity;
  private String detail;

  public FurnitureResponse() {

  }

  public FurnitureResponse(String manufacturer, String location, Long quantity, String detail) {
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }

  public FurnitureResponse(String id, AssigneeResponse assigneeResponse, LocalDate purchaseDate,
      String invoiceNumber, String description, Status status, String manufacturer, String location,
      Long quantity, String detail) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status);
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }

}