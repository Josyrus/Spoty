package archive;
import archive.ArchivoMultimedia;
public class Podcast extends ArchivoMultimedia{
	public Podcast(int id, String name, String autor, int tiempo_reprod, String fecha_lanz,int size){
		super(id,name,autor);
		this.tiempo_reprod=tiempo_reprod;
		this.fecha_lanz=fecha_lanz;
		this.size=size;
	}
}
