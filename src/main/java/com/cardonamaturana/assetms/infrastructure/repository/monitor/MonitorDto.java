package com.cardonamaturana.assetms.infrastructure.repository.monitor;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.technological.TechnologicalDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("ComputerDto")
public class MonitorDto extends TechnologicalDto {

  private int inches;


  public MonitorDto() {

  }

  public MonitorDto(int inches) {
    this.inches = inches;
  }

  public MonitorDto(String brand, String location, String detail, LocalDate warrantyExpirationDate,
      String warrantyDetails, int inches) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }

  public MonitorDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, int inches) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.inches = inches;
  }
}