package com.example.springboot.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public interface FormClassifierService {
    HashMap<String, String> processInputFile(MultipartFile file);
    List<String> processSampleFile(MultipartFile file, String type, String bias);
}