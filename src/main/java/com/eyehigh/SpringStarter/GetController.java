package com.eyehigh.SpringStarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
