package cr.ac.ucenfotec.ciberseguridad.sda.insegura.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    //    @Bean
//    public DataSource mysqlDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/users");
//        dataSource.setUsername("root");
//        dataSource.setPassword("admin");
//        return dataSource;
//    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
