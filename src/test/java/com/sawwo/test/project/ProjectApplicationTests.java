package com.sawwo.test.project;

import com.sawwo.test.project.controllers.RestController;
import com.sawwo.test.project.entities.TestEntity;
import com.sawwo.test.project.services.ServiceHandler;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.lang.reflect.Array;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProjectApplicationTests {

    @Autowired
    ServiceHandler serviceHandler;
    @Autowired
    private MockMvc mvc;


    @Test
    void notEmpty_whenGet()throws Exception {
        serviceHandler.addNewEntry("testUnit",89);
        mvc.perform(MockMvcRequestBuilders.get("/test/getInfo")
        .accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
    }

}
