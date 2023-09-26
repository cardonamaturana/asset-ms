package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;

@Data
public class PermanentResponse extends FurnitureResponse {

  public PermanentResponse() {

  }

  public PermanentResponse(String manufacturer, String location, Long quantity, String detail) {
    super(manufacturer, location, quantity, detail);
  }

  public PermanentResponse(String id,
      AssigneeResponse assigneeResponse,
      LocalDate purchaseDate, String invoiceNumber, String description,
      Status status, String manufacturer, String location,
      Long quantity, String detail) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status, manufacturer,
        location, quantity, detail);
  }
}