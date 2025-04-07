package archive.video;
import archive.ArchivoMultimedia;
public class Video extends ArchivoMultimedia{
	protected Video(int id, String name, String autor, int tiempo_reprod, String fecha_lanz,int size){
		super(id,name,autor);
		this.tiempo_reprod=tiempo_reprod;
		this.fecha_lanz=fecha_lanz;
		this.size=size;
	}
}