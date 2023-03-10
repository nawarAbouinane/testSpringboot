package ma.epolytechnique.projetsynthese;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class ConfigSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	public void config_global(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("nawar").password("{noop}123456").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("bochra").password("{noop}123477").roles("VISITEUR"); 
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.anyRequest()
				.authenticated()
					.and()
		.formLogin()
    		.loginPage("/login")
    		.permitAll()
    	.defaultSuccessUrl("/index") ;	
	}
	
	

}
