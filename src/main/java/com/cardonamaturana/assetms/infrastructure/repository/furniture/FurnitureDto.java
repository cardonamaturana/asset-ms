package com.cardonamaturana.assetms.infrastructure.repository.furniture;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("FurnitureDto")
public class FurnitureDto extends AssetDto {

  private String manufacturer;
  private String location;
  private Long quantity;
  private String detail;


  public FurnitureDto() {

  }

  public FurnitureDto(String manufacturer, String location, Long quantity, String detail) {
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }

  public FurnitureDto(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description,
      Status status, String manufacturer, String location,
      Long quantity, String detail) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }
}