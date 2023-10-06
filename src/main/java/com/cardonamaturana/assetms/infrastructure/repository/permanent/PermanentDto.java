package com.cardonamaturana.assetms.infrastructure.repository.permanent;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.furniture.FurnitureDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("MaintenanceDto")
public class PermanentDto extends FurnitureDto {

  public PermanentDto() {

  }

  public PermanentDto(String manufacturer, String location, Long quantity, String detail) {
    super(manufacturer, location, quantity, detail);
  }

  public PermanentDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String manufacturer, String location, Long quantity,
      String detail) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, manufacturer, location,
        quantity, detail);
  }

}