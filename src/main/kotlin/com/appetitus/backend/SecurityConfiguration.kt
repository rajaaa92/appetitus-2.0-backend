package com.appetitus.backend

import com.okta.spring.boot.oauth.Okta
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.csrf.CookieCsrfTokenRepository
<<<<<<< HEAD
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.util.*
<<<<<<< HEAD
=======
>>>>>>> 3908626e5a98a4c1704633dcdc74b4c1c5dd2f2f
=======
>>>>>>> c1ec424b333d6f3eb240bd62a1ada662930844a3

@Configuration
class SecurityConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .csrf()
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
<<<<<<< HEAD
                .cors()
                .and()
=======
>>>>>>> 3908626e5a98a4c1704633dcdc74b4c1c5dd2f2f
                .oauth2ResourceServer().jwt();

        // Send a 401 message to the browser (w/o this, you'll see a blank page)
        Okta.configureResourceServer401ResponseBody(http);
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource? {
        val configuration = CorsConfiguration()
<<<<<<< HEAD
        configuration.allowedOrigins = listOf(System.getenv("FRONTEND_HOST"))
=======
        configuration.allowedOrigins = listOf(System.getenv("HOST"))
>>>>>>> c1ec424b333d6f3eb240bd62a1ada662930844a3
        configuration.allowedMethods = listOf("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH")
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", configuration)
        return source
    }
}
