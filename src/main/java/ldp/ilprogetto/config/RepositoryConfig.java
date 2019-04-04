package ldp.ilprogetto.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import ldp.ilprogetto.entita.Proj;

@SuppressWarnings("deprecation")
@Configuration
public class RepositoryConfig  extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(
        		Proj.class
        );
    }
}