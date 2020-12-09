package com.tastebuds.webapp.example.uploadingfiles.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	private String location = "com/tastebuds/webapp/example/uploadingfiles/storage/images";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


}
