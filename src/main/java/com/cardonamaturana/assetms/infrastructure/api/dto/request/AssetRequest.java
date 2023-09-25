package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import com.cardonamaturana.assetms.domain.entity.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.Data;

@Data
public abstract class AssetRequest {

  @Schema(name = "assigneeId",
      description = "id del responsable : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8584d75ss785s8855",
      type = "text - unique id")
  @NotBlank(message = "id del responsable : Campo obligatorio")
  private String assigneeId;


  @Schema(name = "purchaseDate",
      description = "fecha de compra : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "2012-07-12",
      type = "formato de fecha AAAA-MM-DD")
  private LocalDate purchaseDate;



  @Schema(name = "invoiceNumber",
      description = "numero de factura : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "85485s54262f2",
      type = "text")
  private String invoiceNumber;

  @Schema(name = "description",
      description = "descripcion adicional : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "tiene 3 años en buen estado y ya revisaron hace dos semanas",
      type = "text")
  private String description;



  @Schema(name = "statusId",
      description = "id del estado : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8584d75ss785s8855",
      type = "text - unique id")
  @NotBlank(message = "id del responsable : Campo obligatorio")
  private String statusId;

  public AssetRequest() {

  }

  public AssetRequest(String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, String statusId) {
    this.assigneeId = assigneeId;
    this.purchaseDate = purchaseDate;
    this.invoiceNumber = invoiceNumber;
    this.description = description;
    this.statusId = statusId;
  }
}