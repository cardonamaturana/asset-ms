package com.cardonamaturana.assetms.infrastructure.client.response;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class
ContributorResponse extends EmployeeResponse {


  private String serviceDescription;
  private Date serviceEndDate;
  private Long totalServicePayment;
  private String currency;

  public ContributorResponse() {

  }

  public ContributorResponse(String serviceDescription, Date serviceEndDate,
      Long totalServicePayment,
      String currency) {
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public ContributorResponse(String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(fullName, documentType, documentNumber, personalEmail, company);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public ContributorResponse(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyResponse company, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(id, fullName, documentType, documentNumber, personalEmail, company);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }
}