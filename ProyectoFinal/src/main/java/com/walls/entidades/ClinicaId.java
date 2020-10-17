package com.walls.entidades;
// Generated 15-may-2020 17:52:10 by Hibernate Tools 5.4.14.Final

/**
 * ClinicaId generated by hbm2java
 */
public class ClinicaId implements java.io.Serializable {

	private Integer codClinica;
	private String nombre;
	private String direccion;
	private String mail;
	private Integer telefono;

	public ClinicaId() {
	}

	public ClinicaId(Integer codClinica, String nombre, String direccion, String mail, Integer telefono) {
		this.codClinica = codClinica;
		this.nombre = nombre;
		this.direccion = direccion;
		this.mail = mail;
		this.telefono = telefono;
	}

	public Integer getCodClinica() {
		return this.codClinica;
	}

	public void setCodClinica(Integer codClinica) {
		this.codClinica = codClinica;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClinicaId))
			return false;
		ClinicaId castOther = (ClinicaId) other;

		return ((this.getCodClinica() == castOther.getCodClinica()) || (this.getCodClinica() != null
				&& castOther.getCodClinica() != null && this.getCodClinica().equals(castOther.getCodClinica())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getDireccion() == castOther.getDireccion()) || (this.getDireccion() != null
						&& castOther.getDireccion() != null && this.getDireccion().equals(castOther.getDireccion())))
				&& ((this.getMail() == castOther.getMail()) || (this.getMail() != null && castOther.getMail() != null
						&& this.getMail().equals(castOther.getMail())))
				&& ((this.getTelefono() == castOther.getTelefono()) || (this.getTelefono() != null
						&& castOther.getTelefono() != null && this.getTelefono().equals(castOther.getTelefono())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodClinica() == null ? 0 : this.getCodClinica().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getDireccion() == null ? 0 : this.getDireccion().hashCode());
		result = 37 * result + (getMail() == null ? 0 : this.getMail().hashCode());
		result = 37 * result + (getTelefono() == null ? 0 : this.getTelefono().hashCode());
		return result;
	}

}
