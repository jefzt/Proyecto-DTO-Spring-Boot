package com.usuarios.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.modelo.dto.UsuarioDTO;
import com.usuarios.modelo.dto.UsuarioResponseDTO;
import com.usuarios.modelo.servicio.UsuarioServicio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServicio servicio;

    @PostMapping
    public String registrar(@RequestBody UsuarioDTO dto) {
        servicio.registrar(dto.getNombre(), dto.getCorreo(),
                           dto.getPassword(), dto.getRol());
        return "Usuario registrado correctamente";
    }

    @GetMapping
    public List<UsuarioResponseDTO> listar() {
        return servicio.listar();
    }
}