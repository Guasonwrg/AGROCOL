package com.agrocol.agrocol.dao;

import com.agrocol.agrocol.modelo.Rol;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IRolDao {

    public int altaRol(Rol rol);

    public boolean bajaRol(Integer xIdRol);

    public boolean modificarRol(Rol rol);

    public List<Rol> listarTodos();

    public Rol buscarPorId(Integer xIdRol);

}