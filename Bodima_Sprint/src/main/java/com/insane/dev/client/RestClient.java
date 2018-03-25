package com.insane.dev.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.insane.dev.model.Bodim;

public class RestClient {

    RestTemplate restTemplate= new RestTemplate();


    @Value("${getbookUrl}")
    private String getbookUrl;

    @Value("${getbooksurl}")
    private String getbooksurl;

    @Value("${deletebookUrl}")
    private String deletebookUrl;

    @Value("${addbookurl}")
    private String addbookurl;

    public List<Bodim> getBookDetails() {

        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        ResponseEntity<Bodim[]> responseEntity = restTemplate.getForEntity(getbooksurl, Bodim[].class);
        return Arrays.asList(responseEntity.getBody());

    }



    public Bodim getBookbyId(int id){

        Map<String, String> params = new HashMap<String, String>();

        params.put("id", String.valueOf(id));

        Bodim response = restTemplate.getForObject(getbookUrl,Bodim.class,params);
        return response;
    }

    public void deleteBookbyId(int id){
        Map<String, String> params = new HashMap<String, String>();
        params.put("id",  String.valueOf(id));
        restTemplate.delete(deletebookUrl,id);
    }

    public void addBook(Bodim bodim)
    {
        Bodim result = restTemplate.postForObject( addbookurl, bodim, Bodim.class);
    }

}
