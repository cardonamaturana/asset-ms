package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Data;

@Data
public class TechnologicalRequest extends AssetRequest {


  @Schema(name = "brand",
      description = "marca : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "cafetera inteligente",
      type = "text")
  private String brand;

  @Schema(name = "location",
      description = "ubicacion : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Calle falsa 123",
      type = "text")
  private String location;

  @Schema(name = "detail",
      description = "detalle : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "cuanquier detalle",
      type = "text")
  private String detail;

  @Schema(name = "warrantyExpirationDate",
      description = "expiracion de garantia : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "2050-25-8",
      type = "fecha AAA-MM-DD")
  private LocalDate warrantyExpirationDate;


  @Schema(name = "warrantyDetails",
      description = "detalle de garantia : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "2050-25-8",
      type = "fecha AAA-MM-DD")
  private String warrantyDetails;

  public TechnologicalRequest() {

  }

  public TechnologicalRequest(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails) {
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }

  public TechnologicalRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId);
    this.brand = brand;
    this.location = location;
    this.detail = detail;
    this.warrantyExpirationDate = warrantyExpirationDate;
    this.warrantyDetails = warrantyDetails;
  }
}