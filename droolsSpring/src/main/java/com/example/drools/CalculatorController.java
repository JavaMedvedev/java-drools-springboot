package com.example.drools;

        import org.kie.api.runtime.KieSession;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/request") //For Postman
public class CalculatorController {
    @Autowired
    private KieSession session;

    @PostMapping
    public Calculator count(@RequestBody Calculator request) {
        session.insert(request); // Instead of IF...ELSE - specify the conditions in .drl file
        session.fireAllRules();
        return request;
    }

}