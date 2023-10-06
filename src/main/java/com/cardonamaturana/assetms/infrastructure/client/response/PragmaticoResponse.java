package com.cardonamaturana.assetms.infrastructure.client.response;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoResponse extends EmployeeResponse {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

  public PragmaticoResponse() {

  }

  public PragmaticoResponse(String contractType, String jobTittle, String workEmail,
      Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoResponse(String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company, String contractType, String jobTittle,
      String workEmail,
      Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, company);
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoResponse(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company, String contractType, String jobTittle,
      String workEmail,
      Long salary) {
    super(id, fullName, documentType, documentNumber, personalEmail, company);
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

}
