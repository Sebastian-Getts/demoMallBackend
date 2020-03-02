package com.qinsw.Controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sebastian
 */
@Slf4j
@RequestMapping("swiper")
@RestController
public class SwipperController {

    @GetMapping(value = "top")
    public Map<String, Object> getTopSwiper() {
        Map<String, Object> map = new HashMap<>();
        log.info("this is top swiper...");
        Map<String, Object> msg = new HashMap<>();
        msg.put("msg", "获取成功");
        msg.put("status", "200");
        map.put("meta", msg);
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> submap1 = new HashMap<>();
        submap1.put("image_src", "http://picnew8.photophoto.cn/20140611/taobaoyuanchuangshejihaibaocuxiao-27130194_1.jpg");
        submap1.put("open_type", "navigate");
        submap1.put("goods_id", "129");
        submap1.put("navigator_url", "/mall/goods_detail/index?goods_id=129");
        list.add(submap1);

        Map<String, Object> submap2 = new HashMap<>();
        submap2.put("image_src", "https://dcdn.it120.cc/2019/12/29/2e79921a-92b3-4d1d-8182-cb3d524be5fb.png");
        submap2.put("open_type", "navigate");
        submap2.put("goods_id", "122");
        submap2.put("navigator_url", "/mall/goods_detail/index?goods_id=122");
        list.add(submap2);

//        Map<String, Object> submap3 = new HashMap<>();
//        submap3.put("image_src", "https://dcdn.it120.cc/2019/09/14/86312820-6124-4e3e-85d8-2d1747008ed5.png");
//        submap3.put("open_type", "navigate");
//        submap3.put("goods_id", "120");
//        submap3.put("navigator_url", "/mall/goods_detail/index?goods_id=120");
//        list.add(submap3);

        map.put("message", list);
        return map;
    }

}
