package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="medicos")
public class Medicos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="apellidos")
	private String apellidos;
	
	@Column(name ="especialidad")
	private String especialidad;
	
	@OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
	private List<Cita> citas = new ArrayList<>();
	
	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Medicos() {}

	public Medicos(String nombre, String apellidos, String especialidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

	public Medicos(int id, String nombre, String apellidos, String especialidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medicos [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad="
				+ especialidad + "]";
	}
	
	
}
