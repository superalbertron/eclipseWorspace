package HibernateMysql;

public class ViewCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cliente=new HibernateMysql.ClientesControl().createUsuario(1, "Alberto", "M�laga");
		
		System.out.println(cliente);
		
		
	}

}
