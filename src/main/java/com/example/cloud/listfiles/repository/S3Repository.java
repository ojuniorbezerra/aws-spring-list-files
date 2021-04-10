package com.example.cloud.listfiles.repository;

import com.amazonaws.services.s3.AmazonS3Client;

public class S3Repository implements CreateBucket {

  private final AmazonS3Client s3Client;

  public S3Repository(AmazonS3Client s3Client) {
    this.s3Client = s3Client;
  }

  public void create(String bucket){
    
  }

  public void delete (String bucket) {

  }
}