package com.study.springboot.controller;

import com.study.springboot.service.scriptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class scriptController {

    private final scriptService service;
    @GetMapping("/first")
    public Map<String, Object> getScriptController(){
        return service.getFirstData();
    }

    @RequestMapping(value="/startup", method = RequestMethod.POST)
    public Map<String, Object> startUp(){
        return service.execStartUpScript();
    }

    @RequestMapping(value="/shutdown", method = RequestMethod.POST)
    public Map<String, Object> shutDown(){
        return service.execShutDownScript();
    }
}
