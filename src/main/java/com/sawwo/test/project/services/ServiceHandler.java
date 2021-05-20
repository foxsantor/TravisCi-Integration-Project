package com.sawwo.test.project.services;


import com.sawwo.test.project.entities.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceHandler {

public static List<TestEntity> testEntityList;

    @Autowired
    public ServiceHandler() {
        testEntityList = new ArrayList<>();
    }

    public void addNewEntry(String entry1, int entry2){
    TestEntity entity = new TestEntity(entry2,entry1);
    testEntityList.add(entity);
}


public List<TestEntity> getTestEntityList()
{
    return testEntityList;
}

}
