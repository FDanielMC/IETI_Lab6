package lab.ieti.railway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyNameController {

    @GetMapping("/MyName")
    public String getMyName() {
        return "Me llamo Daniel Fernando Moreno Cerón";
    }

}
