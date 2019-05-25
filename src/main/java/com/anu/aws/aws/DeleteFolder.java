package com.anu.aws.aws;

import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class DeleteFolder {

	public static void main(String[] args) {
		
		String bucket_name="anupamsharnagat1234";
		String key_name="anFolder";
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		ObjectListing ol=s3.listObjects(bucket_name,key_name);
		List<S3ObjectSummary> objects=ol.getObjectSummaries();
		
		for(S3ObjectSummary sob:objects)
		{
			try {
			s3.deleteObject(bucket_name, sob.getKey());
			}catch(AmazonServiceException ex)
			{
				ex.printStackTrace();
			}
		}

	}

}
