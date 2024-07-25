package com.juro.scriptapp.service;

import com.juro.scriptapp.service.impl.scriptServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;
@Service
public class scriptService implements scriptServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(scriptService.class);

    @Override
    public Map<String, Object> getServerStatus() {

        Map<String, Object> status = new HashMap<>();

        status.put("status", "alive");
        return status;
    }

    @Override
    public Map<String, Object> execStartUpScript(@RequestBody Map<String, Object> parameters) {

        /**
         * implements valuation-server startup script
         * if the server execute then return success code
         * else return failure code
         * */
        String requestedIp = (String) parameters.get("ip");
        log.info("Requested Ip : " + requestedIp);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("resultCode", "Success");
        return resultMap;
    }

    @Override
    public Map<String, Object> execShutDownScript() {
        Map<String, Object> resultMap = new HashMap<>();
        /**
         * implements valuation-server shutdown script
         * if the server shutdown then return success code
         * else return failure code
         * */
        resultMap.put("resultCode", "Success");

        return resultMap;
    }
}
