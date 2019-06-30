package com.kitri.hotpicks.mypicks.controller;

import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kitri.hotpicks.mypicks.model.MapContentsDto;
import com.kitri.hotpicks.mypicks.service.MypickMapService;

@Controller
@RequestMapping("/mypickmap")
public class MypickMapController {
	
	@Autowired
	private MypickMapService mypickMapService;
	
	@RequestMapping("/mvmypickmap")
	public String mvMap() {
		System.out.println("1");
		return "/page/mypicks/mypickmap";
	}
	
	@RequestMapping("/getmaplist")
	@ResponseBody
	public String mypicksMap() {
		System.out.println("controller");
		List<MapContentsDto> list = mypickMapService.getContent();
		JSONArray array = new JSONArray(list);
		return array.toString();
		
	}
	
}
