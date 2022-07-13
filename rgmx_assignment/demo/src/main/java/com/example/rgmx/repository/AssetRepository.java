package com.example.rgmx.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rgmx.model.Asset;
public interface AssetRepository extends JpaRepository<Asset, Long> {

	Optional<Asset> findByName(String assetName);

}
