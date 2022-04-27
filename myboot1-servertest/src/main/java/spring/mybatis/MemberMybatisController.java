package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMybatisController {

	@Autowired
	@Qualifier("mybatisService")
	IMemberService service;
	
	@GetMapping("/memberStart")
	public String memberstart() {
		return "mybatis/memberstart";
	}
	
	@RequestMapping("/memberMybatisList")
	public ModelAndView memberlist() {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberList();
		mv.addObject("name", "리스트");
		mv.addObject("memberlist", list);
		mv.setViewName("mybatis/memberlist");

		return mv;
	}

	// service memberlist메소드 전체회원 조회결과를 모델, mybatis/memberlist.jsp
	@RequestMapping("/memberMybatisPageList")
	public ModelAndView memberlist(int page) {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberList(page);
		mv.addObject("name", "페이징 처리된 리스트");
		mv.addObject("memberlist", list);
		mv.setViewName("mybatis/memberlist");
//		
		return mv;
	}

	@RequestMapping("/memberMybatisSearch")
	public ModelAndView memberlist(String[] address) {
		ModelAndView mv = new ModelAndView();
		List<String> list = service.memberList(address);
		mv.addObject("name", "주소 검색 리스트");
		mv.addObject("memberAddList", list);
		mv.setViewName("mybatis/memberlist");

		return mv;
	}

	@GetMapping("/memberMybatisInsert")
	public String insertform() {
		return "mybatis/insertform";
	}

	@PostMapping("/memberMybatisInsert")
	public ModelAndView insertresult(MemberDTO dto) {
		ModelAndView mv = new ModelAndView();
		int result = service.insertMember(dto);
		mv.addObject("name", "회원가입");
		mv.addObject("insertResult", result);
		mv.setViewName("mybatis/insertresult");

		return mv;
	}

	@GetMapping("/memberMybatisUpdate")
	public String updateresult(String id) {
		return "mybatis/updateform";
	}

	@PostMapping("/memberMybatisUpdate")
	public ModelAndView updateresult(MemberDTO dto) { // id(고정), userName, address
		ModelAndView mv = new ModelAndView();
		int result = service.updateMember(dto);
		mv.addObject("name", "회원정보수정");
		mv.addObject("insertResult", result);
		mv.setViewName("mybatis/updateresult");

		return mv;
	}

	@GetMapping("/memberMybatisDelete")
	public String deleteresult(String id) {
		ModelAndView mv = new ModelAndView();

		int result = service.deleteMember(id);
		
		if(result == 1) {
			return "redirect:/memberMybatisList"; //컨트롤러 url매핑메소드 호출(회원리스트)
		}else {
			return "redirect:/memberMybatisInsert"; //회원가입폼으로 
		}

	}

}
