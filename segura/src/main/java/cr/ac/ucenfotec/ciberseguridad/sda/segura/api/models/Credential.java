package cr.ac.ucenfotec.ciberseguridad.sda.segura.api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credentials")
@NoArgsConstructor
public class Credential {

    @Getter
    @Setter
    @Id
    private int id;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;
}
