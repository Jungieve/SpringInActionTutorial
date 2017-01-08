package SpringOnWeb.BuildingSpringWebApplication.Spittr.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by congzihan on 17/1/1.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
