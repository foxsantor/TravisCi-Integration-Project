package com.sawwo.test.project.controllers;

import com.sawwo.test.project.entities.TestEntity;
import com.sawwo.test.project.services.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("test")
public class RestController {
    @Autowired
    ServiceHandler serviceHandler;

@GetMapping(path="/getInfo", produces="application/json")
    public @ResponseBody List<TestEntity> getInfo()
{
    return serviceHandler.getTestEntityList();

}

@PostMapping(path="/addTest/{number}/{string}",produces="application/json")
    public @ResponseBody TestEntity addTest(@PathVariable int number, @PathVariable String string)
{
    return serviceHandler.addNewEntry(string,number);

}



}
