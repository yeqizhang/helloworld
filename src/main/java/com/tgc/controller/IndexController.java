
package com.tgc.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tgc.dao.UserDao;
import com.tgc.entity.User;

@Controller
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);
	
	@Autowired
	private UserDao userDao;

	@RequestMapping("/index")
	public String index() {
		return "index";
		//http://localhost:8080/helloworld/index
	}
	
	/**
	 * 使用jstl
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView  list() {
		List<User> list = userDao.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		return mav;
		//http://localhost:8080/helloworld/list
	}

}
