package com.cardonamaturana.assetms.infrastructure.repository.technological;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("TechnologicalDto")
public class TechnologicalDto extends AssetDto {

  private String brand;
  private String location;
  private String detail;
  private LocalDate warrantyExpirationDate;
  private String warrantyDetails;

  public TechnologicalDto() {

  }

  public TechnologicalDto(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails) {
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }

  public TechnologicalDto(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber,
      String description, Status status, String brand,
      String location, String detail, LocalDate warrantyExpirationDate, String warrantyDetails) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }
}