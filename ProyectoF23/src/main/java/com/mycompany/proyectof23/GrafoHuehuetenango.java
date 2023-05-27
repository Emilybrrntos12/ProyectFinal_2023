/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectof23;

/**
 *
 * @author Emily Barrientos
 */
import java.util.*;

public class GrafoHuehuetenango {
    private int numNodos;
    private List<List<Arista>> listaAdyacencia;
    private Map<Integer, String> nombresMunicipios;

    public GrafoHuehuetenango(int numNodos) {
        this.numNodos = numNodos;
        this.listaAdyacencia = new ArrayList<>(numNodos);
        this.nombresMunicipios = new HashMap<>();
        for (int i = 0; i < numNodos; i++) {
            this.listaAdyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino, double distanciaKm) {
        this.listaAdyacencia.get(origen).add(new Arista(destino, distanciaKm));
        this.listaAdyacencia.get(destino).add(new Arista(origen, distanciaKm)); // Si el grafo es no dirigido
    }

    public void asignarNombreMunicipio(int nodo, String nombre) {
        this.nombresMunicipios.put(nodo, nombre);
    }

    public String obtenerNombreMunicipio(int nodo) {
        return this.nombresMunicipios.get(nodo);
    }

    public List<Arista> obtenerAdyacentes(int nodo) {
        return this.listaAdyacencia.get(nodo);
    }

    public int obtenerNumNodos() {
        return this.numNodos;
    }

    public static void main(String[] args) {
        // Crear el grafo
        int numNodos = 33;
        GrafoHuehuetenango grafo = new GrafoHuehuetenango(numNodos);

        // Asignar nombres a los municipios
        grafo.asignarNombreMunicipio(0, "Huehuetenango");
        grafo.asignarNombreMunicipio(1, "Aguacatán");
        grafo.asignarNombreMunicipio(2, "Chiantla");
        grafo.asignarNombreMunicipio(3, "Colotenango");
        grafo.asignarNombreMunicipio(4, "Concepción Huista");
        grafo.asignarNombreMunicipio(5, "Cuilco");
        grafo.asignarNombreMunicipio(6, "Jacaltenango");
        grafo.asignarNombreMunicipio(7, "La Democracia");
        grafo.asignarNombreMunicipio(8, "La Libertad");
        grafo.asignarNombreMunicipio(9, "Malacatancito");
        grafo.asignarNombreMunicipio(10, "Nentón");
        grafo.asignarNombreMunicipio(11, "San Antonio Huista");
        grafo.asignarNombreMunicipio(12, "San Gaspar Ixchil");
        grafo.asignarNombreMunicipio(13, "San Ildefonso Ixtahuacán");
        grafo.asignarNombreMunicipio(14, "San Juan Atitán");
        grafo.asignarNombreMunicipio(15, "San Juan Ixcoy");
        grafo.asignarNombreMunicipio(16, "San Mateo Ixtatán");
        grafo.asignarNombreMunicipio(17, "San Miguel Acatán");
        grafo.asignarNombreMunicipio(18, "San Pedro Necta");
        grafo.asignarNombreMunicipio(19, "San Pedro Soloma");
        grafo.asignarNombreMunicipio(20, "San Rafael La Independencia");
        grafo.asignarNombreMunicipio(21, "San Rafael Pétzal");
        grafo.asignarNombreMunicipio(22, "San Sebastián Coatán");
        grafo.asignarNombreMunicipio(23, "San Sebastián Huehuetenango");
        grafo.asignarNombreMunicipio(24, "Santa Ana Huista");
        grafo.asignarNombreMunicipio(25, "Santa Bárbara");
        grafo.asignarNombreMunicipio(26, "Santa Cruz Barillas");
        grafo.asignarNombreMunicipio(27, "Santa Eulalia");
        grafo.asignarNombreMunicipio(28, "Santiago Chimaltenango");
        grafo.asignarNombreMunicipio(29, "Tectitán");
        grafo.asignarNombreMunicipio(30, "Todos Santos Cuchumatán");
        grafo.asignarNombreMunicipio(31, "Unión Cantinil");
        grafo.asignarNombreMunicipio(32, "Santiago Petatán");

        // Agregar las aristas con sus distancias en kilómetros
        
        grafo.agregarArista(0, 0, 0);
        grafo.agregarArista(0, 1, 24);
        grafo.agregarArista(0, 2, 7);
        grafo.agregarArista(0, 3, 55);
        grafo.agregarArista(0, 4, 58);
        grafo.agregarArista(0, 5, 70);
        grafo.agregarArista(0, 6, 73);
        grafo.agregarArista(0, 7, 71);
        grafo.agregarArista(0, 8, 61);
        grafo.agregarArista(0, 9, 13);
        grafo.agregarArista(0, 10, 112);
        grafo.agregarArista(0, 11, 107);
        grafo.agregarArista(0, 12, 40);
        grafo.agregarArista(0, 13, 44);
        grafo.agregarArista(0, 14, 35);
        grafo.agregarArista(0, 15, 60);
        grafo.agregarArista(0, 16, 112);
        grafo.agregarArista(0, 17, 90);
        grafo.agregarArista(0, 18, 53);
        grafo.agregarArista(0, 19, 72);
        grafo.agregarArista(0, 20, 94);
        grafo.agregarArista(0, 21, 37);
        grafo.agregarArista(0, 22, 100);
        grafo.agregarArista(0, 23, 22);
        grafo.agregarArista(0, 24, 99);
        grafo.agregarArista(0, 25, 19);
        grafo.agregarArista(0, 26, 139);
        grafo.agregarArista(0, 27, 83);
        grafo.agregarArista(0, 28, 53);
        grafo.agregarArista(0, 29, 100);
        grafo.agregarArista(0, 30, 45);
        grafo.agregarArista(0, 31, 75);
        grafo.agregarArista(0, 32, 75);
        
        grafo.agregarArista(1, 0, 24);
        grafo.agregarArista(1, 1, 0);
        grafo.agregarArista(1, 2, 23);
        grafo.agregarArista(1, 3, 59);
        grafo.agregarArista(1, 4, 60);
        grafo.agregarArista(1, 5, 94);
        grafo.agregarArista(1, 6, 75);
        grafo.agregarArista(1, 7, 95);
        grafo.agregarArista(1, 8, 85);
        grafo.agregarArista(1, 9, 40);
        grafo.agregarArista(1, 10, 137);
        grafo.agregarArista(1, 11, 86);
        grafo.agregarArista(1, 12, 65);
        grafo.agregarArista(1, 13, 69);
        grafo.agregarArista(1, 14, 59);
        grafo.agregarArista(1, 15, 62);
        grafo.agregarArista(1, 16, 114);
        grafo.agregarArista(1, 17, 92);
        grafo.agregarArista(1, 18, 77);
        grafo.agregarArista(1, 19, 74);
        grafo.agregarArista(1, 20, 96);
        grafo.agregarArista(1, 21, 61);
        grafo.agregarArista(1, 22, 102);
        grafo.agregarArista(1, 23, 47);
        grafo.agregarArista(1, 24, 124);
        grafo.agregarArista(1, 25, 43);
        grafo.agregarArista(1, 26, 141);
        grafo.agregarArista(1, 27, 85);
        grafo.agregarArista(1, 28, 77);
        grafo.agregarArista(1, 29, 124);
        grafo.agregarArista(1, 30, 47);
        grafo.agregarArista(1, 31, 77);
        grafo.agregarArista(1, 32, 77);
       
        grafo.agregarArista(2, 0, 7);
        grafo.agregarArista(2, 1, 23);
        grafo.agregarArista(2, 2, 0);
        grafo.agregarArista(2, 3, 42);
        grafo.agregarArista(2, 4, 51);
        grafo.agregarArista(2, 5, 76);
        grafo.agregarArista(2, 6, 67);
        grafo.agregarArista(2, 7, 77);
        grafo.agregarArista(2, 8, 67);
        grafo.agregarArista(2, 9, 20);
        grafo.agregarArista(2, 10, 119);
        grafo.agregarArista(2, 11, 77);
        grafo.agregarArista(2, 12, 47);
        grafo.agregarArista(2, 13, 51);
        grafo.agregarArista(2, 14, 41);
        grafo.agregarArista(2, 15, 54);
        grafo.agregarArista(2, 16, 105);
        grafo.agregarArista(2, 17, 84);
        grafo.agregarArista(2, 18, 59);
        grafo.agregarArista(2, 19, 65);
        grafo.agregarArista(2, 20, 88);
        grafo.agregarArista(2, 21, 44);
        grafo.agregarArista(2, 22, 93);
        grafo.agregarArista(2, 23, 29);
        grafo.agregarArista(2, 24, 106);
        grafo.agregarArista(2, 25, 25);
        grafo.agregarArista(2, 26, 132);
        grafo.agregarArista(2, 27, 77);
        grafo.agregarArista(2, 28, 59);
        grafo.agregarArista(2, 29, 107);
        grafo.agregarArista(2, 30, 38);
        grafo.agregarArista(2, 31, 69);
        grafo.agregarArista(2, 32, 69);
        
        grafo.agregarArista(3, 0, 55);
        grafo.agregarArista(3, 1, 59);
        grafo.agregarArista(3, 2, 42);
        grafo.agregarArista(3, 3, 0);
        grafo.agregarArista(3, 4, 92);
        grafo.agregarArista(3, 5, 35);
        grafo.agregarArista(3, 6, 85);
        grafo.agregarArista(3, 7, 39);
        grafo.agregarArista(3, 8, 29);
        grafo.agregarArista(3, 9, 43);
        grafo.agregarArista(3, 10, 80);
        grafo.agregarArista(3, 11, 75);
        grafo.agregarArista(3, 12, 5);
        grafo.agregarArista(3, 13, 9);
        grafo.agregarArista(3, 14, 21);
        grafo.agregarArista(3, 15, 95);
        grafo.agregarArista(3, 16, 146);
        grafo.agregarArista(3, 17, 116);
        grafo.agregarArista(3, 18, 20);
        grafo.agregarArista(3, 19, 106);
        grafo.agregarArista(3, 20, 129);
        grafo.agregarArista(3, 21, 8);
        grafo.agregarArista(3, 22, 113);
        grafo.agregarArista(3, 23, 13);
        grafo.agregarArista(3, 24, 67);
        grafo.agregarArista(3, 25, 24);
        grafo.agregarArista(3, 26, 173);
        grafo.agregarArista(3, 27, 118);
        grafo.agregarArista(3, 28, 20);
        grafo.agregarArista(3, 29, 65);
        grafo.agregarArista(3, 30, 64);
        grafo.agregarArista(3, 31, 89);
        grafo.agregarArista(3, 32, 83);
        
        grafo.agregarArista(4, 0, 58);
        grafo.agregarArista(4, 1, 60);
        grafo.agregarArista(4, 2, 51);
        grafo.agregarArista(4, 3, 92);
        grafo.agregarArista(4, 4, 0);
        grafo.agregarArista(4, 5, 127);
        grafo.agregarArista(4, 6, 19);
        grafo.agregarArista(4, 7, 66);
        grafo.agregarArista(4, 8, 86);
        grafo.agregarArista(4, 9, 71);
        grafo.agregarArista(4, 10, 55);
        grafo.agregarArista(4, 11, 30);
        grafo.agregarArista(4, 12, 98);
        grafo.agregarArista(4, 13, 102);
        grafo.agregarArista(4, 14, 92);
        grafo.agregarArista(4, 15, 49);
        grafo.agregarArista(4, 16, 76);
        grafo.agregarArista(4, 17, 39);
        grafo.agregarArista(4, 18, 94);
        grafo.agregarArista(4, 19, 61);
        grafo.agregarArista(4, 20, 43);
        grafo.agregarArista(4, 21, 95);
        grafo.agregarArista(4, 22, 50);
        grafo.agregarArista(4, 23, 80);
        grafo.agregarArista(4, 24, 38);
        grafo.agregarArista(4, 25, 76);
        grafo.agregarArista(4, 26, 103);
        grafo.agregarArista(4, 27, 72);
        grafo.agregarArista(4, 28, 107);
        grafo.agregarArista(4, 29, 158);
        grafo.agregarArista(4, 30, 44);
        grafo.agregarArista(4, 31, 32);
        grafo.agregarArista(4, 32, 22);
        
        grafo.agregarArista(5, 0, 70);
        grafo.agregarArista(5, 1, 94);
        grafo.agregarArista(5, 2, 76);
        grafo.agregarArista(5, 3, 35);
        grafo.agregarArista(5, 4, 127);
        grafo.agregarArista(5, 5, 0);
        grafo.agregarArista(5, 6, 120);
        grafo.agregarArista(5, 7, 73);
        grafo.agregarArista(5, 8, 63);
        grafo.agregarArista(5, 9, 77);
        grafo.agregarArista(5, 10, 115);
        grafo.agregarArista(5, 11, 110);
        grafo.agregarArista(5, 12, 37);
        grafo.agregarArista(5, 13, 26);
        grafo.agregarArista(5, 14, 56);
        grafo.agregarArista(5, 15, 129);
        grafo.agregarArista(5, 16, 181);
        grafo.agregarArista(5, 17, 151);
        grafo.agregarArista(5, 18, 55);
        grafo.agregarArista(5, 19, 141);
        grafo.agregarArista(5, 20, 164);
        grafo.agregarArista(5, 21, 43);
        grafo.agregarArista(5, 22, 148);
        grafo.agregarArista(5, 23, 48);
        grafo.agregarArista(5, 24, 102);
        grafo.agregarArista(5, 25, 59);
        grafo.agregarArista(5, 26, 202);
        grafo.agregarArista(5, 27, 153);
        grafo.agregarArista(5, 28, 55);
        grafo.agregarArista(5, 29, 30);
        grafo.agregarArista(5, 30, 114);
        grafo.agregarArista(5, 31, 123);
        grafo.agregarArista(5, 32, 118);
       
        grafo.agregarArista(6, 0, 73);
        grafo.agregarArista(6, 1, 75);
        grafo.agregarArista(6, 2, 67);
        grafo.agregarArista(6, 3, 85);
        grafo.agregarArista(6, 4, 19);
        grafo.agregarArista(6, 5, 120);
        grafo.agregarArista(6, 6, 0);
        grafo.agregarArista(6, 7, 47);
        grafo.agregarArista(6, 8, 67);
        grafo.agregarArista(6, 9, 86);
        grafo.agregarArista(6, 10, 36);
        grafo.agregarArista(6, 11, 10);
        grafo.agregarArista(6, 12, 89);
        grafo.agregarArista(6, 13, 93);
        grafo.agregarArista(6, 14, 103);
        grafo.agregarArista(6, 15, 65);
        grafo.agregarArista(6, 16, 70);
        grafo.agregarArista(6, 17, 31);
        grafo.agregarArista(6, 18, 75);
        grafo.agregarArista(6, 19, 76);
        grafo.agregarArista(6, 20, 39);
        grafo.agregarArista(6, 21, 90);
        grafo.agregarArista(6, 22, 42);
        grafo.agregarArista(6, 23, 96);
        grafo.agregarArista(6, 24, 19);
        grafo.agregarArista(6, 25, 107);
        grafo.agregarArista(6, 26, 96);
        grafo.agregarArista(6, 27, 52);
        grafo.agregarArista(6, 28, 88);
        grafo.agregarArista(6, 29, 149);
        grafo.agregarArista(6, 30, 34);
        grafo.agregarArista(6, 31, 24);
        grafo.agregarArista(6, 32, 19);
        
        grafo.agregarArista(7, 0, 71);
        grafo.agregarArista(7, 1, 95);
        grafo.agregarArista(7, 2, 77);
        grafo.agregarArista(7, 3, 39);
        grafo.agregarArista(7, 4, 66);
        grafo.agregarArista(7, 5, 73);
        grafo.agregarArista(7, 6, 47);
        grafo.agregarArista(7, 7, 0);
        grafo.agregarArista(7, 8, 20);
        grafo.agregarArista(7, 9, 78);
        grafo.agregarArista(7, 10, 42);
        grafo.agregarArista(7, 11, 29);
        grafo.agregarArista(7, 12, 43);
        grafo.agregarArista(7, 13, 47);
        grafo.agregarArista(7, 14, 56);
        grafo.agregarArista(7, 15, 130);
        grafo.agregarArista(7, 16, 88);
        grafo.agregarArista(7, 17, 77);
        grafo.agregarArista(7, 18, 28);
        grafo.agregarArista(7, 19, 142);
        grafo.agregarArista(7, 20, 86);
        grafo.agregarArista(7, 21, 44);
        grafo.agregarArista(7, 22, 75);
        grafo.agregarArista(7, 23, 49);
        grafo.agregarArista(7, 24, 29);
        grafo.agregarArista(7, 25, 60);
        grafo.agregarArista(7, 26, 115);
        grafo.agregarArista(7, 27, 94);
        grafo.agregarArista(7, 28, 41);
        grafo.agregarArista(7, 29, 103);
        grafo.agregarArista(7, 30, 81);
        grafo.agregarArista(7, 31, 50);
        grafo.agregarArista(7, 32, 45);
        
        grafo.agregarArista(8, 0, 61);
        grafo.agregarArista(8, 1, 85);
        grafo.agregarArista(8, 2, 67);
        grafo.agregarArista(8, 3, 29);
        grafo.agregarArista(8, 4, 86);
        grafo.agregarArista(8, 5, 63);
        grafo.agregarArista(8, 6, 67);
        grafo.agregarArista(8, 7, 20);
        grafo.agregarArista(8, 8, 0);
        grafo.agregarArista(8, 9, 68);
        grafo.agregarArista(8, 10, 62);
        grafo.agregarArista(8, 11, 57);
        grafo.agregarArista(8, 12, 32);
        grafo.agregarArista(8, 13, 36);
        grafo.agregarArista(8, 14, 46);
        grafo.agregarArista(8, 15, 120);
        grafo.agregarArista(8, 16, 109);
        grafo.agregarArista(8, 17, 98);
        grafo.agregarArista(8, 18, 18);
        grafo.agregarArista(8, 19, 132);
        grafo.agregarArista(8, 20, 106);
        grafo.agregarArista(8, 21, 34);
        grafo.agregarArista(8, 22, 95);
        grafo.agregarArista(8, 23, 39);
        grafo.agregarArista(8, 24, 49);
        grafo.agregarArista(8, 25, 50);
        grafo.agregarArista(8, 26, 135);
        grafo.agregarArista(8, 27, 143);
        grafo.agregarArista(8, 28, 31);
        grafo.agregarArista(8, 29, 92);
        grafo.agregarArista(8, 30, 105);
        grafo.agregarArista(8, 31, 70);
        grafo.agregarArista(8, 32, 65);
        
        grafo.agregarArista(9, 0, 13);
        grafo.agregarArista(9, 1, 40);
        grafo.agregarArista(9, 2, 20);
        grafo.agregarArista(9, 3, 43);
        grafo.agregarArista(9, 4, 71);
        grafo.agregarArista(9, 5, 77);
        grafo.agregarArista(9, 6, 86);
        grafo.agregarArista(9, 7, 78);
        grafo.agregarArista(9, 8, 68);
        grafo.agregarArista(9, 9, 0);
        grafo.agregarArista(9, 10, 120);
        grafo.agregarArista(9, 11, 115);
        grafo.agregarArista(9, 12, 48);
        grafo.agregarArista(9, 13, 52);
        grafo.agregarArista(9, 14, 42);
        grafo.agregarArista(9, 15, 73);
        grafo.agregarArista(9, 16, 125);
        grafo.agregarArista(9, 17, 91);
        grafo.agregarArista(9, 18, 60);
        grafo.agregarArista(9, 19, 85);
        grafo.agregarArista(9, 20, 108);
        grafo.agregarArista(9, 21, 50);
        grafo.agregarArista(9, 22, 113);
        grafo.agregarArista(9, 23, 30);
        grafo.agregarArista(9, 24, 107);
        grafo.agregarArista(9, 25, 25);
        grafo.agregarArista(9, 26, 152);
        grafo.agregarArista(9, 27, 96);
        grafo.agregarArista(9, 28, 60);
        grafo.agregarArista(9, 29, 108);
        grafo.agregarArista(9, 30, 58);
        grafo.agregarArista(9, 31, 88);
        grafo.agregarArista(9, 32, 88);
        
        grafo.agregarArista(10, 0, 112);
        grafo.agregarArista(10, 1, 137);
        grafo.agregarArista(10, 2, 119);
        grafo.agregarArista(10, 3, 80);
        grafo.agregarArista(10, 4, 55);
        grafo.agregarArista(10, 5, 115);
        grafo.agregarArista(10, 6, 36);
        grafo.agregarArista(10, 7, 42);
        grafo.agregarArista(10, 8, 62);
        grafo.agregarArista(10, 9, 120);
        grafo.agregarArista(10, 10, 0);
        grafo.agregarArista(10, 11, 32);
        grafo.agregarArista(10, 12, 84);
        grafo.agregarArista(10, 13, 88);
        grafo.agregarArista(10, 14, 98);
        grafo.agregarArista(10, 15, 101);
        grafo.agregarArista(10, 16, 75);
        grafo.agregarArista(10, 17, 32);
        grafo.agregarArista(10, 18, 70);
        grafo.agregarArista(10, 19, 64);
        grafo.agregarArista(10, 20, 49);
        grafo.agregarArista(10, 21, 85);
        grafo.agregarArista(10, 22, 34);
        grafo.agregarArista(10, 23, 90);
        grafo.agregarArista(10, 24, 31);
        grafo.agregarArista(10, 25, 102);
        grafo.agregarArista(10, 26, 73);
        grafo.agregarArista(10, 27, 53);
        grafo.agregarArista(10, 28, 82);
        grafo.agregarArista(10, 29, 144);
        grafo.agregarArista(10, 30, 70);
        grafo.agregarArista(10, 31, 46);
        grafo.agregarArista(10, 32, 41);
        
        grafo.agregarArista(11, 0, 107);
        grafo.agregarArista(11, 1, 86);
        grafo.agregarArista(11, 2, 77);
        grafo.agregarArista(11, 3, 75);
        grafo.agregarArista(11, 4, 30);
        grafo.agregarArista(11, 5, 110);
        grafo.agregarArista(11, 6, 10);
        grafo.agregarArista(11, 7, 29);
        grafo.agregarArista(11, 8, 57);
        grafo.agregarArista(11, 9, 115);
        grafo.agregarArista(11, 10, 32);
        grafo.agregarArista(11, 11, 0);
        grafo.agregarArista(11, 12, 89);
        grafo.agregarArista(11, 13, 93);
        grafo.agregarArista(11, 14, 65);
        grafo.agregarArista(11, 15, 74);
        grafo.agregarArista(11, 16, 98);
        grafo.agregarArista(11, 17, 59);
        grafo.agregarArista(11, 18, 42);
        grafo.agregarArista(11, 19, 86);
        grafo.agregarArista(11, 20, 68);
        grafo.agregarArista(11, 21, 90);
        grafo.agregarArista(11, 22, 70);
        grafo.agregarArista(11, 23, 95);
        grafo.agregarArista(11, 24, 20);
        grafo.agregarArista(11, 25, 107);
        grafo.agregarArista(11, 26, 125);
        grafo.agregarArista(11, 27, 81);
        grafo.agregarArista(11, 28, 51);
        grafo.agregarArista(11, 29, 149);
        grafo.agregarArista(11, 30, 37);
        grafo.agregarArista(11, 31, 13);
        grafo.agregarArista(11, 32, 8);
       
        grafo.agregarArista(12, 0, 40);
        grafo.agregarArista(12, 1, 65);
        grafo.agregarArista(12, 2, 47);
        grafo.agregarArista(12, 3, 5);
        grafo.agregarArista(12, 4, 98);
        grafo.agregarArista(12, 5, 37);
        grafo.agregarArista(12, 6, 89);
        grafo.agregarArista(12, 7, 43);
        grafo.agregarArista(12, 8, 32);
        grafo.agregarArista(12, 9, 48);
        grafo.agregarArista(12, 10, 84);
        grafo.agregarArista(12, 11, 89);
        grafo.agregarArista(12, 12, 0);
        grafo.agregarArista(12, 13, 11);
        grafo.agregarArista(12, 14, 26);
        grafo.agregarArista(12, 15, 100);
        grafo.agregarArista(12, 16, 152);
        grafo.agregarArista(12, 17, 121);
        grafo.agregarArista(12, 18, 26);
        grafo.agregarArista(12, 19, 112);
        grafo.agregarArista(12, 20, 134);
        grafo.agregarArista(12, 21, 13);
        grafo.agregarArista(12, 22, 119);
        grafo.agregarArista(12, 23, 19);
        grafo.agregarArista(12, 24, 72);
        grafo.agregarArista(12, 25, 30);
        grafo.agregarArista(12, 26, 179);
        grafo.agregarArista(12, 27, 123);
        grafo.agregarArista(12, 28, 26);
        grafo.agregarArista(12, 29, 67);
        grafo.agregarArista(12, 30, 84);
        grafo.agregarArista(12, 31, 94);
        grafo.agregarArista(12, 32, 89);
        
        grafo.agregarArista(13, 0, 44);
        grafo.agregarArista(13, 1, 69);
        grafo.agregarArista(13, 2, 51);
        grafo.agregarArista(13, 3, 9);
        grafo.agregarArista(13, 4, 102);
        grafo.agregarArista(13, 5, 26);
        grafo.agregarArista(13, 6, 93);
        grafo.agregarArista(13, 7, 47);
        grafo.agregarArista(13, 8, 36);
        grafo.agregarArista(13, 9, 52);
        grafo.agregarArista(13, 10, 88);
        grafo.agregarArista(13, 11, 93);
        grafo.agregarArista(13, 12, 11);
        grafo.agregarArista(13, 13, 0);
        grafo.agregarArista(13, 14, 30);
        grafo.agregarArista(13, 15, 104);
        grafo.agregarArista(13, 16, 156);
        grafo.agregarArista(13, 17, 125);
        grafo.agregarArista(13, 18, 30);
        grafo.agregarArista(13, 19, 116);
        grafo.agregarArista(13, 20, 138);
        grafo.agregarArista(13, 21, 17);
        grafo.agregarArista(13, 22, 123);
        grafo.agregarArista(13, 23, 23);
        grafo.agregarArista(13, 24, 76);
        grafo.agregarArista(13, 25, 33);
        grafo.agregarArista(13, 26, 182);
        grafo.agregarArista(13, 27, 127);
        grafo.agregarArista(13, 28, 30);
        grafo.agregarArista(13, 29, 56);
        grafo.agregarArista(13, 30, 88);
        grafo.agregarArista(13, 31, 98);
        grafo.agregarArista(13, 32, 93);
        
        grafo.agregarArista(14, 0, 35);
        grafo.agregarArista(14, 1, 59);
        grafo.agregarArista(14, 2, 41);
        grafo.agregarArista(14, 3, 21);
        grafo.agregarArista(14, 4, 92);
        grafo.agregarArista(14, 5, 56);
        grafo.agregarArista(14, 6, 103);
        grafo.agregarArista(14, 7, 56);
        grafo.agregarArista(14, 8, 46);
        grafo.agregarArista(14, 9, 42);
        grafo.agregarArista(14, 10, 98);
        grafo.agregarArista(14, 11, 65);
        grafo.agregarArista(14, 12, 26);
        grafo.agregarArista(14, 13, 30);
        grafo.agregarArista(14, 14, 0);
        grafo.agregarArista(14, 15, 94);
        grafo.agregarArista(14, 16, 113);
        grafo.agregarArista(14, 17, 112);
        grafo.agregarArista(14, 18, 23);
        grafo.agregarArista(14, 19, 106);
        grafo.agregarArista(14, 20, 129);
        grafo.agregarArista(14, 21, 23);
        grafo.agregarArista(14, 22, 101);
        grafo.agregarArista(14, 23, 13);
        grafo.agregarArista(14, 24, 85);
        grafo.agregarArista(14, 25, 24);
        grafo.agregarArista(14, 26, 140);
        grafo.agregarArista(14, 27, 117);
        grafo.agregarArista(14, 28, 13);
        grafo.agregarArista(14, 29, 86);
        grafo.agregarArista(14, 30, 37);
        grafo.agregarArista(14, 31, 68);
        grafo.agregarArista(14, 32, 101);
        
        grafo.agregarArista(15, 0, 60);
        grafo.agregarArista(15, 1, 62);
        grafo.agregarArista(15, 2, 54);
        grafo.agregarArista(15, 3, 95);
        grafo.agregarArista(15, 4, 49);
        grafo.agregarArista(15, 5, 129);
        grafo.agregarArista(15, 6, 65);
        grafo.agregarArista(15, 7, 130);
        grafo.agregarArista(15, 8, 120);
        grafo.agregarArista(15, 9, 73);
        grafo.agregarArista(15, 10, 101);
        grafo.agregarArista(15, 11, 74);
        grafo.agregarArista(15, 12, 100);
        grafo.agregarArista(15, 13, 104);
        grafo.agregarArista(15, 14, 94);
        grafo.agregarArista(15, 15, 0);
        grafo.agregarArista(15, 16, 52);
        grafo.agregarArista(15, 17, 31);
        grafo.agregarArista(15, 18, 112);
        grafo.agregarArista(15, 19, 12);
        grafo.agregarArista(15, 20, 40);
        grafo.agregarArista(15, 21, 97);
        grafo.agregarArista(15, 22, 40);
        grafo.agregarArista(15, 23, 82);
        grafo.agregarArista(15, 24, 83);
        grafo.agregarArista(15, 25, 78);
        grafo.agregarArista(15, 26, 79);
        grafo.agregarArista(15, 27, 23);
        grafo.agregarArista(15, 28, 112);
        grafo.agregarArista(15, 29, 160);
        grafo.agregarArista(15, 30, 47);
        grafo.agregarArista(15, 31, 77);
        grafo.agregarArista(15, 32, 66);
       
        grafo.agregarArista(16, 0, 112);
        grafo.agregarArista(16, 1, 114);
        grafo.agregarArista(16, 2, 105);
        grafo.agregarArista(16, 3, 146);
        grafo.agregarArista(16, 4, 76);
        grafo.agregarArista(16, 5, 181);
        grafo.agregarArista(16, 6, 70);
        grafo.agregarArista(16, 7, 88);
        grafo.agregarArista(16, 8, 109);
        grafo.agregarArista(16, 9, 125);
        grafo.agregarArista(16, 10, 75);
        grafo.agregarArista(16, 11, 98);
        grafo.agregarArista(16, 12, 152);
        grafo.agregarArista(16, 13, 156);
        grafo.agregarArista(16, 14, 113);
        grafo.agregarArista(16, 15, 52);
        grafo.agregarArista(16, 16, 0);
        grafo.agregarArista(16, 17, 40);
        grafo.agregarArista(16, 18, 116);
        grafo.agregarArista(16, 19, 40);
        grafo.agregarArista(16, 20, 33);
        grafo.agregarArista(16, 21, 153);
        grafo.agregarArista(16, 22, 34);
        grafo.agregarArista(16, 23, 138);
        grafo.agregarArista(16, 24, 77);
        grafo.agregarArista(16, 25, 134);
        grafo.agregarArista(16, 26, 27);
        grafo.agregarArista(16, 27, 28);
        grafo.agregarArista(16, 28, 129);
        grafo.agregarArista(16, 29, 190);
        grafo.agregarArista(16, 30, 103);
        grafo.agregarArista(16, 31, 93);
        grafo.agregarArista(16, 32, 88);
        
        grafo.agregarArista(17, 0, 90);
        grafo.agregarArista(17, 1, 92);
        grafo.agregarArista(17, 2, 84);
        grafo.agregarArista(17, 3, 116);
        grafo.agregarArista(17, 4, 39);
        grafo.agregarArista(17, 5, 151);
        grafo.agregarArista(17, 6, 31);
        grafo.agregarArista(17, 7, 77);
        grafo.agregarArista(17, 8, 98);
        grafo.agregarArista(17, 9, 91);
        grafo.agregarArista(17, 10, 32);
        grafo.agregarArista(17, 11, 59);
        grafo.agregarArista(17, 12, 121);
        grafo.agregarArista(17, 13, 125);
        grafo.agregarArista(17, 14, 112);
        grafo.agregarArista(17, 15, 31);
        grafo.agregarArista(17, 16, 40);
        grafo.agregarArista(17, 17, 0);
        grafo.agregarArista(17, 18, 105);
        grafo.agregarArista(17, 19, 35);
        grafo.agregarArista(17, 20, 11);
        grafo.agregarArista(17, 21, 121);
        grafo.agregarArista(17, 22, 12);
        grafo.agregarArista(17, 23, 99);
        grafo.agregarArista(17, 24, 49);
        grafo.agregarArista(17, 25, 96);
        grafo.agregarArista(17, 26, 67);
        grafo.agregarArista(17, 27, 23);
        grafo.agregarArista(17, 28, 118);
        grafo.agregarArista(17, 29, 180);
        grafo.agregarArista(17, 30, 64);
        grafo.agregarArista(17, 31, 54);
        grafo.agregarArista(17, 32, 49);
        
        grafo.agregarArista(18, 0, 53);
        grafo.agregarArista(18, 1, 77);
        grafo.agregarArista(18, 2, 59);
        grafo.agregarArista(18, 3, 20);
        grafo.agregarArista(18, 4, 94);
        grafo.agregarArista(18, 5, 55);
        grafo.agregarArista(18, 6, 75);
        grafo.agregarArista(18, 7, 28);
        grafo.agregarArista(18, 8, 18);
        grafo.agregarArista(18, 9, 60);
        grafo.agregarArista(18, 10, 70);
        grafo.agregarArista(18, 11, 42);
        grafo.agregarArista(18, 12, 26);
        grafo.agregarArista(18, 13, 30);
        grafo.agregarArista(18, 14, 23);
        grafo.agregarArista(18, 15, 112);
        grafo.agregarArista(18, 16, 116);
        grafo.agregarArista(18, 17, 105);
        grafo.agregarArista(18, 18, 0);
        grafo.agregarArista(18, 19, 124);
        grafo.agregarArista(18, 20, 114);
        grafo.agregarArista(18, 21, 24);
        grafo.agregarArista(18, 22, 103);
        grafo.agregarArista(18, 23, 31);
        grafo.agregarArista(18, 24, 57);
        grafo.agregarArista(18, 25, 42);
        grafo.agregarArista(18, 26, 125);
        grafo.agregarArista(18, 27, 135);
        grafo.agregarArista(18, 28, 10);
        grafo.agregarArista(18, 29, 84);
        grafo.agregarArista(18, 30, 60);
        grafo.agregarArista(18, 31, 58);
        grafo.agregarArista(18, 32, 47);
        
        grafo.agregarArista(19, 0, 72);
        grafo.agregarArista(19, 1, 74);
        grafo.agregarArista(19, 2, 65);
        grafo.agregarArista(19, 3, 106);
        grafo.agregarArista(19, 4, 61);
        grafo.agregarArista(19, 5, 141);
        grafo.agregarArista(19, 6, 76);
        grafo.agregarArista(19, 7, 142);
        grafo.agregarArista(19, 8, 132);
        grafo.agregarArista(19, 9, 85);
        grafo.agregarArista(19, 10, 64);
        grafo.agregarArista(19, 11, 86);
        grafo.agregarArista(19, 12, 112);
        grafo.agregarArista(19, 13, 116);
        grafo.agregarArista(19, 14, 106);
        grafo.agregarArista(19, 15, 12);
        grafo.agregarArista(19, 16, 40);
        grafo.agregarArista(19, 17, 35);
        grafo.agregarArista(19, 18, 124);
        grafo.agregarArista(19, 19, 0);
        grafo.agregarArista(19, 20, 28);
        grafo.agregarArista(19, 21, 113);
        grafo.agregarArista(19, 22, 28);
        grafo.agregarArista(19, 23, 98);
        grafo.agregarArista(19, 24, 83);
        grafo.agregarArista(19, 25, 95);
        grafo.agregarArista(19, 26, 97);
        grafo.agregarArista(19, 27, 12);
        grafo.agregarArista(19, 28, 129);
        grafo.agregarArista(19, 29, 176);
        grafo.agregarArista(19, 30, 63);
        grafo.agregarArista(19, 31, 93);
        grafo.agregarArista(19, 32, 83);

        grafo.agregarArista(20, 0, 94);
        grafo.agregarArista(20, 1, 96);
        grafo.agregarArista(20, 2, 88);
        grafo.agregarArista(20, 3, 129);
        grafo.agregarArista(20, 4, 43);
        grafo.agregarArista(20, 5, 164);
        grafo.agregarArista(20, 6, 39);
        grafo.agregarArista(20, 7, 86);
        grafo.agregarArista(20, 8, 106);
        grafo.agregarArista(20, 9, 108);
        grafo.agregarArista(20, 10, 49);
        grafo.agregarArista(20, 11, 68);
        grafo.agregarArista(20, 12, 134);
        grafo.agregarArista(20, 13, 138);
        grafo.agregarArista(20, 14, 129);
        grafo.agregarArista(20, 15, 40);
        grafo.agregarArista(20, 16, 3);
        grafo.agregarArista(20, 17, 11);
        grafo.agregarArista(20, 18, 114);
        grafo.agregarArista(20, 19, 28);
        grafo.agregarArista(20, 20, 0);
        grafo.agregarArista(20, 21, 131);
        grafo.agregarArista(20, 22, 15);
        grafo.agregarArista(20, 23, 116);
        grafo.agregarArista(20, 24, 58);
        grafo.agregarArista(20, 25, 113);
        grafo.agregarArista(20, 26, 60);
        grafo.agregarArista(20, 27, 16);
        grafo.agregarArista(20, 28, 127);
        grafo.agregarArista(20, 29, 194);
        grafo.agregarArista(20, 30, 81);
        grafo.agregarArista(20, 31, 63);
        grafo.agregarArista(20, 32, 57);
        
        grafo.agregarArista(21, 0, 37);
        grafo.agregarArista(21, 1, 61);
        grafo.agregarArista(21, 2, 44);
        grafo.agregarArista(21, 3, 8);
        grafo.agregarArista(21, 4, 95);
        grafo.agregarArista(21, 5, 43);
        grafo.agregarArista(21, 6, 90);
        grafo.agregarArista(21, 7, 44);
        grafo.agregarArista(21, 8, 34);
        grafo.agregarArista(21, 9, 50);
        grafo.agregarArista(21, 10, 85);
        grafo.agregarArista(21, 11, 90);
        grafo.agregarArista(21, 12, 13);
        grafo.agregarArista(21, 13, 17);
        grafo.agregarArista(21, 14, 23);
        grafo.agregarArista(21, 15, 97);
        grafo.agregarArista(21, 16, 153);
        grafo.agregarArista(21, 17, 121);
        grafo.agregarArista(21, 18, 24);
        grafo.agregarArista(21, 19, 113);
        grafo.agregarArista(21, 20, 131);
        grafo.agregarArista(21, 21, 0);
        grafo.agregarArista(21, 22, 118);
        grafo.agregarArista(21, 23, 15);
        grafo.agregarArista(21, 24, 72);
        grafo.agregarArista(21, 25, 26);
        grafo.agregarArista(21, 26, 175);
        grafo.agregarArista(21, 27, 120);
        grafo.agregarArista(21, 28, 26);
        grafo.agregarArista(21, 29, 73);
        grafo.agregarArista(21, 30, 81);
        grafo.agregarArista(21, 31, 93);
        grafo.agregarArista(21, 32, 88);
       
        grafo.agregarArista(22, 0, 100);
        grafo.agregarArista(22, 1, 102);
        grafo.agregarArista(22, 2, 93);
        grafo.agregarArista(22, 3, 113);
        grafo.agregarArista(22, 4, 50);
        grafo.agregarArista(22, 5, 148);
        grafo.agregarArista(22, 6, 42);
        grafo.agregarArista(22, 7, 75);
        grafo.agregarArista(22, 8, 95);
        grafo.agregarArista(22, 9, 113);
        grafo.agregarArista(22, 10, 34);
        grafo.agregarArista(22, 11, 70);
        grafo.agregarArista(22, 12, 119);
        grafo.agregarArista(22, 13, 123);
        grafo.agregarArista(22, 14, 101);
        grafo.agregarArista(22, 15, 40);
        grafo.agregarArista(22, 16, 34);
        grafo.agregarArista(22, 17, 12);
        grafo.agregarArista(22, 18, 103);
        grafo.agregarArista(22, 19, 28);
        grafo.agregarArista(22, 20, 15);
        grafo.agregarArista(22, 21, 118);
        grafo.agregarArista(22, 22, 0);
        grafo.agregarArista(22, 23, 126);
        grafo.agregarArista(22, 24, 60);
        grafo.agregarArista(22, 25, 122);
        grafo.agregarArista(22, 26, 60);
        grafo.agregarArista(22, 27, 17);
        grafo.agregarArista(22, 28, 116);
        grafo.agregarArista(22, 29, 177);
        grafo.agregarArista(22, 30, 91);
        grafo.agregarArista(22, 31, 65);
        grafo.agregarArista(22, 32, 60);
        
        grafo.agregarArista(23, 0, 22);
        grafo.agregarArista(23, 1, 47);
        grafo.agregarArista(23, 2, 29);
        grafo.agregarArista(23, 3, 13);
        grafo.agregarArista(23, 4, 80);
        grafo.agregarArista(23, 5, 48);
        grafo.agregarArista(23, 6, 96);
        grafo.agregarArista(23, 7, 49);
        grafo.agregarArista(23, 8, 39);
        grafo.agregarArista(23, 9, 30);
        grafo.agregarArista(23, 10, 90);
        grafo.agregarArista(23, 11, 95);
        grafo.agregarArista(23, 12, 19);
        grafo.agregarArista(23, 13, 23);
        grafo.agregarArista(23, 14, 13);
        grafo.agregarArista(23, 15, 82);
        grafo.agregarArista(23, 16, 138);
        grafo.agregarArista(23, 17, 99);
        grafo.agregarArista(23, 18, 31);
        grafo.agregarArista(23, 19, 98);
        grafo.agregarArista(23, 20, 116);
        grafo.agregarArista(23, 21, 15);
        grafo.agregarArista(23, 22, 126);
        grafo.agregarArista(23, 23, 0);
        grafo.agregarArista(23, 24, 78);
        grafo.agregarArista(23, 25, 12);
        grafo.agregarArista(23, 26, 160);
        grafo.agregarArista(23, 27, 105);
        grafo.agregarArista(23, 28, 31);
        grafo.agregarArista(23, 29, 78);
        grafo.agregarArista(23, 30, 66);
        grafo.agregarArista(23, 31, 97);
        grafo.agregarArista(23, 32, 94);
        
        grafo.agregarArista(24, 0, 99);
        grafo.agregarArista(24, 1, 124);
        grafo.agregarArista(24, 2, 106);
        grafo.agregarArista(24, 3, 67);
        grafo.agregarArista(24, 4, 38);
        grafo.agregarArista(24, 5, 102);
        grafo.agregarArista(24, 6, 19);
        grafo.agregarArista(24, 7, 29);
        grafo.agregarArista(24, 8, 49);
        grafo.agregarArista(24, 9, 107);
        grafo.agregarArista(24, 10, 31);
        grafo.agregarArista(24, 11, 20);
        grafo.agregarArista(24, 12, 72);
        grafo.agregarArista(24, 13, 76);
        grafo.agregarArista(24, 14, 85);
        grafo.agregarArista(24, 15, 83);
        grafo.agregarArista(24, 16, 77);
        grafo.agregarArista(24, 17, 49);
        grafo.agregarArista(24, 18, 57);
        grafo.agregarArista(24, 19, 83);
        grafo.agregarArista(24, 20, 58);
        grafo.agregarArista(24, 21, 72);
        grafo.agregarArista(24, 22, 60);
        grafo.agregarArista(24, 23, 78);
        grafo.agregarArista(24, 24, 0);
        grafo.agregarArista(24, 25, 87);
        grafo.agregarArista(24, 26, 104);
        grafo.agregarArista(24, 27, 71);
        grafo.agregarArista(24, 28, 69);
        grafo.agregarArista(24, 29, 131);
        grafo.agregarArista(24, 30, 53);
        grafo.agregarArista(24, 31, 22);
        grafo.agregarArista(24, 32, 17);
        
        grafo.agregarArista(25, 0, 19);
        grafo.agregarArista(25, 1, 43);
        grafo.agregarArista(25, 2, 25);
        grafo.agregarArista(25, 3, 24);
        grafo.agregarArista(25, 4, 76);
        grafo.agregarArista(25, 5, 59);
        grafo.agregarArista(25, 6, 107);
        grafo.agregarArista(25, 7, 60);
        grafo.agregarArista(25, 8, 50);
        grafo.agregarArista(25, 9, 25);
        grafo.agregarArista(25, 10, 102);
        grafo.agregarArista(25, 11, 107);
        grafo.agregarArista(25, 12, 30);
        grafo.agregarArista(25, 13, 33);
        grafo.agregarArista(25, 14, 24);
        grafo.agregarArista(25, 15, 78);
        grafo.agregarArista(25, 16, 134);
        grafo.agregarArista(25, 17, 96);
        grafo.agregarArista(25, 18, 42);
        grafo.agregarArista(25, 19, 95);
        grafo.agregarArista(25, 20, 113);
        grafo.agregarArista(25, 21, 26);
        grafo.agregarArista(25, 22, 122);
        grafo.agregarArista(25, 23, 12);
        grafo.agregarArista(25, 24, 87);
        grafo.agregarArista(25, 25, 0);
        grafo.agregarArista(25, 26, 157);
        grafo.agregarArista(25, 27, 101);
        grafo.agregarArista(25, 28, 42);
        grafo.agregarArista(25, 29, 89);
        grafo.agregarArista(25, 30, 63);
        grafo.agregarArista(25, 31, 93);
        grafo.agregarArista(25, 32, 105);
       
        grafo.agregarArista(26, 0, 139);
        grafo.agregarArista(26, 1, 141);
        grafo.agregarArista(26, 2, 132);
        grafo.agregarArista(26, 3, 173);
        grafo.agregarArista(26, 4, 103);
        grafo.agregarArista(26, 5, 202);
        grafo.agregarArista(26, 6, 96);
        grafo.agregarArista(26, 7, 115);
        grafo.agregarArista(26, 8, 135);
        grafo.agregarArista(26, 9, 152);
        grafo.agregarArista(26, 10, 73);
        grafo.agregarArista(26, 11, 125);
        grafo.agregarArista(26, 12, 179);
        grafo.agregarArista(26, 13, 182);
        grafo.agregarArista(26, 14, 140);
        grafo.agregarArista(26, 15, 79);
        grafo.agregarArista(26, 16, 27);
        grafo.agregarArista(26, 17, 67);
        grafo.agregarArista(26, 18, 125);
        grafo.agregarArista(26, 19, 97);
        grafo.agregarArista(26, 20, 60);
        grafo.agregarArista(26, 21, 175);
        grafo.agregarArista(26, 22, 60);
        grafo.agregarArista(26, 23, 160);
        grafo.agregarArista(26, 24, 104);
        grafo.agregarArista(26, 25, 157);
        grafo.agregarArista(26, 26, 0);
        grafo.agregarArista(26, 27, 55);
        grafo.agregarArista(26, 28, 156);
        grafo.agregarArista(26, 29, 217);
        grafo.agregarArista(26, 30, 130);
        grafo.agregarArista(26, 31, 120);
        grafo.agregarArista(26, 32, 115);
        
        grafo.agregarArista(27, 0, 83);
        grafo.agregarArista(27, 1, 85);
        grafo.agregarArista(27, 2, 77);
        grafo.agregarArista(27, 3, 118);
        grafo.agregarArista(27, 4, 72);
        grafo.agregarArista(27, 5, 153);
        grafo.agregarArista(27, 6, 52);
        grafo.agregarArista(27, 7, 94);
        grafo.agregarArista(27, 8, 143);
        grafo.agregarArista(27, 9, 96);
        grafo.agregarArista(27, 10, 53);
        grafo.agregarArista(27, 11, 81);
        grafo.agregarArista(27, 12, 123);
        grafo.agregarArista(27, 13, 127);
        grafo.agregarArista(27, 14, 117);
        grafo.agregarArista(27, 15, 23);
        grafo.agregarArista(27, 16, 28);
        grafo.agregarArista(27, 17, 23);
        grafo.agregarArista(27, 18, 135);
        grafo.agregarArista(27, 19, 12);
        grafo.agregarArista(27, 20, 16);
        grafo.agregarArista(27, 21, 120);
        grafo.agregarArista(27, 22, 17);
        grafo.agregarArista(27, 23, 105);
        grafo.agregarArista(27, 24, 71);
        grafo.agregarArista(27, 25, 105);
        grafo.agregarArista(27, 26, 55);
        grafo.agregarArista(27, 27, 0);
        grafo.agregarArista(27, 28, 140);
        grafo.agregarArista(27, 29, 187);
        grafo.agregarArista(27, 30, 74);
        grafo.agregarArista(27, 31, 104);
        grafo.agregarArista(27, 32, 71);
        
        grafo.agregarArista(28, 0, 53);
        grafo.agregarArista(28, 1, 77);
        grafo.agregarArista(28, 2, 59);
        grafo.agregarArista(28, 3, 20);
        grafo.agregarArista(28, 4, 107);
        grafo.agregarArista(28, 5, 55);
        grafo.agregarArista(28, 6, 88);
        grafo.agregarArista(28, 7, 41);
        grafo.agregarArista(28, 8, 31);
        grafo.agregarArista(28, 9, 60);
        grafo.agregarArista(28, 10, 82);
        grafo.agregarArista(28, 11, 51);
        grafo.agregarArista(28, 12, 26);
        grafo.agregarArista(28, 13, 30);
        grafo.agregarArista(28, 14, 13);
        grafo.agregarArista(28, 15, 112);
        grafo.agregarArista(28, 16, 129);
        grafo.agregarArista(28, 17, 118);
        grafo.agregarArista(28, 18, 10);
        grafo.agregarArista(28, 19, 129);
        grafo.agregarArista(28, 20, 127);
        grafo.agregarArista(28, 21, 26);
        grafo.agregarArista(28, 22, 116);
        grafo.agregarArista(28, 23, 31);
        grafo.agregarArista(28, 24, 69);
        grafo.agregarArista(28, 25, 42);
        grafo.agregarArista(28, 26, 156);
        grafo.agregarArista(28, 27, 140);
        grafo.agregarArista(28, 28, 0);
        grafo.agregarArista(28, 29, 84);
        grafo.agregarArista(28, 30, 50);
        grafo.agregarArista(28, 31, 67);
        grafo.agregarArista(28, 32, 86);
        
        grafo.agregarArista(29, 0, 100);
        grafo.agregarArista(29, 1, 124);
        grafo.agregarArista(29, 2, 107);
        grafo.agregarArista(29, 3, 65);
        grafo.agregarArista(29, 4, 158);
        grafo.agregarArista(29, 5, 30);
        grafo.agregarArista(29, 6, 149);
        grafo.agregarArista(29, 7, 103);
        grafo.agregarArista(29, 8, 92);
        grafo.agregarArista(29, 9, 108);
        grafo.agregarArista(29, 10, 144);
        grafo.agregarArista(29, 11, 149);
        grafo.agregarArista(29, 12, 67);
        grafo.agregarArista(29, 13, 56);
        grafo.agregarArista(29, 14, 86);
        grafo.agregarArista(29, 15, 160);
        grafo.agregarArista(29, 16, 190);
        grafo.agregarArista(29, 17, 180);
        grafo.agregarArista(29, 18, 84);
        grafo.agregarArista(29, 19, 176);
        grafo.agregarArista(29, 20, 194);
        grafo.agregarArista(29, 21, 73);
        grafo.agregarArista(29, 22, 177);
        grafo.agregarArista(29, 23, 78);
        grafo.agregarArista(29, 24, 131);
        grafo.agregarArista(29, 25, 89);
        grafo.agregarArista(29, 26, 217);
        grafo.agregarArista(29, 27, 187);
        grafo.agregarArista(29, 28, 84);
        grafo.agregarArista(29, 29, 0);
        grafo.agregarArista(29, 30, 144);
        grafo.agregarArista(29, 31, 154);
        grafo.agregarArista(29, 32, 149);
        
        grafo.agregarArista(30, 0, 45);
        grafo.agregarArista(30, 1, 47);
        grafo.agregarArista(30, 2, 38);
        grafo.agregarArista(30, 3, 64);
        grafo.agregarArista(30, 4, 44);
        grafo.agregarArista(30, 5, 114);
        grafo.agregarArista(30, 6, 34);
        grafo.agregarArista(30, 7, 81);
        grafo.agregarArista(30, 8, 105);
        grafo.agregarArista(30, 9, 58);
        grafo.agregarArista(30, 10, 70);
        grafo.agregarArista(30, 11, 37);
        grafo.agregarArista(30, 12, 84);
        grafo.agregarArista(30, 13, 88);
        grafo.agregarArista(30, 14, 37);
        grafo.agregarArista(30, 15, 47);
        grafo.agregarArista(30, 16, 103);
        grafo.agregarArista(30, 17, 64);
        grafo.agregarArista(30, 18, 60);
        grafo.agregarArista(30, 19, 63);
        grafo.agregarArista(30, 20, 81);
        grafo.agregarArista(30, 21, 81);
        grafo.agregarArista(30, 22, 91);
        grafo.agregarArista(30, 23, 66);
        grafo.agregarArista(30, 24, 53);
        grafo.agregarArista(30, 25, 63);
        grafo.agregarArista(30, 26, 130);
        grafo.agregarArista(30, 27, 74);
        grafo.agregarArista(30, 28, 50);
        grafo.agregarArista(30, 29, 144);
        grafo.agregarArista(30, 30, 0);
        grafo.agregarArista(30, 31, 31);
        grafo.agregarArista(30, 32, 29);
        
        grafo.agregarArista(31, 0, 75);
        grafo.agregarArista(31, 1, 77);
        grafo.agregarArista(31, 2, 69);
        grafo.agregarArista(31, 3, 89);
        grafo.agregarArista(31, 4, 33);
        grafo.agregarArista(31, 5, 123);
        grafo.agregarArista(31, 6, 24);
        grafo.agregarArista(31, 7, 50);
        grafo.agregarArista(31, 8, 70);
        grafo.agregarArista(31, 9, 88);
        grafo.agregarArista(31, 10, 46);
        grafo.agregarArista(31, 11, 13);
        grafo.agregarArista(31, 12, 94);
        grafo.agregarArista(31, 13, 98);
        grafo.agregarArista(31, 14, 68);
        grafo.agregarArista(31, 15, 77);
        grafo.agregarArista(31, 16, 93);
        grafo.agregarArista(31, 17, 54);
        grafo.agregarArista(31, 18, 58);
        grafo.agregarArista(31, 19, 93);
        grafo.agregarArista(31, 20, 63);
        grafo.agregarArista(31, 21, 93);
        grafo.agregarArista(31, 22, 65);
        grafo.agregarArista(31, 23, 97);
        grafo.agregarArista(31, 24, 22);
        grafo.agregarArista(31, 25, 93);
        grafo.agregarArista(31, 26, 120);
        grafo.agregarArista(31, 27, 104);
        grafo.agregarArista(31, 28, 67);
        grafo.agregarArista(31, 29, 154);
        grafo.agregarArista(31, 30, 31);
        grafo.agregarArista(31, 31, 0);
        grafo.agregarArista(31, 32, 9);
       
        grafo.agregarArista(32, 0, 75);
        grafo.agregarArista(32, 1, 77);
        grafo.agregarArista(32, 2, 69);
        grafo.agregarArista(32, 3, 83);
        grafo.agregarArista(32, 4, 22);
        grafo.agregarArista(32, 5, 118);
        grafo.agregarArista(32, 6, 19);
        grafo.agregarArista(32, 7, 45);
        grafo.agregarArista(32, 8, 65);
        grafo.agregarArista(32, 9, 88);
        grafo.agregarArista(32, 10, 41);
        grafo.agregarArista(32, 11, 8);
        grafo.agregarArista(32, 12, 89);
        grafo.agregarArista(32, 13, 93);
        grafo.agregarArista(32, 14, 101);
        grafo.agregarArista(32, 15, 66);
        grafo.agregarArista(32, 16, 88);
        grafo.agregarArista(32, 17, 49);
        grafo.agregarArista(32, 18, 47);
        grafo.agregarArista(32, 19, 83);
        grafo.agregarArista(32, 20, 57);
        grafo.agregarArista(32, 21, 88);
        grafo.agregarArista(32, 22, 60);
        grafo.agregarArista(32, 23, 94);
        grafo.agregarArista(32, 24, 17);
        grafo.agregarArista(32, 25, 105);
        grafo.agregarArista(32, 26, 115);
        grafo.agregarArista(32, 27, 71);
        grafo.agregarArista(32, 28, 86);
        grafo.agregarArista(32, 29, 149);
        grafo.agregarArista(32, 30, 29);
        grafo.agregarArista(32, 31, 9);
        grafo.agregarArista(32, 32, 0); 

        // Obtener los municipios de origen y destino desde el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el municipio de origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el municipio de destino: ");
        String destino = scanner.nextLine();

        // Buscar los nodos correspondientes a los municipios de origen y destino
        int nodoOrigen = -1;
        int nodoDestino = -1;
        for (int i = 0; i < numNodos; i++) {
            String nombreMunicipio = grafo.obtenerNombreMunicipio(i);
            if (nombreMunicipio.equalsIgnoreCase(origen)) {
                nodoOrigen = i;
            } else if (nombreMunicipio.equalsIgnoreCase(destino)) {
                nodoDestino = i;
            }
        }

        // Verificar si se encontraron los nodos de origen y destino
        if (nodoOrigen == -1 || nodoDestino == -1) {
            System.out.println("No se encontraron los municipios especificados.");
            return;
        }

        // Obtener la ruta más corta utilizando el algoritmo de Dijkstra
        List<Integer> ruta = dijkstra(grafo, nodoOrigen, nodoDestino);

        // Imprimir la ruta más corta y la distancia total en kilómetros
        System.out.println("Ruta más corta desde " + origen + " hasta " + destino + ":");
        int distanciaTotal = 0;
        for (int i = 0; i < ruta.size() - 1; i++) {
            int nodoActual = ruta.get(i);
            int nodoSiguiente = ruta.get(i + 1);
            String municipioActual = grafo.obtenerNombreMunicipio(nodoActual);
            String municipioSiguiente = grafo.obtenerNombreMunicipio(nodoSiguiente);
            double distanciaArista = obtenerDistanciaArista(grafo, nodoActual, nodoSiguiente);
            distanciaTotal += distanciaArista;
            System.out.println("- " + municipioActual + " a " + municipioSiguiente + ": " + distanciaArista + " km");
        }
        System.out.println("Distancia total: " + distanciaTotal + " km");
    }

    public static List<Integer> dijkstra(GrafoHuehuetenango grafo, int origen, int destino) {
        int numNodos = grafo.obtenerNumNodos();

        int[] distancias = new int[numNodos];
        boolean[] visitados = new boolean[numNodos];
        int[] padres = new int[numNodos];

        for (int i = 0; i < numNodos; i++) {
            distancias[i] = Integer.MAX_VALUE;
            visitados[i] = false;
            padres[i] = -1;
        }

        distancias[origen] = 0;

        for (int i = 0; i < numNodos - 1; i++) {
            int nodoActual = obtenerNodoConDistanciaMinima(distancias, visitados);
            visitados[nodoActual] = true;

            List<Arista> adyacentes = grafo.obtenerAdyacentes(nodoActual);
            for (Arista arista : adyacentes) {
                int nodoDestino = arista.destino;
                double distanciaArista = arista.distanciaKm;

                if (!visitados[nodoDestino] && distancias[nodoActual] != Integer.MAX_VALUE
                        && distancias[nodoActual] + distanciaArista < distancias[nodoDestino]) {
                    distancias[nodoDestino] = distancias[nodoActual] + (int) distanciaArista;
                    padres[nodoDestino] = nodoActual;
                }
            }
        }

        List<Integer> ruta = new ArrayList<>();
        int nodoActual = destino;
        while (nodoActual != -1) {
            ruta.add(0, nodoActual);
            nodoActual = padres[nodoActual];
        }

        return ruta;
    }

    public static int obtenerNodoConDistanciaMinima(int[] distancias, boolean[] visitados) {
        int minDistancia = Integer.MAX_VALUE;
        int minNodo = -1;

        for (int i = 0; i < distancias.length; i++) {
            if (!visitados[i] && distancias[i] < minDistancia) {
                minDistancia = distancias[i];
                minNodo = i;
            }
        }

        return minNodo;
    }

    public static double obtenerDistanciaArista(GrafoHuehuetenango grafo, int origen, int destino) {
        List<Arista> adyacentes = grafo.obtenerAdyacentes(origen);
        for (Arista arista : adyacentes) {
            if (arista.destino == destino) {
                return arista.distanciaKm;
            }
        }
        return 0.0;
    }
}

class Arista {
    public int destino;
    public double distanciaKm;

    public Arista(int destino, double distanciaKm) {
        this.destino = destino;
        this.distanciaKm = distanciaKm;
    }
}
