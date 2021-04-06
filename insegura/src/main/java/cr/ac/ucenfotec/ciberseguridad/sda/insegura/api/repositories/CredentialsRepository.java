package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.repositories;

import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.config.CredentialsMapper;
import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.models.Credential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CredentialsRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    CredentialsMapper credentialsMapper;

    public List<Credential> get(String email, String password) {
        String query = String.format("select * from credentials where email = '%s' and password = '%s'", email, password);
        return jdbcTemplate.query(query, credentialsMapper);
    }
}
