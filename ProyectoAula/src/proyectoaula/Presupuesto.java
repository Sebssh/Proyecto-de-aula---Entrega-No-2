/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

/**
 *
 * @author sebig
 */
public class Presupuesto {

    private final float monto;
    private final String periodo;

    public Presupuesto(float monto, String periodo) {
        this.monto = monto;
        this.periodo = periodo;
    }

    public float getMonto() {
        return this.monto;
    }

    public String getPeriodo() {
        return this.periodo;
    }

}
