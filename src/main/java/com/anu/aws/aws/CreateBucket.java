package com.anu.aws.aws;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Builder;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class CreateBucket {
	
	public static void main(String[] arg)
	{
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		
		String bucketName="anupamsharnagat1234";
		
		try {
		s3.createBucket(bucketName);
		}
		catch(AmazonClientException ex)
		{
			ex.getMessage();
		}
		
		
	}

}
