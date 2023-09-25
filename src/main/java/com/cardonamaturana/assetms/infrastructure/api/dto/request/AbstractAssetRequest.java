package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Data;

@Data
public class AbstractAssetRequest extends AssetRequest {

  @Schema(name = "vendorUrl",
      description = "url de vendedor : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "www.proveedor.com",
      type = "text")
  private String vendorUrl;

  public AbstractAssetRequest() {

  }

  public AbstractAssetRequest(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }

  public AbstractAssetRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String vendorUrl) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId);
    this.vendorUrl = vendorUrl;
  }
}