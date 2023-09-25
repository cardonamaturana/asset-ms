package com.cardonamaturana.assetms.exceptions.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ErrorResponse {

  private int status;
  private String code;
  private String message;
  private String date;
}