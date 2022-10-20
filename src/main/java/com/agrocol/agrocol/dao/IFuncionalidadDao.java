package com.agrocol.agrocol.dao;
import java.util.List;

import javax.ejb.Remote;

import com.agrocol.agrocol.modelo.Funcionalidad;
import com.agrocol.agrocol.modelo.Usuario;

@Remote
public interface IFuncionalidadDao {

    public int altaFuncionalida(Funcionalidad funcionalidad);

    public boolean bajaFuncionalida(Integer xIdFuncionalidad);

    public boolean modificarFuncionalida(Funcionalidad funcionalidad);

    public List<Funcionalidad> listarTodos();

    public List<Funcionalidad> listarFuncionalidadesUsuario(Usuario usuario);

    public Funcionalidad buscarPorId(Integer xIdFuncionalidad);

    public boolean tieneFuncionalidadUsuario(Usuario usuario, Integer idFuncionalidad);

}
