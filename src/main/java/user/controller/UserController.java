package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import user.entity.UserEntity;
import user.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/register.lovo")
	public ModelAndView register(UserEntity user) {
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("findUserList.lovo");
		mv.setView(rv);
		userService.addUser(user);
		return mv;
	}

	@RequestMapping("/findUserList.lovo")
	public ModelAndView findUserList() {
		ModelAndView mv = new ModelAndView("show");
		List<UserEntity> list = userService.getListUser();
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping("/update.lovo")
	public ModelAndView update(String userName, String sex, String age, String province, String id) {
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("findUserList.lovo");
		mv.setView(rv);
		userService.update(userName, sex, age, province, id);
		return mv;
	}

	@RequestMapping("/del.lovo")
	public ModelAndView del(String id) {
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("findUserList.lovo");
		mv.setView(rv);
		userService.del(id);
		return mv;
	}
}
