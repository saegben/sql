package bened.sql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqlController {
    @GetMapping("/experience")
    public String experience () {
        return "The best teacher in life is experience. -Bron";
    }
}

// localhost:8090/experience
// localhost:8090/h2-console
