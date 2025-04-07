// Importación de clases necesarias
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import archive.*;
import archive.music.*;
import archive.video.*;

class MiSpoty {
    // Declaración de listas para archivos multimedia
    ArrayList<ArchivoMultimedia> listaRep1; // Lista de reproducción
    ArrayList<ArchivoMultimedia> listaDisp1; // Lista de archivos disponibles

    public static void main(String[] args) {
        Random rand = new Random(); // Generador de números aleatorios
        String name, autor, fecha_lanz; // Variables para datos de entrada
        int id = 0, tiempo_reprod, size; // Variables para atributos de archivos
        int pointer = 0; // Puntero para la lista de reproducción
        boolean flag = false; // Bandera para salir del programa
        Scanner scann = new Scanner(System.in); // Escáner para entrada del usuario
        MiSpoty obj = new MiSpoty(); // Instancia de la clase principal

        // Inicialización de las listas
        obj.listaRep1 = new ArrayList<>();
        obj.listaDisp1 = new ArrayList<>();

        do {
            // Mostrar listas de archivos multimedia
            System.out.println("Lista de Archivos Multimedia Disponibles");
            obj.PrintList(obj.listaDisp1, -1);
            System.out.println("\nLista de Archivos Lista de Reproduccion");
            obj.PrintList(obj.listaRep1, pointer);

            // Menú principal
            System.out.println("\n1.Crear Nuevo Archivo Multimedia\n2.Eliminar cancion\n3.Añadir a la lista\n4.Reproducir lista\n5.Anterior\n6.Siguiente\n7.Detener lista\n8.Salir");
            int option = Integer.parseInt(scann.nextLine());

            switch (option) {
                case 1:
                    // Submenú para crear archivos multimedia
                    System.out.println("\nSeleccione el tipo de archivo a crear:");
                    System.out.println("1.Podcast\n2.Música\n3.Video\n4.Salir");
                    option = Integer.parseInt(scann.nextLine());
                    switch (option) {
                        case 1:
                            // Crear un Podcast
                            System.out.println("Nombre:");
                            name = scann.nextLine();
                            System.out.println("Autor:");
                            autor = scann.nextLine();
                            System.out.println("Duracion:");
                            tiempo_reprod = Integer.parseInt(scann.nextLine());
                            System.out.println("Fecha de Lanzamiento:");
                            fecha_lanz = scann.nextLine();
                            size = rand.nextInt(5) + 1; // Tamaño aleatorio
                            obj.listaDisp1.add(new Podcast(id, name, autor, tiempo_reprod, fecha_lanz, size));
                            id++; // Incrementar ID
                            break;
                        case 2:
                            // Submenú para crear música
                            System.out.println("1.Electronica\n2.Pop\n3.Rock\n4.Salir");
                            option = Integer.parseInt(scann.nextLine());
                            switch (option) {
                                case 1:
                                    // Crear música electrónica
                                    System.out.println("Nombre:");
                                    name = scann.nextLine();
                                    System.out.println("Autor:");
                                    autor = scann.nextLine();
                                    System.out.println("Duracion:");
                                    tiempo_reprod = Integer.parseInt(scann.nextLine());
                                    System.out.println("Fecha de Lanzamiento:");
                                    fecha_lanz = scann.nextLine();
                                    size = rand.nextInt(5) + 1;
                                    obj.listaDisp1.add(new Electro(id, name, autor, tiempo_reprod, fecha_lanz, size));
                                    id++;
                                    break;
                                case 2:
                                    // Crear música pop
                                    System.out.println("Nombre:");
                                    name = scann.nextLine();
                                    System.out.println("Autor:");
                                    autor = scann.nextLine();
                                    System.out.println("Duracion:");
                                    tiempo_reprod = Integer.parseInt(scann.nextLine());
                                    size = rand.nextInt(5) + 1;
                                    System.out.println("Fecha de Lanzamiento:");
                                    fecha_lanz = scann.nextLine();
                                    obj.listaDisp1.add(new Pop(id, name, autor, tiempo_reprod, fecha_lanz, size));
                                    id++;
                                    break;
                                case 3:
                                    // Crear música rock
                                    System.out.println("Nombre:");
                                    name = scann.nextLine();
                                    System.out.println("Autor:");
                                    autor = scann.nextLine();
                                    System.out.println("Duracion:");
                                    tiempo_reprod = Integer.parseInt(scann.nextLine());
                                    size = rand.nextInt(5) + 1;
                                    System.out.println("Fecha de Lanzamiento:");
                                    fecha_lanz = scann.nextLine();
                                    obj.listaDisp1.add(new Rock(id, name, autor, tiempo_reprod, fecha_lanz, size));
                                    id++;
                                    break;
                                case 4:
                                    // Salir del submenú
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                                    break;
                            }
                            break;
                        case 3:
                            // Submenú para crear videos
                            System.out.println("1.Shorts\n2.VNormal\n3.Salir");
                            option = Integer.parseInt(scann.nextLine());
                            switch (option) {
                                case 1:
                                    // Crear un video normal
                                    System.out.println("Nombre:");
                                    name = scann.nextLine();
                                    System.out.println("Autor:");
                                    autor = scann.nextLine();
                                    System.out.println("Duracion:");
                                    tiempo_reprod = Integer.parseInt(scann.nextLine());
                                    size = rand.nextInt(9) + 1;
                                    System.out.println("Fecha de Lanzamiento:");
                                    fecha_lanz = scann.nextLine();
                                    obj.listaDisp1.add(new VNormal(id, name, autor, tiempo_reprod, fecha_lanz, size));
                                    id++;
                                    break;
                                case 2:
                                    // Crear un short
                                    System.out.println("Nombre:");
                                    name = scann.nextLine();
                                    System.out.println("Autor:");
                                    autor = scann.nextLine();
                                    System.out.println("Duracion:");
                                    tiempo_reprod = Integer.parseInt(scann.nextLine());
                                    size = rand.nextInt(8) + 1;
                                    System.out.println("Fecha de Lanzamiento:");
                                    fecha_lanz = scann.nextLine();
                                    obj.listaDisp1.add(new Shorts(id, name, autor, tiempo_reprod, fecha_lanz, size));
                                    id++;
                                    break;
                                case 3:
                                    // Salir del submenú
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                                    break;
                            }
                            break;
                        case 4:
                            // Salir del submenú
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    // Eliminar un archivo de la lista de reproducción
                    obj.deleteArchive(pointer);
                    break;
                case 3:
                    // Añadir un archivo a la lista de reproducción
                    System.out.println("Inserte el elemento a ingresar");
                    //Faltan dos lineas para que el usuario pueda elegir el elemento a añadir
					//Igual creo dormirme un poco tarde, me falto una tarea de mates avanzadas, si creo estar despierto despues de las 12
                    break;
                case 4:
                    // Reproducir la lista de reproducción
                    obj.playList(pointer);
					// Yo sé que puedes :>, confio en ti tqm
                    break;
                case 5:
                    // Retroceder en la lista de reproducción
                    pointer = (pointer - 1 + obj.listaRep1.size()) % obj.listaRep1.size();
					//Es una forma de retroceder en la lista, si el puntero es menor a 0, se vuelve al final de la lista
					// algo como usar if (pointer<0) pointer=obj.listaRep1.size()-1;

                    break;
                case 6:
                    // Avanzar en la lista de reproducción
                    pointer = (pointer + 1) % obj.listaRep1.size();
                    break;
                case 7:
                    // Detener la lista de reproducción
                    pointer = 0;
                    break;
                case 8:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    flag = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!flag); // Repetir mientras no se elija salir
    }

    // Método para imprimir las listas
    void PrintList(ArrayList<ArchivoMultimedia> list, int pointer) {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (ArchivoMultimedia m : list) {
            if (m.getId() == pointer)
                System.out.print("---> ");
            if (m instanceof Musica) {
                Musica musica = (Musica) m;
                System.out.println("Música: " + m.getId() + " " + musica.getNombre() + " - " + musica.getAutor());
            } else if (m instanceof Podcast) {
                Podcast podcast = (Podcast) m;
                System.out.println("Podcast: " + m.getId() + " " + podcast.getNombre() + " - " + podcast.getAutor());
            } else if (m instanceof Video) {
                Video video = (Video) m;
                System.out.println("Video: " + m.getId() + " " + video.getNombre() + " - " + video.getAutor());
            } else {
                System.out.println("Archivo multimedia desconocido: " + m.getNombre());
            }
        }
        System.out.println("");
    }

    // Método para eliminar un archivo de la lista de reproducción
    void deleteArchive(int pointer) {
        if (listaRep1.isEmpty()) {
            System.out.println("No hay nada que eliminar");
        } else {
            listaRep1.get(pointer).setNull();
        }
    }

    // Método para reproducir la lista de reproducción
    void playList(int pointer) {
        for (int n = 0; pointer < listaRep1.size(); n++) {
            
        }
    }
}