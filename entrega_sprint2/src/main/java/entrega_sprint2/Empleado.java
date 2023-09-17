package entrega_sprint2;

public class Empleado  {
	
	//atributos
		private String nombreEmpleado;
		private String correoEmpleado;
		private String rolEmpleado;
		private String	empresa;
		//constructor
		public Empleado(String nombreEmpleado, String correoEmpleado, String rolEmpleado, String empresa) {
			super();
			this.nombreEmpleado = nombreEmpleado;
			this.correoEmpleado = correoEmpleado;
			this.rolEmpleado = rolEmpleado;
			this.empresa = empresa;
		}
//setters y getters
		public String getNombreEmpleado() {
			return nombreEmpleado;
		}

		public void setNombreEmpleado(String nombreEmpleado) {
			this.nombreEmpleado = nombreEmpleado;
		}

		public String getCorreoEmpleado() {
			return correoEmpleado;
		}

		public void setCorreoEmpleado(String correoEmpleado) {
			this.correoEmpleado = correoEmpleado;
		}

		public String getRolEmpleado() {
			return rolEmpleado;
		}

		public void setRolEmpleado(String rolEmpleado) {
			if("administrador".equals(rolEmpleado) || "operativo".equals(rolEmpleado) ) {
			this.rolEmpleado = rolEmpleado;}
			else {  throw new IllegalArgumentException("el rol es invalido debe ser 'administrador' u 'operativo'");
		}}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

	




	
}
