package com.example.android.camera2basic;


import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class ImageAnalyzer {

    public JSONObject analyzeimage(){

        String url = "https://centralindia.api.cognitive.microsoft.com/vision/v2.1/analyze?visualFeatures=Categories,Description,Color,Adult";

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.add("Ocp-Apim-Subscription-Key", "b055b1593f5047a5b973c58e8902fd87");

        MultiValueMap<String, Object> body
                = new LinkedMultiValueMap<>();
        body.add("image", getTestFile());

        HttpEntity<MultiValueMap<String, Object>> requestEntity
                = new HttpEntity<>(body, headers);
        JSONObject result = restTemplate.postForObject(url, requestEntity, JSONObject.class);

    }
}