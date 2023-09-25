package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import com.cardonamaturana.assetms.domain.entity.Status;
import java.time.LocalDate;
import lombok.Data;

@Data
public class PermanentRequest extends FurnitureRequest {

  public PermanentRequest() {

  }

  public PermanentRequest(String manufacturer, String location, Long quantity, String detail) {
    super(manufacturer, location, quantity, detail);
  }

  public PermanentRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String manufacturer, String location, Long quantity,
      String detail) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId, manufacturer, location,
        quantity, detail);
  }

}