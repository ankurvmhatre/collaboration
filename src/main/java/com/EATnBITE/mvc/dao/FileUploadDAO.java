package com.EATnBITE.mvc.dao;

import com.EATnBITE.mvc.model.UploadFile;

public interface FileUploadDAO {
	void save(UploadFile uploadFile);
	UploadFile getFile(String username);
}
