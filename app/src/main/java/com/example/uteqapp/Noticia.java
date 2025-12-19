package com.example.uteqapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Noticia {
    private String titulo;
    private String portada;
    private String fecha;
    private String link;
    public Noticia(JSONObject a) throws JSONException {


            titulo = a.getString(  "titulo").toString();
            portada = "https://uteq.edu.ec/assets/images/videos/res-sem/" + a.getString(  "portadaVideo").toString();
            fecha = a.getString(  "fechapub").toString();
            link ="" + a.getString("urlvideo1").toString()
                .replace("youtu.be/shorts/", "www.youtube.com/watch?v=");
    }


    public static ArrayList<Noticia> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Noticia> noticias = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            noticias.add(new Noticia(datos.getJSONObject(i)));
        }
        return noticias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {this.link = link;}




}
