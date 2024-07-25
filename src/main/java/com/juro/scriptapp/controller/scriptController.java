package com.juro.scriptapp.controller;

import com.juro.scriptapp.service.scriptService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class scriptController {
    private static final Logger log = LoggerFactory.getLogger(scriptController.class);

    private final scriptService service;
    @GetMapping("/first")
    public Map<String, Object> getServerStatus(){
        return service.getServerStatus();
    }

    @RequestMapping(value="/startup", method = RequestMethod.POST)
    public Map<String, Object> startUp(@RequestBody Map<String, Object> parameters){
        return service.execStartUpScript(parameters);
    }

    @RequestMapping(value="/shutdown", method = RequestMethod.POST)
    public Map<String, Object> shutDown(){
        return service.execShutDownScript();
    }
}
