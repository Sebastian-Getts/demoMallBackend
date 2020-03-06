package com.qinsw.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sebastian
 */
@Slf4j
@RequestMapping("homepage")
@RestController
@Api(value = "首页")
public class SwiperController {


    @GetMapping(value = "swipr")
    @ApiOperation(value = "轮播图页面")
    public Map<String, Object> getTopSwiper() {
        log.info("got it..");
        Map<String, Object> map = new HashMap<>(1);
        map.put("1", "pants");
        map.put("2", "caps");
        return map;
    }

    @PutMapping(value = "cellnumber")
    @ApiOperation(value = "修改号码")
    public Map<String, Object> editCellNumber(@RequestBody Map<String, Object> map) {
        System.out.println(map.toString());
        Map<String, Object> map1 = new HashMap<>(1);
        map1.put("cellnumber", "success");
        return map1;
    }

    @GetMapping(value = "{id}/detail")
    @ApiOperation(value = "物品种类详单")
    public JSONObject getDetails(@PathVariable("id") String id) {
        JSONObject jsonObject = new JSONObject();
        System.out.println(id);
        jsonObject.put("url", "https://google.com");
        return jsonObject;
    }

}
