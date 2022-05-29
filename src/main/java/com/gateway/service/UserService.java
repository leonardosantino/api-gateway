package com.gateway.service;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserService {

    @RequestMapping(method = RequestMethod.GET, path = "/user/{id}")
    public Map<String, Object> user(
            @PathVariable Long id,
            @RequestHeader("user-request-header") String header
    ) {
        Map<String, Object> response = new HashMap<>();
        response.put("user_id", id);
        response.put("user_custom_header", header);

        return response;
    }
}
