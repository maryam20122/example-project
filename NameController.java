package org.j2os.conroller;

import lombok.RequiredArgsConstructor;
import org.j2os.service.NameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hellow")
public class NameController {
    private final NameService nameService;
    public NameController(NameService nameService){
        this.nameService=nameService;
    }
    @GetMapping("/get")
    public String getName(@RequestParam String name){
        System.out.println("name");
        return nameService.getName(name);
    }

    @GetMapping("/allNames")
    public List<String> getAllNames(String name){
        return nameService.getAllNames();
    }
}

