package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;

@Data
public class LicenceResponse extends AbstractAssetResponse {

  private String vendor;
  private LocalDate expirationDate;

  public LicenceResponse() {

  }

  public LicenceResponse(String vendor, LocalDate expirationDate) {
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceResponse(String id, AssigneeResponse assigneeResponse, LocalDate purchaseDate,
      String invoiceNumber,
      String description, Status status, String vendorUrl,
      String vendor, LocalDate expirationDate) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status, vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceResponse(String vendorUrl, String vendor, LocalDate expirationDate) {
    super(vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }
}