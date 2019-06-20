//package org.raspen.sqlitetest.service;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//  // @Override
//   protected void configure(HttpSecurity http) throws Exception {
//
//      http
//            .authorizeRequests()
//               .antMatchers().permitAll() //This needs to be filled in with path
//            .anyRequest().authenticated()
//               .and()
//              .formLogin()
//              .loginPage("/policies/login") //This needs to be filled in with log in page path       //.permitAll()
//              .and()
//              .logout()
//              .permitAll();
//  }
//private static final String ENCODED_PASSWORD = "$2a$10$AIUufK8g6EFhBcumRRV2L.AQNz3Bjp7oDQVFiO5JJMBFZQ6x2/R/2";
//   @Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//   auth.inMemoryAuthentication()
//      .passwordEncoder(passwordEncoder())
//      .withUser("user").password(ENCODED_PASSWORD).roles("USER");
//}
//
//
//@Bean
//public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();}
//
//////some issues here with depreciated values for User definition will need to figure out
//
//   }
//
