package poly.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductControler {

	@RequestMapping("/hoanghamobile")
	public String showHome() {
		return "product/hoanghamobile";
	}
}
