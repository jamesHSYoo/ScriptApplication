package com.juro.scriptapp.service.impl;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface scriptServiceImpl {

    Map<String, Object> getServerStatus();
    Map<String, Object> execStartUpScript(@RequestBody Map<String, Object> parameters);
    Map<String, Object> execShutDownScript();

}
