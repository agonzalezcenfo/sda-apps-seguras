package cr.ac.ucenfotec.ciberseguridad.sda.segura.api.respositories;

import cr.ac.ucenfotec.ciberseguridad.sda.segura.api.models.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CredentialsRepository extends JpaRepository<Credential, Integer> {
    List<Credential> findByEmailAndPassword(String email, String password);
}
