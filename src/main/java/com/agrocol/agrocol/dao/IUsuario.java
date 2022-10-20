package com.agrocol.agrocol.dao;

import com.agrocol.agrocol.modelo.EnumEstado;
import com.agrocol.agrocol.modelo.EnumTipoDoc;
import com.agrocol.agrocol.modelo.Usuario;


import javax.ejb.Remote;
import java.util.List;


@Remote
public interface IUsuario {

    public int altaUsuario(Usuario usuario);

    public boolean bajaUsuario(Integer xIdUsuario);

    public boolean modificarUsuario(Usuario usuario);

    public boolean actualizarEstado(Integer xIdUsuario, EnumEstado estado);

    public List<Usuario> listarTodos();

    public Usuario buscarPorId(Integer xIdUsuario);

    public Usuario buscarPorDocTipoDoc(EnumTipoDoc tipoDocumento, String Documento);

    public Usuario autenticar(String nombreUsuari,String clave);

    public List<Usuario> listarExpertos();

    public boolean existeNombreUsuario(String nombreUsuario);

}
