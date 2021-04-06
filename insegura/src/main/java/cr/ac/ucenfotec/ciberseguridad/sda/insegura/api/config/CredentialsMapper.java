package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.config;

import cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.models.Credential;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CredentialsMapper implements RowMapper<Credential> {

    @Override
    public Credential mapRow(ResultSet rs, int rowNum) throws SQLException {
        Credential credential = new Credential();

        credential.setId(rs.getInt("id"));
        credential.setEmail(rs.getString("email"));
        credential.setPassword(rs.getString("password"));

        return credential;
    }
}
