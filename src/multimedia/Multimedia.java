/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

/**
 *
 * @author alex_
 */
public class Multimedia {
    private String titulo;
    private String autor;
    private Formatos formato;
    private String duracion;

    public Multimedia(String titulo, String autor, Formatos formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formatos getFormato() {
        return formato;
    }

    public void setFormato(Formatos formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString(){
       return "Titulo: " + titulo + "Autor: " + autor + "Formato: " + formato + "Duracion: " + duracion;
    }
    
    public boolean equals(Multimedia m){
        if(this.titulo==m.getTitulo() && this.autor==m.getAutor()){
            return true;
        }else
            return false;
    }
}
