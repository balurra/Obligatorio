package dominio.usuario;

import java.util.ArrayList;

public class SistemaUsuario {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public Usuario login(String username, String password) {
        Usuario usuario = null;
        for (Usuario usu : usuarios) {
            if (usu.getUsername().equals(username) &&
                usu.getPassword().equals(password)) {
                usuario = usu;
            }
        }
        return usuario;
    }
    
    public void agregarUsuario(Usuario usuario) {
        if (validarListaUsuarios(usuario)) {
            usuarios.add(usuario);
        }
    }

    private boolean validarListaUsuarios(Usuario usuario) {
        return !usuarios.contains(usuario) && usuario.validarUsuario();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}