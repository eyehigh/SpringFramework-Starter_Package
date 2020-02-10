package com.eyehigh.SpringStarter.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eyehigh.SpringStarter.model.SearchVO;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public SearchVO postRequest(@RequestBody SearchVO searchVo){
        return searchVo;
    }
 
    @PostMapping(value = "/postMapping")
    public SearchVO postMapping(@RequestBody SearchVO searchVo){
        return searchVo;
    }
}
