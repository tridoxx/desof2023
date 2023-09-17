package entrega_sprint2;

public class Main {

	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("empresaUno", "calle 1#1-1", 1234567, "123-4");
		Empleado empleado1 = new Empleado("joseandres", "joseandres@gmail.com", "asd", "empresaUno");
        MovimientoDinero nuevoMovimiento = new MovimientoDinero(100.0, "Venta de productos", "joseandres");

		System.out.println(empresa1.getNombreEmpresa());
		System.out.println(empleado1.getNombreEmpleado());
		System.out.println(nuevoMovimiento.getMonto());

		//existe uina validación para que solo  permita los roles de administrador y operativo.
		//si el rol no es ninguno de los 2 lanza una excepcion con el siguiente codigo se puede validar
		//empleado1.setRolEmpleado("asd");
		//System.out.println(empleado1.getRolEmpleado());

		


		
	}

}
