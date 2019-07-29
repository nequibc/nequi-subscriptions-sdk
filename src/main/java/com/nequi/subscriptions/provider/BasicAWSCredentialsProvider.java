package com.nequi.subscriptions.provider;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;

public class BasicAWSCredentialsProvider implements AWSCredentialsProvider{
    private String accessKey;
    private String secretKey;

    public BasicAWSCredentialsProvider(String accessKey, String secretKey) {
      this.accessKey = accessKey;
      this.secretKey = secretKey;
    }

    @Override
    public AWSCredentials getCredentials() {
      if (accessKey != null && secretKey != null) {
        return new BasicAWSCredentials(accessKey, secretKey);
      }

      throw new AmazonClientException(
          "Access key or secret key is null");
    }

    @Override
    public void refresh() {}
   
}
