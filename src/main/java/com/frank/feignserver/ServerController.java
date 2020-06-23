package com.frank.feignserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小石潭记
 * @date 2020/6/22 21:40
 * @Description: ${todo}
 */
@RestController()
public class ServerController {

    @GetMapping("/getSuccessInfo")
    public Map<String,Object> getSuccessInfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("data", new User(1,"小石潭记",26));
        return map;
    }

    @GetMapping("/getFailInfo")
    public Map<String,Object> getFailInfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("code", 404);
        map.put("msg", "fail");
        map.put("data", null);
        return map;
    }
}
