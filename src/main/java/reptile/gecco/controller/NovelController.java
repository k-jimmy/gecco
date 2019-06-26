package reptile.gecco.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import reptile.gecco.service.NovelNameService;

import javax.annotation.Resource;

@Controller
public class NovelController {
    @Resource
    private NovelNameService novelNameService;
    @ResponseBody
    @RequestMapping(value="/getContent",method = {RequestMethod.POST})
    public JSONObject getContent(String novelName) {
        String result = novelNameService.getProcess();
        System.out.println(result);
        return null;
//        return bookService.getContent(url, "content");
    }

}
