package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	@Qualifier("ProductServiceImpl")
	IProductService service;

	@GetMapping("/productlistView")
	public String productlistView() {
		return "/mybatis/productlist";
	}

	@GetMapping("/ModelViewProductlist")
	public ModelAndView modelViewProductlist() {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productlist();
		mv.addObject("modelViewProductlist", list);
		mv.setViewName("/mybatis/modelViewProductlist");

		return mv;
	}

	@ResponseBody
	@GetMapping("/productlist")
	public List<ProductDTO> productlist() {
		return service.productlist();
	}

	@GetMapping("/product")
	public ModelAndView product(int code) {
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.product(code);

		mv.addObject("product", dto);
		mv.setViewName("/mybatis/detailproduct");
		return mv;
	}

}
