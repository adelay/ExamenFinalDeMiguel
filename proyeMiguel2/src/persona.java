
/**
 * Autor Miguel iniesta Garcia
 * 
 */
public class persona {
	
	String nombre;
	String apellido;
	int edad;
	String hobbie;
	
	/**
	 * devuelve el nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * metodo que devuelve el apellido
	 */
	public String getApellido()
	{
		return apellido;
	}
	
	/**
	 * Metodo edad nuevo
	 */
	public int getEdad()
	{
		return edad;
	}
	
	/**
	 * Metodo edad
	 */
	public void setEdad(int edad2)
	{
		this.edad = edad2;
	}
	
	/**
	 * 
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void mostrar(){
		System.out.println("Nombre" + nombre);
	}
	
}