package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class AbstractAsset extends Asset {

  private String vendorUrl;


  public AbstractAsset(){

  }

  public AbstractAsset(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }

  public AbstractAsset(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description, Status status, String vendorUrl) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.vendorUrl = vendorUrl;
  }
}