package com.example.Spring3;

import com.example.Spring3.Controladores.EmpleadoControladores;
import com.example.Spring3.Controladores.EmpresaControladores;
import com.example.Spring3.Controladores.MovimientoDineroControladores;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Avengers {

	public static void main(String[] args) {
		SpringApplication.run(Avengers.class, args);
	}

	EmpresaControladores empresaControladores;
	EmpleadoControladores empleadoControladores;
	MovimientoDineroControladores movimientoDineroControladores;

}