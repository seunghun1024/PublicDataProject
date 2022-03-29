package com.pdp.mn.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MN101Ctrl {
	private static final Logger logger = LoggerFactory.getLogger(MN101Ctrl.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView MN101(@RequestParam Map<String,Object> prmt, HttpServletRequest request) throws Exception {
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("prmt", prmt);
    	mav.setViewName("mn/MN101");
        return mav;
    	//return "PublicDataProjectApplication";
    }
}