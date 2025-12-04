package org.j2os.service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class NameService {
    private List<String> names=new ArrayList<>();
    public String getName(String name){
        names.add(name);
        return name;
    }
    public List<String> getAllNames(){
        return names;
    }
}
