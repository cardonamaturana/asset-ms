package com.cardonamaturana.assetms.infrastructure.repository.status;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("status")
public class StatusDto {

  @Id
  private String id;
  private String description;
}