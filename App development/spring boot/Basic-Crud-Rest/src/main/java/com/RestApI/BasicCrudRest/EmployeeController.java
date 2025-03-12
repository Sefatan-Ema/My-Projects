package com.RestApI.BasicCrudRest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.net.SocketOption;
import java.util.Map;

//Crud
//create
//read
// update
//delete
@RestController
@RequestMapping("/API/v1")//prefix path
public class EmployeeController {
//    @GetMapping("/header")
//    public void header(@RequestHeader Map<String, String> header){
//       header.forEach((key,value) -> {
//           System.out.println(String.format("Header '%s' =%s",key,value));
//        });
//    }
    //@GetMapping("/header2")
//    public void header2(){
//        HttpServletRequest request=((ServletAttributes) RquestContextHolder.getRequestAttributes()).getRequest;
//    System.out.println(request.getRemoteUser());
//        System.out.println(request.getHeader("Accept"));
//        System.out.println(request.getQueryString());
//
//    }
    //get request
    @GetMapping("/m1")
    public String message(){
        return "hello";
    }
    @GetMapping("/m2")
    public String CustomerMessage(@RequestParam String data) {
        return "hello " +data;
    }
    @GetMapping("/m3")
    public String CustomerMessage2(@RequestParam(required = false) String uni, @RequestParam String dept) {
        return "hello " +uni +" "+dept;
    }
    @GetMapping("/m4/{dept}")
    public String CustomerMessage3(@PathVariable String dept) {//for dynamic routing path variable is used
        return "hello" +dept;
    }

    //post request
    @PostMapping("/save/emp")
    public void save(@RequestBody String name) {//payload=name
       System.out.println(name);
    }
    @PostMapping("/save2/emp")//json formate rqst
    public void save2(@RequestBody Employee employee) {//payload=employee
        System.out.println(employee);
    }
    @PostMapping("/save2/emp")
    public Employee save3(@RequestBody Employee employee) {//payload=employee
       return employee;
    }


//putmapping-full update
//patchmappinh-partial update


}