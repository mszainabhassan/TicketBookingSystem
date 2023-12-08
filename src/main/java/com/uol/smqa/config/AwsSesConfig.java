package com.uol.smqa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;

@Configuration
public class AwsSesConfig {

    @Bean
    public SesClient sesClient() {
        AwsCredentialsProvider awsCredentialsProvider = DefaultCredentialsProvider.create();
        return SesClient.builder()
                .region(Region.EU_WEST_2)  
                .credentialsProvider(awsCredentialsProvider)
                .build();
    }
}
