package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/sea")
	public String home() {
		System.out.println("Going to search page");

		return "search";
	}
	
	@RequestMapping("/dosearch")
	public RedirectView search(@RequestParam("searchbox") String query) {
		
		String url="https://www.google.com/search?q="+query;
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
		return rv;

	}
}
