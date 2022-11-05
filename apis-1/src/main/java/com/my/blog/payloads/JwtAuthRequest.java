package com.my.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

	//Email as username
	private String username;
	
	private String password;
}
