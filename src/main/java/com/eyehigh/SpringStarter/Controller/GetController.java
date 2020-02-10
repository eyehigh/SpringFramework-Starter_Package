package com.eyehigh.SpringStarter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eyehigh.SpringStarter.model.SearchVO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/get")
public class GetController {

		@RequestMapping(method = RequestMethod.GET, value="/{id}")
		public @ResponseBody String TestResponse(@PathVariable(value="id") String id) {
			List<String> errors = new ArrayList<>();
			return id;
		}
		
		// GetMapping은 RequestMapping과는 다르게 메소드유형 없이 주소만 지정해주면된다.
	    // localhost:8080/SpringStarter/get/getParameters?id=shlee0882&email=shlee0882@gmail.com
		@GetMapping("/getParameters")
		public String getParameters(@RequestParam String id, @RequestParam String email) {
			return "아이디는 "+id+" 이메일은 "+email;
		}
		
		@GetMapping("/getParameters2")
		public String getParameters2(@RequestParam(name = "id") String userId, 
				@RequestParam(name = "email") String userEmail) {
			return "ID = "+userId+" Email = "+userEmail;
		}
		
		//http://localhost:8080/SpringStarter/get/getMultiParameters?id=shlee0882&email=shlee0882@gmail.com
		@GetMapping("/getMultiParameters")
		public @ResponseBody SearchVO getMultiParameters(SearchVO searchVo) {
			return searchVo;
		}
}
