package com.ordep.spring_boot_essentials.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController 
@RequestMapping("/v1/hello") 
public class HelloWorldController {
 
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "Hello !";
    }
    //oooorrr
    /*@GetMapping
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);

    }
     */
     @GetMapping("/novo")
    @ResponseStatus(HttpStatus.OK)
    public String get1() {
        return "youre the man";
    }



    @GetMapping("/greet")
@ResponseStatus(HttpStatus.OK)
public String greet(@RequestParam String name) {
    return "Hello, " + name + "!";
}


@PostMapping("/post")
public String postMethodName(@RequestBody String entity) {
    
    return entity;
}


  
   
    


}



