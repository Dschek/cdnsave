package com.example.cdnsave.controller;

import com.example.cdnsave.model.Directory.DirectoryRequest;
import com.example.cdnsave.model.Directory.DirectoryResponse;
import com.example.cdnsave.model.File.FileRequest;
import com.example.cdnsave.model.File.FileResponse;
import com.example.cdnsave.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFileOperationController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/add")
    public ResponseEntity<FileResponse> addFile(@RequestBody FileRequest fileRequest) {
        return new ResponseEntity<>(storageService.addFile(fileRequest), HttpStatus.OK);
    }
    @PostMapping("/mkdir")
    public ResponseEntity<DirectoryResponse> mkDir(@RequestBody DirectoryRequest directoryRequest) {
        return new ResponseEntity<>(storageService.mkDir(directoryRequest), HttpStatus.OK);
    }
    @PostMapping("/rm")
    public ResponseEntity<DirectoryResponse> rmDir(@RequestBody DirectoryRequest directoryRequest) {
        return new ResponseEntity<>(storageService.rm(directoryRequest), HttpStatus.OK);
    }
}