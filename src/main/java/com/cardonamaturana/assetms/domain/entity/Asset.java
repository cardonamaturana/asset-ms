package com.cardonamaturana.assetservicems.domain.entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Asset {


  protected String ownerId;
  protected Date purchaseDate;
  protected String invoiceNumber;
  protected String description;
  protected Status status;

}