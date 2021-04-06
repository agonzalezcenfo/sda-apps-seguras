package cr.ac.ucenfotec.ciberseguridad.sda.segura.api.services;

import cr.ac.ucenfotec.ciberseguridad.sda.segura.api.models.Credential;
import cr.ac.ucenfotec.ciberseguridad.sda.segura.api.respositories.CredentialsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private CredentialsRepository credentialsRepository;

    public LoginService(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    public List<Credential> login(String email, String password) {
        return credentialsRepository.findByEmailAndPassword(email, password);
    }
}
