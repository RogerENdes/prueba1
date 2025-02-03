package com.co.choucair.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginLomBokData {
    private String user;
    private  String pass;

    public static List<LoginLomBokData> setData(DataTable table){
        List<LoginLomBokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for(Map<String, String>map : mapInfo){
            data.add(new ObjectMapper().convertValue(map,LoginLomBokData.class));
        }
        return data;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
