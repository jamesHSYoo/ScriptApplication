package com.study.springboot.service;

import com.study.springboot.service.impl.scriptServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class scriptService implements scriptServiceImpl {
    @Override
    public Map<String, Object> getFirstData() {

        Map<String, Object> firstData = new HashMap<>();

        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        return firstData;
    }

    @Override
    public Map<String, Object> execStartUpScript() {

        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("resultCode", "Success");

        return resultMap;
    }

    @Override
    public Map<String, Object> execShutDownScript() {
        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("resultCode", "Success");

        return resultMap;
    }
}
