package pl.lokw.zastepstwa.security;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 *
 * @author Kotzur
 */
@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
/*    
    @Autowired
    private UserDetailsService userDetailsService;
    
    @Bean
    public PasswordEncoder encoder() {
        return new StandardPasswordEncoder("53cr3t");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            
            .antMatchers("/", "/**")
            .access("hasRole('ROLE_USER')")
        
        ;
        
        http
            .csrf()
            .disable()
        ;
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        auth
            .userDetailsService(userDetailsService)
            .passwordEncoder(encoder())
        ;
        
    }
*/  
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        auth.inMemoryAuthentication()
                .withUser("sebastian.kot@lokw.pl")
                .password("admin")
                .roles("ADMIN");
        
    }
    
/*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(http); To change body of generated methods, choose Tools | Templates.
        auth.inMemoryAuthentication()
                .withUser("sebastian.kot@lokw.pl")
                .password("admin")
                .roles("ADMIN");
        http.authorizeRequests()
            .anyRequest().hasRole("ADMIN")
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll();4
        
    }*/
    
    /*@Bean
    private UserDetailsService userDetailsService() {
        UserDetails admin = User
            .withDefaultPasswordEncoder()
            .username("admin")
            .password("admin")
            .roles("ADMIN")
            .build();
        return new InMemoryUserDetailsManager(admin);
    }*/
    
}
