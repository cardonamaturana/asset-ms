package com.cardonamaturana.assetms.domain.entity;

import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Asset {

  private String id;
  private String assigneeId;
  private LocalDate purchaseDate;
  private String invoiceNumber;
  private String description;
  private Status status;

  public Asset() {

  }

  public Asset(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status) {
    this.id = id;
    this.assigneeId = assigneeId;
    this.purchaseDate = purchaseDate;
    this.invoiceNumber = invoiceNumber;
    this.description = description;
    this.status = status;
  }
}
