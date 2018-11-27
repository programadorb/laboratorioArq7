package com.udea.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String gradosCentigrados;
    private String gradosFarenheit;
    private String humedadRelativa;
    private String tipoNubosidad;
    private String ciudad;
    private String dia;
    private String mes;
    private String probabilidadPrecipitaciones;
    
    public Clima(){}



    public void setId(long id){this.id=id;}
    public long getId(){return this.id;}


    public void setGradosCentigrados(String gradosCentigrados){this.gradosCentigrados=gradosCentigrados;}
    public String getGradosCentigrados(){return this.gradosCentigrados;}


    public void setGradosFarenheit(String gradosFarenheit){this.gradosFarenheit=gradosFarenheit;}
    public String getGradosFarenheit(){return this.gradosFarenheit;}


    public void setHumedadRelativa(String humedadRelativa){this.humedadRelativa=humedadRelativa;}
    public String getHumedadRelativa(){return this.humedadRelativa;}


    public void setTipoNubosidad(String tipoNubosidad){this.tipoNubosidad=tipoNubosidad;}
    public String getTipoNubosidad(){return this.tipoNubosidad;}


    public void setCiudad(String ciudad){this.ciudad=ciudad;}
    public String getCiudad(){return this.ciudad;}


    public void setDia(String dia){this.dia=dia;}
    public String getDia(){return this.dia;}


    public void setMes(String mes){this.mes=mes;}
    public String getMes(){return this.mes;}


    public void setProbabilidadPrecipitaciones(String probabilidadPrecipitaciones){this.probabilidadPrecipitaciones=probabilidadPrecipitaciones;}
    public String getProbabilidadPrecipitaciones(){return this.probabilidadPrecipitaciones;}

}