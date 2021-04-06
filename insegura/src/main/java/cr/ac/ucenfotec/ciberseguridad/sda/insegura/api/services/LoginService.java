package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.services;

import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.models.Credential;
import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.repositories.CredentialsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private CredentialsRepository credentialsRepository;

    public LoginService(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    public List<Credential> login(String email, String password){
        return credentialsRepository.get(email, password);
    }
}
