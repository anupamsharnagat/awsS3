package com.anu.aws.aws;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class ListS3Buckets {
	
	public static void main(String[] args)
	{
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		
		List<Bucket> bucketsList=s3.listBuckets();
		
		for(Bucket b:bucketsList)
		{
			System.out.println("Bucket name is ==>"+b.getName());
		}
		
	}

}
