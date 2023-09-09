package com.example.chatserverspring.model;

import lombok.Data;

@Data
public class FileDTO {

    private Long id;

    private String fileName;

    private String fileData;

    private byte[] fileDataByte;

}