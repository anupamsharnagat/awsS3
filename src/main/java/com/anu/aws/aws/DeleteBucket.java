package com.anu.aws.aws;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class DeleteBucket {

	public static void main(String[] args) {

		String bucket_name="anupamsharnagat1234";
		
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		
		try {
			System.out.println("deleting bucket1");
		s3.deleteBucket(bucket_name);
		}
		catch(AmazonServiceException ex)
		{
			ex.getMessage();
			ex.getErrorMessage();
		}
		
	}

}
