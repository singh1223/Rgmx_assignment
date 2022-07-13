package com.example.rgmx.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rgmx.exception.AssetNotFoundException;
import com.example.rgmx.model.Asset;

import com.example.rgmx.repository.AssetRepository;

@Service
@Transactional
public class AssetImpl implements AssetService {
	@Autowired
	private AssetRepository assetRepository ;

	@Override
	public List<Asset> getAllAsset() {
		// TODO Auto-generated method stub
		return this.assetRepository.findAll();
	}

	@Override
	public Asset getAssetByName(String assetName) {
		// TODO Auto-generated method stub
		Optional<Asset> assetDb = this.assetRepository.findByName(assetName);
		if(assetDb.isPresent()) {
			return assetDb.get();
		}
		else {
			throw new AssetNotFoundException("Asset not found with name : " + assetName);
		}

	}

	@Override
	public Asset updateAsset(Asset asset) {
		Optional<Asset> assetDb = this.assetRepository.findByName(asset.getName());
		if(assetDb.isPresent()) {
	        Asset assetUpdate = assetDb.get();
			assetUpdate.setName(asset.getName());
			assetUpdate.setCategory(asset.getCategory());
			assetRepository.save(assetUpdate);
			return assetUpdate;
		} else {
			throw new AssetNotFoundException("Asset not found with name : " + asset.getName());
		}
	}

	@Override
	public Asset createAsset(Asset asset) {
		// TODO Auto-generated method stub
		return assetRepository.save(asset);

	}


}
