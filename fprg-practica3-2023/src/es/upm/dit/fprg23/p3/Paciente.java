package es.upm.dit.fprg23.p3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {

	private String dni, nombre, apellidos;
	private GrupoSanguineo grupoSanguineo;
	private int fechaNacimiento, altura;
	private double peso;
	
	private int[] historicoPresionSistolica;
	private int[] historicoPresionDiastolica;
	private double[] historicoTemperatura;
		
	public Paciente(String dni, String nombre, String apellidos, int fechaNacimiento, int altura,
			double peso, GrupoSanguineo grupoSanguineo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.grupoSanguineo = grupoSanguineo;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
		this.peso = peso;
		this.historicoPresionDiastolica = new int[5];
		this.historicoPresionSistolica = new int[5];
		this.historicoTemperatura = new double[5];
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public GrupoSanguineo getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean mayorDeEdad() {
		long fechaActual = 1970 + (System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); 
		return (fechaActual - fechaNacimiento) >= 18;
	}
	
	public double calcularIMC() {
		return peso / Math.pow(altura, 2);
	}
	
	
	public int[] getHistoricoPresionSistolica() {
		return historicoPresionSistolica;
	}

	public void setHistoricoPresionSistolica(int[] historicoPresionSistolica) {
		this.historicoPresionSistolica = historicoPresionSistolica;
	}

	public int[] getHistoricoPresionDiastolica() {
		return historicoPresionDiastolica;
	}

	public void setHistoricoPresionDiastolica(int[] historicoPresionDiastolica) {
		this.historicoPresionDiastolica = historicoPresionDiastolica;
	}

	public double[] getHistoricoTemperatura() {
		return historicoTemperatura;
	}

	public void setHistoricoTemperatura(double[] historicoTemperatura) {
		this.historicoTemperatura = historicoTemperatura;
	}
	

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos  + ", fechaNacimiento=" + fechaNacimiento + ", altura=" + altura + ", peso=" + peso
				+ ", grupoSanguineo="
				+ grupoSanguineo + "]";
	}
	
	
	
}
