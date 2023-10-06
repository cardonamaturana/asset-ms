package com.cardonamaturana.assetms.infrastructure.repository.abstractasset;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetDto;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assets")
@TypeAlias("AbstractAsset")
public class AbstractAssetDto extends AssetDto {

  private String vendorUrl;

  public AbstractAssetDto() {

  }

  public AbstractAssetDto(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }

  public AbstractAssetDto(String id, String assigneeId, LocalDate purchaseDate,
      String invoiceNumber,
      String description, Status status, String vendorUrl) {
    super(id, assigneeId, purchaseDate, invoiceNumber, description, status);
    this.vendorUrl = vendorUrl;
  }
}