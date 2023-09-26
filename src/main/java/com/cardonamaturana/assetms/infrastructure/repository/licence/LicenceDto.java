package com.cardonamaturana.assetms.infrastructure.repository.licence;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.abstractasset.AbstractAssetDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("LicenceDto")
public class LicenceDto extends AbstractAssetDto {

  private String vendor;
  private LocalDate expirationDate;


  public LicenceDto() {

  }

  public LicenceDto(String vendor, LocalDate expirationDate) {
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceDto(String vendorUrl, String vendor, LocalDate expirationDate) {
    super(vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }

  public LicenceDto(String id, String assigneeId, LocalDate purchaseDate, String invoiceNumber,
      String description, Status status, String vendorUrl, String vendor,
      LocalDate expirationDate) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status, vendorUrl);
    this.vendor = vendor;
    this.expirationDate = expirationDate;
  }
}