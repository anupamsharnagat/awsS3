package com.anu.aws.aws;

import java.io.File;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class UploadFileToS3 {

	public static void main(String[] args) {
		
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		
		String bucket_name="anupamsharnagat1234";
		String key_name="anupam.txt";
		String file_path="F://test.txt";
		try {
		s3.putObject(bucket_name, key_name, new File(file_path));
		}
		catch(AmazonS3Exception ex)
		{
			ex.getMessage();
		}

	}

}
