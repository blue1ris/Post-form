package postForm.ck;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Handler {
	@RequestMapping("/updata")
	public String upData(HttpServletRequest request) {
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("sex"));
		System.out.println(request.getParameter("majors"));
		System.out.println(request.getParameter("qq"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("instructor"));
		System.out.println(request.getParameter("math"));
		System.out.println(request.getParameter("english"));
		System.out.println(request.getParameter("codeExp"));
		System.out.println(request.getParameter("interest"));
		System.out.println(request.getParameter("evalution"));
		System.out.println(request.getParameter("target"));
		System.out.println(request.getParameter("expect"));
		return"/chenggong";
	}
	
	
}
