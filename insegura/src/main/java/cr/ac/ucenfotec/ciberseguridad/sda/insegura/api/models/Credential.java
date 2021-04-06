package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.models;

import lombok.Data;

@Data
public class Credential {

    private int id;
    private String email;
    private String password;
}
