package servicios.exequiales.ingresosyegresos.ingresos_egresos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(AuthenticationManagerBuilder build) throws Exception {
        build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    //    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.inMemoryAuthentication()
//               .withUser("admin")
//               .password("{noop}123")
//               .roles("ADMIN")
//               .and()
//               .withUser("user")
//               .password("{noop}123")
//               .roles("USER");
//    }
    @Override // permiso de quien puede operar sobre las rutas
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/empleados/list/", "/empleados/modificar/", "/empleados/guardar/", "/empleados/editar/**", "/empleados/eliminar/**}",
                        "/empresas/list/", "/empresas/crear/", "empresas/modificar/", "/empresas/guardar/", "/empresas/editar/**", "/empresas/eliminar/**",
                        "/movimientos/list/", "/movimientos/modificar/", "/movimientos/guardar/", "/movimientos/editar/**", "/movimientos/eliminar/**",
                        "/productos/list/", "/productos/crear/", "/productos/guardar/", "productos/modificar/", "/productos/editar/**", "/productos/eliminar/**")
                .hasRole("ADMIN")
                .antMatchers("/", "/movimientos/list/")
                .hasRole("USER")
                .and()
                .formLogin()//login por defecto de spring boot
                .loginPage("/login") //ruta de mi template
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403"); //error que arroja por permisos

    }
}
