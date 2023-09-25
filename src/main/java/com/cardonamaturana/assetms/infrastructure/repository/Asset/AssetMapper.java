package com.cardonamaturana.assetms.infrastructure.repository.Asset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.entity.Computer;
import com.cardonamaturana.assetms.domain.entity.Furniture;
import com.cardonamaturana.assetms.domain.entity.Licence;
import com.cardonamaturana.assetms.domain.entity.Maintenance;
import com.cardonamaturana.assetms.domain.entity.Monitor;
import com.cardonamaturana.assetms.domain.entity.Permanent;
import com.cardonamaturana.assetms.domain.entity.Technological;
import com.cardonamaturana.assetms.infrastructure.repository.abstractasset.AbstractAssetDto;
import com.cardonamaturana.assetms.infrastructure.repository.abstractasset.AbstractAssetMapper;
import com.cardonamaturana.assetms.infrastructure.repository.computer.ComputerDto;
import com.cardonamaturana.assetms.infrastructure.repository.computer.ComputerMapper;
import com.cardonamaturana.assetms.infrastructure.repository.furniture.FurnitureDto;
import com.cardonamaturana.assetms.infrastructure.repository.furniture.FurnitureMapper;
import com.cardonamaturana.assetms.infrastructure.repository.licence.LicenceDto;
import com.cardonamaturana.assetms.infrastructure.repository.licence.LicenceMapper;
import com.cardonamaturana.assetms.infrastructure.repository.maintenance.MaintenanceDto;
import com.cardonamaturana.assetms.infrastructure.repository.maintenance.MaintenanceMapper;
import com.cardonamaturana.assetms.infrastructure.repository.monitor.MonitorDto;
import com.cardonamaturana.assetms.infrastructure.repository.monitor.MonitorMapper;
import com.cardonamaturana.assetms.infrastructure.repository.permanent.PermanentDto;
import com.cardonamaturana.assetms.infrastructure.repository.permanent.PermanentMapper;
import com.cardonamaturana.assetms.infrastructure.repository.technological.TechnologicalDto;
import com.cardonamaturana.assetms.infrastructure.repository.technological.TechnologicalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssetMapper {

  private final AbstractAssetMapper abstractAssetMapper;
  private final FurnitureMapper furnitureMapper;
  private final TechnologicalMapper technologicalMapper;
  private final PermanentMapper permanentMapper;
  private final MaintenanceMapper maintenanceMapper;
  private final LicenceMapper licenceMapper;
  private final ComputerMapper computerMapper;
  private final MonitorMapper monitorMapper;


  public AssetDto toDto(Asset asset) {
    AssetDto assetDto;

    if (asset instanceof AbstractAsset) {
      assetDto = abstractAssetMapper.toDto((AbstractAsset) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Furniture) {
      assetDto = furnitureMapper.toDto((Furniture) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Technological) {
      assetDto = technologicalMapper.toDto((Technological) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Permanent) {
      assetDto = permanentMapper.toDto((Permanent) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Maintenance) {
      assetDto = maintenanceMapper.toDto((Maintenance) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Licence) {
      assetDto = licenceMapper.toDto((Licence) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Computer) {
      assetDto = computerMapper.toDto((Computer) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    } else if (asset instanceof Monitor) {
      assetDto = monitorMapper.toDto((Monitor) asset);
      assetDto.setId(asset.getId());
      return assetDto;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + asset.getClass());
  }


  public Asset toEntity(AssetDto assetDto) {
    Asset asset;

    if (assetDto instanceof AbstractAssetDto) {
      asset = abstractAssetMapper.toEntity((AbstractAssetDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof FurnitureDto) {
      asset = furnitureMapper.toEntity((FurnitureDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof TechnologicalDto) {
      asset = technologicalMapper.toEntity((TechnologicalDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof PermanentDto) {
      asset = permanentMapper.toEntity((PermanentDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof MaintenanceDto) {
      asset = maintenanceMapper.toEntity((MaintenanceDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof LicenceDto) {
      asset = licenceMapper.toEntity((LicenceDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof ComputerDto) {
      asset = computerMapper.toEntity((ComputerDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    } else if (assetDto instanceof MonitorDto) {
      asset = monitorMapper.toEntity((MonitorDto) assetDto);
      asset.setId(asset.getId());
      return asset;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assetDto.getClass());
  }


}
