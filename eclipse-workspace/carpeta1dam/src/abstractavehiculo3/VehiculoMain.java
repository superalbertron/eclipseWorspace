package abstractavehiculo3;

public class VehiculoMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
     Coche coche1=new Coche("Seat","Rojo", "1200");
     Moto moto=new Moto("Honda","verde","1300");
     Moto moto1=new Moto("Yamaha","rojo","1300");
     Bicicleta bici=new Bicicleta("AVG","Azul","Montaña");
     Patinete pati=new Patinete("uma","rosa",1200.00);
     
     UsuarioNombre user=new UsuarioNombre("Alberto","superalbertron");
     
     coche1.MostrarDatos();
     coche1.Gracias();
     System.out.println();
	 moto.MostrarDatos();
	 moto.Gracias();
	 System.out.println();
	 moto1.MostrarDatos();
	 moto1.Gracias();
	 System.out.println();
	 bici.MostrarDatos();
	 bici.Gracias();
	 System.out.println();
	 pati.MostrarDatos();
	 pati.Gracias();
	 pati.Fecha();
	 
   		
	}
}
