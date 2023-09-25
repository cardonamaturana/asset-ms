package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.Data;

@Data
public class Licence extends AbstractAsset {

  private String vendor;
  private LocalDate expirationDate;

  public Licence() {

  }

  public Licence(String vendor, LocalDate expirationDate) {
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public Licence(String vendorUrl, String vendor, LocalDate expirationDate) {
    super(vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public Licence(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String vendorUrl, String vendor,
      LocalDate expirationDate) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }
}