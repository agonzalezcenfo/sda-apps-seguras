package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.controllers;

import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.models.Credential;
import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.services.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<List<Credential>> login(@RequestBody Credential credential){
        List<Credential> credentials = loginService.login(credential.getEmail(), credential.getPassword());
        if(credentials.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(credentials);
    }
}
