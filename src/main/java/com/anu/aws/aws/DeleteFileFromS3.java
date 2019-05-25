package com.anu.aws.aws;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class DeleteFileFromS3 {

	public static void main(String[] args) {
		
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		String bucket_name="anupamsharnagat1234";
		String key_name="anupam.txt";
		try {
		s3.deleteObject(bucket_name, key_name);
		}catch(AmazonClientException ex)
		{
			ex.getMessage();
		}

	}

}
