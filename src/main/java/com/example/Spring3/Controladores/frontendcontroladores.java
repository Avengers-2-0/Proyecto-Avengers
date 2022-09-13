package com.example.Spring3.Controladores;

import com.example.Spring3.Entidades.Empleado;
import com.example.Spring3.Entidades.Empresa;
import com.example.Spring3.Servicios.EmpleadoServicios;
import com.example.Spring3.Servicios.EmpresaServicios;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class frontendcontroladores {
    EmpresaServicios empresaServicios;
    EmpleadoServicios empleadoServicios;

    public frontendcontroladores(EmpresaServicios empresaServicios, EmpleadoServicios empleadoServicios) {
        this.empresaServicios = empresaServicios;
        this.empleadoServicios = empleadoServicios;
    }
    @GetMapping("/")
      public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        return "index";
    }

    @GetMapping("/enterprises")
    public String enterprises(Model model) throws Exception {
        List<Empresa> empresas= this.empresaServicios.getEmpresas();
        model.addAttribute("empresas",empresas);
        return "enterprises";
    }

    @GetMapping("/users")
    public String users(Model model)throws Exception{
        List<Empleado> empleados = this.empleadoServicios.getEmpleados();
        model.addAttribute("empleados",empleados);
        return "users";}

    @GetMapping("/new_user")
    public String new_user(){
        return"new_user";
    }
    @GetMapping("/new_enterprise")
    public String new_enterprise(){
        return"new_enterprise";
    }
    @GetMapping("/income_expenses")
    public String income_expenses(){
        return"income_expenses";
    }

}

