package archive;
public class ArchivoMultimedia{
	protected  int id;
	protected  int tiempo_reprod;
	protected  String nombre;
	protected  String autor;
	protected  String fecha_lanz;
	protected  int size;
	public ArchivoMultimedia(){
		nombre="Por asignar";
		autor="Por asignar";
	}
	public ArchivoMultimedia(int id, String name, String autor){
		this.id=id;
		this.nombre=name;
		this.autor=autor;
	}
	public void reproducir(){
		System.out.println("Iniciando reproduccion del archivo... "+nombre+" de "+autor);
	}
	public void parar(){
		System.out.println("Deteniendo reproduccion del archivo...");
	}
	public void adelantar(){
		System.out.println("Avanzado la reproduccion del archivo...");
	}
	public void retroceder(){
		System.out.println("Retrocediendo la reproduccion del archivo...");
	}
	public void setNull() {
    this.id = 0;
    this.nombre = null;
    this.autor = null;
    this.tiempo_reprod = 0;
    this.fecha_lanz = null;
    this.size = 0;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTiempoReprod() {
		return tiempo_reprod;
	}
	public void setTiempoReprod(int tiempo_reprod) {
		this.tiempo_reprod = tiempo_reprod;
	}
	public String getFechaLanz() {
		return fecha_lanz;
	}
	public void setFechaLanz(String fecha_lanz) {
		this.fecha_lanz = fecha_lanz;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}