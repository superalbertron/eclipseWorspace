package ejerciciosdeclase;

public class Agenda {
 private Contacte[]contactos;
 private int tama�o;
 public Agenda() {
	 contactos=new Contacte[100];
	 tama�o=0;
	 
 }
 public void crearContacto (String nombre, String telefono) {
	Contacte co = new Contacte (nombre, telefono);
	if (tama�o<100) {
		contactos[tama�o]=co;
		tama�o++;
		
	}else {
		System.out.println("ERROR NO HAY SITIO EN TU AGENDA");
	}

 }
 public void crerContacto(Contacte C) {
	 if (tama�o<100) {
		contactos[tama�o]=C;
			tama�o++;
			
		}else {
			System.out.println("ERROR NO HAY SITIO EN TU AGENDA");
		}
 }
 public void listaDatosContacto() {
	 for(int i=0;i<tama�o;i++) {
		 System.out.println(contactos[i]);
		 
	 }
 	
 }
 
}
