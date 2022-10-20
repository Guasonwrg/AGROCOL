package com.agrocol.agrocol.dao;

import com.agrocol.agrocol.modelo.Casilla;
import com.agrocol.agrocol.modelo.PlantillaCasilla;
import com.agrocol.agrocol.modelo.TipoInput;
import com.agrocol.agrocol.modelo.UnidadesMedida;

import java.util.List;

import javax.ejb.Remote;



@Remote
public interface ICasillaDao {

    public int altaCasilla(Casilla Casilla);

    public boolean bajaCasilla(Integer xIdCasilla);

    public boolean modificarCasilla(Casilla Casilla);

    public List<Casilla> listarTodos();

    public Casilla buscarPorId(Integer xIdCasilla);

    public List<TipoInput> listarTiposInput();

    public List<UnidadesMedida> listarUnidadesMedidas();

    public void altaTipoInput(TipoInput tipoInput);

    public void altaUnidadMedida(UnidadesMedida unidad);

    public List<PlantillaCasilla> ObtenerCasillaDePlantilla(Integer xIdPlantilla);




}

