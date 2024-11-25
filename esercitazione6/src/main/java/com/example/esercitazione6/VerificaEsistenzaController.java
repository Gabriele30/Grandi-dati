package com.example.esercitazione6;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificaEsistenzaController {



    @PostMapping("/verificaesistenza")

    public String verificaesistenza(@RequestParam String email, @RequestParam String nome, @RequestParam String cognome) {
        if(Math.random()>0.5){
            String test=email+nome+cognome;
            return "{\"codreg\":\"" + test.hashCode() + "\"}";
        }
        return "{\"codreg\":\"" + -1+ "\"}";
    }


}
