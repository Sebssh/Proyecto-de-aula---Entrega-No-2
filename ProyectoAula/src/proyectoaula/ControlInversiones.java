/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sebig
 */
class ControlInversiones implements Usuario, GestionFinanciera {
    private String nombreUsuario;
    private String correoUsuario;
    private String contraseñaUsuario;
    private float capitalInicial;
    private final List<Inversion> listaDeInversiones;
    private final List<String> objetivos;
    private final List<Presupuesto> presupuestos;
    private final List<Ingreso> ingresos;
    private final List<Gasto> gastos;

    public ControlInversiones() {
        this.listaDeInversiones = new ArrayList<>();
        this.objetivos = new ArrayList<>();
        this.presupuestos = new ArrayList<>();
        this.ingresos = new ArrayList<>();
        this.gastos = new ArrayList<>();
    }

    @Override
    public void registrarUsuario(String nombre, String correo, String contraseña) {
        this.nombreUsuario = nombre;
        this.correoUsuario = correo;
        this.contraseñaUsuario = contraseña;
    }

    @Override
    public boolean iniciarSesion(String correo, String contraseña) {
        return this.correoUsuario.equals(correo) && this.contraseñaUsuario.equals(contraseña);
    }

    @Override
    public void iniciarCapital(float montoInicial) {
        this.capitalInicial = montoInicial;
    }

    @Override
    public void realizarInversion(float monto, Date fecha, float tasa, String descripcion) {
        Inversion nuevaInversion = new Inversion(monto, fecha, tasa, descripcion);
        this.listaDeInversiones.add(nuevaInversion);
        this.disminuirCapital(monto);
    }

    @Override
    public void registrarIngreso(float monto, Date fecha, String descripcion) {
        Ingreso nuevoIngreso = new Ingreso(monto, fecha, descripcion);
        this.ingresos.add(nuevoIngreso);
        this.aumentarCapital(monto);
    }

    @Override
    public void registrarGasto(float monto, Date fecha, String descripcion) {
        Gasto nuevoGasto = new Gasto(monto, fecha, descripcion);
        this.gastos.add(nuevoGasto);
        this.disminuirCapital(monto);
    }

    @Override
    public float calcularGanancias() {
        float ganancias = 0;
        for (Inversion inversion : listaDeInversiones) {
            ganancias += inversion.getMonto() * inversion.getTasa(); // Cálculo de ganancias básico
        }
        return ganancias;
    }

    @Override
    public void aumentarCapital(float monto) {
        this.capitalInicial += monto;
    }

    @Override
    public void disminuirCapital(float monto) {
        this.capitalInicial -= monto;
    }

    @Override
    public void establecerObjetivo(String objetivo) {
        this.objetivos.add(objetivo);
    }

    @Override
    public void crearPresupuesto(float monto, String periodo) {
        Presupuesto nuevoPresupuesto = new Presupuesto(monto, periodo);
        this.presupuestos.add(nuevoPresupuesto);
    }

    @Override
    public ReporteFinanciero generarReporte() {
        return new ReporteFinanciero(this.listaDeInversiones, this.ingresos, this.gastos, calcularGanancias(), this.objetivos, this.presupuestos);
    }
}

