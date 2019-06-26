package reptile.gecco.service;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.springframework.stereotype.Service;

@Service
@PipelineName("NovelNamePipeline")
public class NovelNameService implements Pipeline<SpiderBean> {
    private SpiderBean spiderBean = null;

    @Override
    public void process(SpiderBean spiderBean) {
        this.spiderBean = spiderBean;
    }

    public String getProcess() {
        return JSON.toJSONString(spiderBean);
    }
}
