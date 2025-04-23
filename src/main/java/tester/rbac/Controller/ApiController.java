package tester.rbac.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApiController {

    @GetMapping("/public")
    public String publicEndPoint(){
        return "This is public end-point";
    }

    @GetMapping("/admin")
    public String adminEndPoint(){
        return "This is admin end-point";
    }

    @GetMapping("/user")
    public String userEndPoint(){
        return "This is user end-point";
    }
}