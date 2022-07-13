package com.example.rgmx.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.rgmx.service.AssetService;
import com.example.rgmx.model.Asset;
import com.example.rgmx.model.Category;


@RestController
public class AssetController {
	@Autowired
	private AssetService assetService;
	@GetMapping("/assets")
	public ResponseEntity<List<Asset>> getAllAsset(){
		return ResponseEntity.ok().body(assetService.getAllAsset());
	}
	@PostMapping("/assets")
	public ResponseEntity<Asset> createAsset(@RequestBody Asset asset){
		return ResponseEntity.ok().body(this.assetService.createAsset(asset));
	}
	@GetMapping("/assets/{name}")
	public ResponseEntity<Asset> getAssetByName(@PathVariable String name){
		return ResponseEntity.ok().body(assetService.getAssetByName(name));
	}
	@PutMapping("/assets/{name}")
	public ResponseEntity<Asset> updateProduct(@PathVariable String name, @RequestBody Asset asset){
		return ResponseEntity.ok().body(this.assetService.updateAsset(asset));
	}


}
