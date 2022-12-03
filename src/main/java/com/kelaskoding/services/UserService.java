package com.kelaskoding.services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<Map<String, String>> listData = new ArrayList<>();

    public UserService(){
        Map<String, String> data1 = new HashMap<>();
        data1.put("id", "1");
        data1.put("name", "Steven");  
        this.listData.add(data1);   
        
        Map<String, String> data2 = new HashMap<>();
        data2.put("id", "2");
        data2.put("name", "Hendro");  
        this.listData.add(data2);     
    }

    public List<Map<String,String>> findAll(){
        return this.listData;
    }

    public Map<String, String> findById(String id){
        for (Map<String,String> data : this.listData) {
            if(data.get("id").equals(id)){
                return data;
            }
        }
        Map<String, String> notFound = new HashMap<>();
        notFound.put("status", "false");
        notFound.put("messages", "Data not found");
        return notFound;
    }


}
