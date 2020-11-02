package com.arqdomsandig.kerberos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

@SpringBootApplication
public class KerberizedServerApp {

	static {
		System.setProperty("java.security.krb5.conf",
				Paths
					.get(".\\spring-security-sso-kerberos\\krb-keytab-workdir\\krb5.conf")
					.normalize().toAbsolutePath().toString());
		System.setProperty("sun.security.krb5.debug", "true");
		// Disable usage of local kerberos ticket cache
		System.setProperty("http.use.global.creds", "false");

	}

	public static void main(String[] args) {

		// Set App Port
		System.getProperties().put( "server.port", 8090 );
		SpringApplication.run(KerberizedServerApp.class, args);
	}
}
