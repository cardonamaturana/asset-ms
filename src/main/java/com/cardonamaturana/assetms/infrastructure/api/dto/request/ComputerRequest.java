package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ComputerRequest extends TechnologicalRequest {


  @Schema(name = "processor",
      description = "procesador : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "core i 7",
      type = "text")
  private String processor;

  @Schema(name = "ramQuantity",
      description = "cantidad de memoria RAM : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "20 Gb",
      type = "text")
  private String ramQuantity;

  @Schema(name = "storageQuantity",
      description = "cantidad de almacenamiento : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "1 Tb ",
      type = "text")
  private String storageQuantity;


  public ComputerRequest() {

  }

  public ComputerRequest(String processor, String ramQuantity, String storageQuantity) {
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public ComputerRequest(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity,
      String storageQuantity) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public ComputerRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity,
      String storageQuantity) {
    super(assigneeId, purchaseDate, invoiceNumber, description, statusId, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }
}