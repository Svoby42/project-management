package svoby.spring.projectmanagement.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, enabled from user_accounts where username = ?")
                .authoritiesByUsernameQuery("select username, role from user_accounts where username = ?")
                .passwordEncoder(bCryptPasswordEncoder);
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/projekty/novy").hasRole("ADMIN")
                .antMatchers("/projekty/ulozit").hasRole("ADMIN")
                .antMatchers("/zamestnanci/novy").hasRole("ADMIN")
                .antMatchers("/zamestnanci/ulozit").hasRole("ADMIN")
                .antMatchers("/", "/**", "/assets/**").permitAll()
                .and().formLogin()/*.loginPage("/login-page")*/;
                httpSecurity.csrf().ignoringAntMatchers("/app-api/zamestnanci");

    }

}
