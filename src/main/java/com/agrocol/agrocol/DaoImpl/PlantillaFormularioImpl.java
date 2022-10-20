package com.agrocol.agrocol.DaoImpl;

import com.agrocol.agrocol.dao.IPlantillaFormulario;
import com.agrocol.agrocol.modelo.PlantillaFormulario;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class PlantillaFormularioImpl implements IPlantillaFormulario {

    @PersistenceContext
    private EntityManager em;

    @Override
    public int altaFuncionalida(PlantillaFormulario PlantillaFormulario) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean bajaFuncionalida(Integer xIdPlantillaFormulario) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean modificarFuncionalida(PlantillaFormulario PlantillaFormulario) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<PlantillaFormulario> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PlantillaFormulario buscarPorId(Integer xIdPlantillaFormulario) {
        // TODO Auto-generated method stub
        return null;
    }

}
