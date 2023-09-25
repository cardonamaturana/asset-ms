package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Data;

@Data
public class FurnitureRequest extends AssetRequest {

  @Schema(name = "manufacturer",
      description = "fabricante : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "rimax",
      type = "text")
  private String manufacturer;


  @Schema(name = "location",
      description = "ubicacion : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Cra 54 #43-25",
      type = "text")
  private String location;


  @Schema(name = "quantity",
      description = "cantidad : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "600 unidades",
      type = "text")
  private Long quantity;


  @Schema(name = "detail",
      description = "detalles : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "300 unidades recien pintadas y 300 en revision",
      type = "text")
  private String detail;


  public FurnitureRequest() {

  }

  public FurnitureRequest(String manufacturer, String location, Long quantity, String detail) {
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }

  public FurnitureRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String manufacturer, String location, Long quantity,
      String detail) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId);
    this.manufacturer = manufacturer;
    this.location = location;
    this.quantity = quantity;
    this.detail = detail;
  }
}