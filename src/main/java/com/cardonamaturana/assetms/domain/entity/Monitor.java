package com.cardonamaturana.assetms.domain.entity;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Monitor extends Technological {

  private int inches;

  public Monitor(){

  }
  public Monitor(String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }

  public Monitor(int inches) {
    this.inches = inches;
  }
}