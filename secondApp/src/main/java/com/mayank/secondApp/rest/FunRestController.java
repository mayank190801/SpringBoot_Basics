package com.mayank.secondApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //end point (start)
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day!";
    }

    //Injecting properties for coach.name and also team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose team info
    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach : " + coachName + " " + "Team : " + teamName;
    }








}
