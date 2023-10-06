package com.cardonamaturana.assetms.infrastructure.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class StatusRequest {


  @Schema(name = "description",
      description = "nombre del estado : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Activo",
      type = "text")
  private String description;

}