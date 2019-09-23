package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tabla alumno")
public class Cristofer {
	@Id
	@Column(name="edad")
	private int edad;
	
	@Column(name="dni")
	private int dni;
	
	@Column(name="estudios")
	private String estudios;
	
	@Column(name="estatura")
	private int estatura;
	
	public Cristofer() {
		
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	
	
	
}
