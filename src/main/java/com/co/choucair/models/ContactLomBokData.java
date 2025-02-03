package com.co.choucair.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class ContactLomBokData {

    private String email;
    private String name;
    private String message;

    public static List<ContactLomBokData> setData(DataTable table){
        List<ContactLomBokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for(Map<String, String>map : mapInfo){
            data.add(new ObjectMapper().convertValue(map,ContactLomBokData.class));
        }
        return data;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
