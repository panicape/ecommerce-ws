package es.panicape.ecommercews.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * DataSourceConfig
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Configuration
public class DataSourceConfig {

    // Methods

    /**
     * The datasource
     *
     * @return the datasource
     */
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("scripts/schema.sql")
                .addScript("scripts/init_schema.sql")
                .build();
    }
}
