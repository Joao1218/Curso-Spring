package projeto.lazzy.teste.libraryapi.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driver-class-name}")
    String driver;


    @Bean
    public DataSource hikariDataSource(){

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);

        config.setMaximumPoolSize(10); // Maximo de conexões liberadas
        config.setMinimumIdle(1); // Tamanho inicial de pool
        config.setPoolName("Library-db-Pool"); // Nome do pool
        config.setMaxLifetime(600000); // 600 mil milisegundo(10 minutos)
        config.setConnectionTimeout(100000);// timeout pra conseguir uma conexão
        config.setConnectionTestQuery("Select 1"); // teste pra ver se o banco esta respondendo

        return new HikariDataSource(config);
    }
}
