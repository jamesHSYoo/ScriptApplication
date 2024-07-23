package com.juro.scriptapp.service.impl;

import java.util.Map;

public interface scriptServiceImpl {

    Map<String, Object> getFirstData();
    Map<String, Object> execStartUpScript();
    Map<String, Object> execShutDownScript();

}
