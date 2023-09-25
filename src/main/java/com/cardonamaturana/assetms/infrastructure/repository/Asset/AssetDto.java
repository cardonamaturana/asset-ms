package com.cardonamaturana.assetms.infrastructure.repository.Asset;

import com.cardonamaturana.assetms.domain.entity.Status;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("assets")
@Data
public abstract class AssetDto {

  @Id
  private String id;
  private String assigneeId;
  private LocalDate purchaseDate;
  private String invoiceNumber;
  private String description;
  private Status status;

  public AssetDto() {
  }

  public AssetDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status) {
    this.id = id;
    this.assigneeId = assigneeId;
    this.purchaseDate = purchaseDate;
    this.invoiceNumber = invoiceNumber;
    this.description = description;
    this.status = status;
  }
}