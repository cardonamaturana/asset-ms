package com.cardonamaturana.assetms.infrastructure.api.dto.response;


import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import java.time.LocalDate;
import lombok.Data;

@Data
public class AbstractAssetResponse extends AssetResponse {

  private String vendorUrl;

  public AbstractAssetResponse() {

  }

  public AbstractAssetResponse(String id, AssigneeResponse assigneeResponse, LocalDate purchaseDate,
      String invoiceNumber, String description,
      Status status, String vendorUrl) {
    super(id, assigneeResponse, purchaseDate, invoiceNumber, description, status);
    this.vendorUrl = vendorUrl;
  }

  public AbstractAssetResponse(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }
}