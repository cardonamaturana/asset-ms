package com.cardonamaturana.assetms.infrastructure.api.mapper.asset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.entity.Computer;
import com.cardonamaturana.assetms.domain.entity.Furniture;
import com.cardonamaturana.assetms.domain.entity.Licence;
import com.cardonamaturana.assetms.domain.entity.Maintenance;
import com.cardonamaturana.assetms.domain.entity.Monitor;
import com.cardonamaturana.assetms.domain.entity.Permanent;
import com.cardonamaturana.assetms.domain.entity.Technological;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.AssetResponse;
import com.cardonamaturana.assetms.infrastructure.api.mapper.abstractasset.AbstractAssetResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.computer.ComputerResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.furniture.FurnitureResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.licence.LicenceResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.maintenance.MaintenanceResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.monitor.MonitorResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.permanent.PermanentResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.technological.TechnologicalResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssetResponseMapper {

  private final AbstractAssetResponseMapper abstractAssetResponseMapper;
  private final FurnitureResponseMapper furnitureResponseMapper;
  private final TechnologicalResponseMapper technologicalResponseMapper;
  private final PermanentResponseMapper permanentResponseMapper;
  private final MaintenanceResponseMapper maintenanceResponseMapper;
  private final LicenceResponseMapper licenceResponseMapper;
  private final ComputerResponseMapper computerResponseMapper;
  private final MonitorResponseMapper monitorResponseMapper;

  public AssetResponse toDto(Asset asset) {
    AssetResponse assetResponse;

    if (asset instanceof Monitor) {
      assetResponse = monitorResponseMapper.toDto((Monitor) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Computer) {
      assetResponse = computerResponseMapper.toDto((Computer) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Licence) {
      assetResponse = licenceResponseMapper.toDto((Licence) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Maintenance) {
      assetResponse = maintenanceResponseMapper.toDto((Maintenance) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Permanent) {
      assetResponse = permanentResponseMapper.toDto((Permanent) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Technological) {
      assetResponse = technologicalResponseMapper.toDto((Technological) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof Furniture) {
      assetResponse = furnitureResponseMapper.toDto((Furniture) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    } else if (asset instanceof AbstractAsset) {
      assetResponse = abstractAssetResponseMapper.toDto((AbstractAsset) asset);
      assetResponse.setId(asset.getId());
      return assetResponse;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + asset.getClass());
  }

}
