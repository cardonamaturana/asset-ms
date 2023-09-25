package com.cardonamaturana.assetms.exceptions.base;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionCode {

  ASSET_NOT_FOUND("ERR-001", "Exception.ASSET_NOT_FOUND",
      "El id del activo no existe en BD"),
  NOT_VALID_PARAMETER("ERR-002", "Exception.NOT_VALID_PARAMETER",
      "Error en los tipos de datos o valores ingresados"),
  NOT_VALID_PARAMETER_STRUCTURE("ERR-003",
      "Exception.NOT_VALID_PARAMETER_STRUCTURE",
      "Error en los campos del JSON o los valores ingresados no tienen el tipo de dato correcto."),

  STATUS_NOT_FOUND("ERR-004", "Exception.STATUS_NOT_FOUND",
      "El id del estado no existe en BD");

  private final String code;
  private final String type;
  private final String message;


}
