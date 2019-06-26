package reptile.gecco.unit;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.dynamic.DynamicGecco;
import com.geccocrawler.gecco.request.HttpGetRequest;

public class NovelEngine {
    private static GeccoEngine ge = null;

    public static void NovelNameEngine() {
        //初始化爬虫引擎，此时由于没有初始请求，爬虫引擎会阻塞初始队列，直到获取到初始请求
        ge = GeccoEngine.create("reptile.gecco.unit")
                .interval(5000)
                .loop(true)
                .engineStart();
    }

    public static void NovelNameLoad() {
        Class<?> rule = DynamicGecco
                .html()
                .gecco("https://www.qidian.com/search?kw={book}", "consolePipeline")
                .stringField("title").csspath(".repository-meta-content").text(false).build()
                .intField("star").csspath(".pagehead-actions li:nth-child(2) .social-count").text(false).build()
                .intField("fork").csspath(".pagehead-actions li:nth-child(3) .social-count").text().build()
                .loadClass();

        //注册规则
        ge.register(rule);
    }

    public static void NovelNameStart(String novelName) {
        ge.getScheduler().into(new HttpGetRequest("https://www.qidian.com/search?kw=" + novelName));
    }
}
