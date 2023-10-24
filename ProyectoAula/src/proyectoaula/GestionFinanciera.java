/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoaula;

import java.util.Date;

/**
 *
 * @author sebig
 */
public interface GestionFinanciera {

    void iniciarCapital(float montoInicial);

    void realizarInversion(float monto, Date fecha, float tasa, String descripcion);

    void registrarIngreso(float monto, Date fecha, String descripcion);

    void registrarGasto(float monto, Date fecha, String descripcion);

    float calcularGanancias();

    void aumentarCapital(float monto);

    void disminuirCapital(float monto);

    void establecerObjetivo(String objetivo);

    void crearPresupuesto(float monto, String periodo);

    ReporteFinanciero generarReporte();

}
