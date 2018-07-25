
package com.natansevero.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author natan
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/pessoa")
public class Controller {
    
    @GetMapping
    public Pessoa getPessoa() {
        return new Pessoa("natan", 20);
    }
}
