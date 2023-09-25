package com.cardonamaturana.assetms.infrastructure.api.dto.response;

import com.cardonamaturana.assetms.domain.entity.Status;
import java.time.LocalDate;
import lombok.Data;

@Data
public class AssetResponse {

  private String id;
  private String assigneeId;
  private LocalDate purchaseDate;
  private String invoiceNumber;
  private String description;
  private Status status;

  public AssetResponse(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status) {
    this.id = id;
    this.assigneeId = assigneeId;
    this.purchaseDate = purchaseDate;
    this.invoiceNumber = invoiceNumber;
    this.description = description;
    this.status = status;
  }

  public AssetResponse(){


  }
}
