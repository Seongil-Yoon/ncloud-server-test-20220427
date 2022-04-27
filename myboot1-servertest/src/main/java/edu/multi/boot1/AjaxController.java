package edu.multi.boot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.mybatis.MemberDTO;

@RestController
public class AjaxController {
	
	@RequestMapping("/helloajax")
	public MemberDTO test() {
		return new MemberDTO("ID", "PASSWORD");
	}
}
