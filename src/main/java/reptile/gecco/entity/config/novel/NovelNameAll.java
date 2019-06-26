package reptile.gecco.entity.config.novel;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

@Gecco(matchUrl = "https://www.qidian.com/search?kw={book}", pipelines = "QdPipeline", timeout = 1000)
public class NovelNameAll implements HtmlBean {
    @Request
    private HttpRequest request;

    @RequestParameter
    private String book;

    @HtmlField(cssPath = "#result-list .res-book-item")
    private List<NovelName> novel_name_list;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public List<NovelName> getNovel_name_list() {
        return novel_name_list;
    }

    public void setNovel_name_list(List<NovelName> novel_name_list) {
        this.novel_name_list = novel_name_list;
    }
}
