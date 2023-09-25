package com.cardonamaturana.assetms.infrastructure.repository.computer;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.technological.TechnologicalDto;
import java.time.LocalDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("assets")
@TypeAlias("ComputerDto")
public class ComputerDto extends TechnologicalDto {

  private String processor;
  private String ramQuantity;
  private String storageQuantity;


  public ComputerDto() {

  }

  public ComputerDto(String processor, String ramQuantity, String storageQuantity) {
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public ComputerDto(String brand, String location, String detail, LocalDate warrantyExpirationDate,
      String warrantyDetails, String processor, String ramQuantity, String storageQuantity) {
    super(brand, location, detail, warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }

  public ComputerDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String brand, String location, String detail,
      LocalDate warrantyExpirationDate, String warrantyDetails, String processor,
      String ramQuantity,
      String storageQuantity) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, brand, location, detail,
        warrantyExpirationDate, warrantyDetails);
    this.processor = processor;
    this.ramQuantity = ramQuantity;
    this.storageQuantity = storageQuantity;
  }
}