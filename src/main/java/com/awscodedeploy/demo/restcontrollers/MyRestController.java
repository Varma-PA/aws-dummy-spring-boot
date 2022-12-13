package com.awscodedeploy.demo.restcontrollers;


import com.awscodedeploy.demo.dto.OutputDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class MyRestController {

    @GetMapping
    public OutputDTO getOutPutDTO(){
        OutputDTO outputDTO = new OutputDTO();
        outputDTO.setHello("World");
        return outputDTO;
    }


}
