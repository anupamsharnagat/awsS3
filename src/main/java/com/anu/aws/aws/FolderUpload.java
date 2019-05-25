package com.anu.aws.aws;

import java.io.File;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;

public class FolderUpload {
	
	public static void main(String[] arg)
	{
		TransferManager trans_mngr= new TransferManager();
		
		String directory_path="F://tempfolder";
		String key_prefix="anFolder";
		String bucket_name="anupamsharnagat1234";
		boolean recursive=false;//This will tell whether sub folder to be upload or not.
		
		MultipleFileUpload trans=trans_mngr.uploadDirectory(bucket_name, key_prefix, new File(directory_path), recursive);
		
		try {
			trans.waitForCompletion();
		} catch (AmazonServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AmazonClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		trans_mngr.shutdownNow();
		
	}

}
