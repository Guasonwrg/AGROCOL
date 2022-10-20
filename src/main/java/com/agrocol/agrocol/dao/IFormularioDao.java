package com.agrocol.agrocol.dao;

import com.agrocol.agrocol.modelo.*;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;



@Remote
public interface IFormularioDao {

    public Integer  altaPlantillaFormulario(PlantillaFormulario plantillaFormulario);

    public List<PlantillaFormulario> listadoPlantillasFormulario();

    public List<Departamento> listadoDepartamentos();

    public List<Localidad> listadDeLocalidades(Integer xIdDepartamento);

    public List<Zona> listadDeZonas(Integer xIdLocalidades);

    public List<MetodoMuestreo> listadoMetodoMuestreo();

    public List<TipoMuestreo> listadoTipoMuestreo();

    public List<EstacionMuestreo> listadoEstacionMuestreo();

    public boolean altaActividadCampo(Formulario formulario);

    public List<Formulario> listadoActividadeCapoSegunEstacionDeMuestreo(Integer idEstacionMuestreo);

    public List<Equipamiento> listadoEquipamientos();

    public List<Formulario> listadoActividadeRangoFechaOrdenadaDepto(Date fechaDesde ,Date fechaHasta);

    public List<Formulario> listadoActividadedeUsuarioExperto(Usuario usuario);

    public Boolean eliminarFormulario(Integer idForm);

    public Formulario obtenerFormularioPorId(Integer idForm);

    public PlantillaFormulario obtenerPlantillaFormulario(Integer idPlantilla);

    public List<Formulario> ListadoActividadesCampo();

    public boolean eliminarActividadCampo(Integer idForm);


}
