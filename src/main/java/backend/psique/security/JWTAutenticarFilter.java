package backend.psique.security;
/*
import backend.psique.model.usuario.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class JWTAutenticarFilter extends UsernamePasswordAuthenticationFilter {
    public static final int TOKEN_EXPERACAO = 604800000;
    public static final String TOKEN_SENHA = "5df31dad-716c-4d1f-b946-e1e9aa9ae5d5";
    private final AuthenticationManager authenticationManager;

    public JWTAutenticarFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            Usuario dadosLoginUsuario = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);

        return authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dadosLoginUsuario.getUsername(),
                        dadosLoginUsuario.getPassword(),
                        new ArrayList<>()
                ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult)
            throws IOException, ServletException {
        Usuario usuarioData = (Usuario) authResult.getPrincipal();
        String token = JWT.create()
                .withSubject(usuarioData.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + TOKEN_EXPERACAO))
                .sign(Algorithm.HMAC512(TOKEN_SENHA));
        response.getWriter().write(token);
        response.getWriter().flush();
    }
}
*/