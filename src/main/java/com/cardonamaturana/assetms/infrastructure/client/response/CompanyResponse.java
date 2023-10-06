package com.cardonamaturana.assetms.infrastructure.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CompanyResponse {

  @JsonProperty("id")
  private String companyId;
  @JsonProperty("name")
  private String companyName;
  private String nit;
  private String location;
}