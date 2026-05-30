package com.usuarios.modelo.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuarios.modelo.dto.UsuarioResponseDTO;
import com.usuarios.modelo.entidad.Usuario;
import com.usuarios.modelo.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio repositorio;

    public void registrar(String nombre, String correo,
                          String password, String rol) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setPassword(password);
        usuario.setRol(rol);
        repositorio.save(usuario);
    }

    public List<UsuarioResponseDTO> listar() {
        List<Usuario> usuarios = repositorio.findAll();
        List<UsuarioResponseDTO> listaDTO = new ArrayList<>();

        for (Usuario u : usuarios) {
            UsuarioResponseDTO dto = new UsuarioResponseDTO();
            dto.setNombre(u.getNombre());
            dto.setCorreo(u.getCorreo());
            dto.setRol(u.getRol());
            listaDTO.add(dto);
        }

        return listaDTO;
    }
}