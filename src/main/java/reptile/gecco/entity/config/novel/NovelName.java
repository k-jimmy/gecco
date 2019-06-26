package reptile.gecco.entity.config.novel;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NovelName implements HtmlBean {
    @Image({"data-lazy-img", "src"})
    @HtmlField(cssPath = ".book-img-box a img")
    private String novel_img;

    @Text(own = false)
    @HtmlField(cssPath = ".book-mid-info h4 .red-kw")
    private String novel_tittle;

    @Text
    @HtmlField(cssPath = ".book-mid-info .author .name")
    private String novel_author;

    @Text
    @HtmlField(cssPath = ".book-mid-info .intro")
    private String novel_intro;

    @Href
    @HtmlField(cssPath = ".book-mid-info h4 a")
    private String novel_url;
}
