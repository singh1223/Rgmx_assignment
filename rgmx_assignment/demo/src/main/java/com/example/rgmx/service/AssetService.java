package com.example.rgmx.service;

import java.util.List;

import com.example.rgmx.model.Asset;

public interface AssetService {
	List<Asset> getAllAsset();
	Asset getAssetByName(String assetName);
	Asset updateAsset(Asset asset);
	Asset createAsset(Asset asset);
	
}
