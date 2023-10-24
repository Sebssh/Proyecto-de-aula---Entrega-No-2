/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoaula;

import java.util.Date;

/**
 *
 * @author sebig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ControlInversiones controlInversiones = new ControlInversiones();

        controlInversiones.registrarUsuario("NombreUsuario", "correo@ejemplo.com", "contraseña123");

        if (controlInversiones.iniciarSesion("correo@ejemplo.com", "contraseña123")) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Inicio de sesión fallido");
        }

        controlInversiones.iniciarCapital(10000);
        controlInversiones.realizarInversion(5000, new Date(), 0.1f, "Inversión en acciones");
        controlInversiones.registrarIngreso(2000, new Date(), "Ingreso mensual");
        controlInversiones.registrarGasto(1000, new Date(), "Gasto en alimentación");
        System.out.println("Ganancias totales: " + controlInversiones.calcularGanancias());

        controlInversiones.aumentarCapital(2000);
        controlInversiones.disminuirCapital(1000);
        controlInversiones.establecerObjetivo("Comprar una casa");
        controlInversiones.crearPresupuesto(2000, "Mensual");

        ReporteFinanciero reporteFinanciero = controlInversiones.generarReporte();

        System.out.println("Objetivos: " + reporteFinanciero.getObjetivos());
        System.out.println("Presupuestos: " + reporteFinanciero.getPresupuestos());
        System.out.println("Ingresos: " + reporteFinanciero.getIngresos());
        System.out.println("Gastos: " + reporteFinanciero.getGastos());
    }
}
