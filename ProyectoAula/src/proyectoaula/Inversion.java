/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.Date;

/**
 *
 * @author sebig
 */
public class Inversion {

    private final float monto;
    private final Date fecha;
    private final float tasa;
    private final String descripcion;

    public Inversion(float monto, Date fecha, float tasa, String descripcion) {
        this.monto = monto;
        this.fecha = fecha;
        this.tasa = tasa;
        this.descripcion = descripcion;
    }

    public float getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getTasa() {
        return tasa;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
