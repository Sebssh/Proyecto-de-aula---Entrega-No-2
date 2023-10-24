/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.List;

/**
 *
 * @author sebig
 */
public class ReporteFinanciero {

    private final List<Inversion> inversiones;
    private final List<Ingreso> ingresos;
    private final List<Gasto> gastos;
    private final float ganancias;
    private final List<String> objetivos;
    private final List<Presupuesto> presupuestos;

    public ReporteFinanciero(List<Inversion> inversiones, List<Ingreso> ingresos, List<Gasto> gastos, float ganancias, List<String> objetivos, List<Presupuesto> presupuestos) {
        this.inversiones = inversiones;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.ganancias = ganancias;
        this.objetivos = objetivos;
        this.presupuestos = presupuestos;
    }

    public List<Inversion> getInversiones() {
        return inversiones;
    }

    public float getGanancias() {
        return ganancias;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public List<Presupuesto> getPresupuestos() {
        return presupuestos;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

}
