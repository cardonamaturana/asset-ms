package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import java.time.LocalDate;
import lombok.Data;

@Data
public class AbstractAssetResponse extends AssetResponse {

  private String vendorUrl;

  public AbstractAssetResponse() {

  }

  public AbstractAssetResponse(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber, String description,
      Status status, String vendorUrl) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.vendorUrl = vendorUrl;
  }

  public AbstractAssetResponse(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }
}