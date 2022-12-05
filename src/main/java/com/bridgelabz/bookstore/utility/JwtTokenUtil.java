package com.bridgelabz.bookstore.utility;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bridgelabz.bookstore.dto.LoginDto;
import com.bridgelabz.bookstore.dto.UserDto;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2179508099775547989L;

	LoginDto loginDto = new LoginDto();

	// @Value("${jwt.secret}")
	private String secret = "qwerty123";

	public String generateToken(LoginDto loginDto) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("Email", loginDto.getEmail());
		claims.put("Password", loginDto.getPassword());

		System.out.println("Claims:" + claims);
		System.out.println("Generated Token for :" + loginDto.getEmail());
		System.out.println("Generated Token for :" + loginDto.getPassword());

		return doGenerateToken(claims);

	}

	public String generateToken(String email, String password) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("Email", email);
		claims.put("Password", password);

		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	private String doGenerateToken(Map<String, Object> claims) {
		return Jwts.builder().setClaims(claims)
//				.setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	public LoginDto decode(String token) {
		final Map<String, Object> claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		loginDto.setEmail((String) claims.get("Email"));
		loginDto.setPassword((String) claims.get("Password"));
		return loginDto;
	}



}
