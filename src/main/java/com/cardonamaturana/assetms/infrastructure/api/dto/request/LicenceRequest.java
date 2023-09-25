package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import com.cardonamaturana.assetms.domain.entity.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Data;

@Data
public class LicenceRequest extends AbstractAssetRequest {


  @Schema(name = "vendor",
      description = "proveedor : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "plazi",
      type = "text")
  private String vendor;


  @Schema(name = "vendor",
      description = "fecha de vencimiento : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "2018-07-21",
      type = "text - AAA-MM-DD")
  private LocalDate expirationDate;


  public LicenceRequest() {

  }

  public LicenceRequest(String vendor, LocalDate expirationDate) {
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceRequest(String vendorUrl, String vendor, LocalDate expirationDate) {
    super(vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String vendorUrl, String vendor,
      LocalDate expirationDate) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId, vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }
}