package com.cardonamaturana.assetms.infrastructure.client.response;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeResponse extends AssigneeResponse {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private CompanyResponse company;


  public EmployeeResponse() {
  }

  public EmployeeResponse(String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

  public EmployeeResponse(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company) {
    super(id);
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

}