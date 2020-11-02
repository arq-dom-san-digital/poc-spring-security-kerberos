package com.arqdomsandig.kerberos.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
class RestKerberosServer {

	@GetMapping
	String getIt() {
		return "Data from kerberized Server";
	}
}
