/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectof23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Emily Barrientos
 */
public class GrafoHuehuetenango2 {
    public static void main(String[] args) {
        String[] municipios = {"Huehuetenango", "Aguacatán", "Chiantla", "Colotenango", "Concepcion Huista", "Cuilco", "Jacaltenango","La Democracia",
            "La Libertad","Malacatancito", "Nentón", "San Anotinio Huista", "San Gaspar Ixchil", "San Ildefonso Ixtahiacán", "San Juan Atitlán", "San Juan Ixcoy",
            "San Mateo Ixtatán", "San Miguel Acatán", "San Pedro Nécta", "San Pedro Soloma", "San Rafael La Independencia","San Rafael Pétzal", 
            "San Sebastián Coatán", "San Sebastián Huehuetenango", "Santa Ana Huista", "Santa Bárbara", "Santa Cruz Barillas", "Santa Eulalia", 
            "Santiago Chimaltenango", "Tectitán", "Todos Santos Cuchumatán", "Unión Cantinil", "Santiago Petatán"};

        int[][] distancias = {
            {0,24, 7, 55, 58, 70, 73, 71, 61, 13, 112, 107, 40, 44, 35, 60, 112, 90, 53, 72, 94, 37, 100, 22, 99, 19, 139, 83, 53, 100, 45, 75, 75},
            {24, 0, 23, 59, 60, 94, 75,	95, 85, 40, 137, 86, 65, 69, 59, 62, 114, 92, 77, 74, 96, 61, 102, 47, 124, 43, 141, 85, 77, 124, 47, 77, 77},
            {7, 23, 0, 42, 51, 76, 67, 77, 67, 20, 119, 77, 47, 51, 41, 54, 105, 84, 59, 65, 88, 44, 93, 29, 106, 25, 132, 77, 59, 107, 38, 69, 69},
            {55, 59, 42, 0, 92, 35, 85, 39, 29, 43, 80, 75, 5, 9, 21, 95, 146, 116, 20, 106, 129, 8, 113, 13, 67, 24, 173, 118, 20, 65, 64, 89, 83},
            {58, 60, 51, 92, 0, 127, 19, 66, 86, 71, 55, 30, 98, 102, 92, 49, 76, 39, 94, 61, 43, 95, 50, 80, 38, 76, 103, 72, 107, 158, 44, 33, 22},
            {70, 94, 76, 35, 127, 0, 120, 73, 63, 77, 115, 110, 37, 26, 56, 129, 81, 151, 55, 141, 164, 43, 148, 48, 102, 59, 202, 153, 55, 30, 114, 123, 118},
            {73, 75, 67, 85, 19, 120, 0, 47, 67, 86, 36, 10, 89, 93, 103, 65, 70, 31, 75, 76, 39, 90, 42, 96, 19, 107, 96, 52, 88, 149, 34, 24, 19},
            {71, 95, 77, 39, 66, 73, 47, 0, 20, 78, 42, 29, 43, 47, 56, 130, 88, 77, 28, 142, 86, 44, 75, 49, 29, 60, 115, 94, 41, 103, 81, 50, 45},
            {61, 85, 67, 29, 86, 63, 67, 20, 0, 68, 62, 57, 32, 36, 46, 120, 109, 98, 18, 132, 106, 34, 95, 39, 49, 50, 135, 143, 31, 92, 105, 70, 65},
            {13, 40, 20, 43, 71, 77, 86, 78, 68, 0, 120, 115, 48, 52, 42, 73, 125, 91, 60, 85, 108, 50, 113, 30, 107, 25, 152, 96, 60, 108, 58, 88, 88},
            {112, 137, 119, 80, 55, 115, 36, 42, 62, 120, 0, 32, 84, 88, 98, 101, 75, 32, 70, 64, 49, 85, 34, 90, 31, 102, 73, 53, 82, 144, 70, 46, 41},
            {107, 86, 77, 75, 30, 110, 10, 29, 57, 115, 32, 0, 89, 93, 65, 74, 98, 59, 42, 86, 68, 90, 70, 95, 20, 107, 125, 81, 51, 149, 37, 13, 8},
            {40, 65, 47, 5, 98, 37, 89, 43, 32, 48, 84, 89, 0,  1, 26, 100, 152, 121, 26, 112, 134, 13, 119, 19, 72, 30, 179, 123, 26, 67, 84, 94, 89},
            {44, 69, 51, 9, 102, 26, 93, 47, 36, 52, 88, 93, 11, 0, 30, 104, 156, 125, 30, 116, 138, 17, 123, 23, 76, 33, 182, 127, 30, 56, 88, 98, 93},
            {35, 59, 41, 21, 92, 56, 103, 56, 46, 42, 98, 65, 26, 30, 0, 94, 113, 112, 23, 106, 129, 23, 101, 13, 85, 24, 140, 117, 13, 86, 37, 68, 101},
            {60, 62, 54, 95, 49, 129, 65, 130, 120, 73, 101, 74, 100, 104, 94, 0, 52, 31, 112, 12, 40, 97, 40, 82, 83, 78, 79, 23, 112, 160, 47, 77, 66},
            {112, 114, 105, 146, 76, 181, 70, 88, 109, 125, 75, 98, 152, 156, 113, 52, 0, 40, 116, 40, 3, 153, 34, 138, 77, 134, 27, 28, 129, 190, 103, 93, 88},
            {90, 92, 84, 116, 39, 151, 31, 77, 98, 91, 32, 59, 121, 125, 112, 31, 40, 0, 105, 35, 11, 121, 12, 99, 49, 96, 67, 23, 118, 180, 64, 54, 49},
            {53, 77, 59, 20, 94, 55, 75, 28, 18, 60, 70, 42, 26, 30, 23, 112, 116, 105, 0, 124, 114, 24, 103, 31, 57, 42, 125, 135, 10, 84, 60, 58, 47},
            {72, 74, 65, 106, 61, 141, 76, 142, 132, 85, 64 , 86, 112, 116, 106, 12, 40, 35, 124, 0, 28, 113, 28, 98, 83, 95, 97, 12, 129, 176, 63, 93, 83},
            {94, 96, 88, 129, 43, 164, 39, 86, 106, 108, 49, 68, 134, 138, 129, 40, 33, 11, 114, 28, 0, 131, 15, 116, 58, 113, 60, 16, 127, 194, 81, 63, 57},
            {37, 61, 44, 8, 95, 43, 90, 44, 34, 50, 85, 90, 13, 17, 23, 97, 153, 121, 24, 113, 131, 0, 118, 15, 72, 26, 175, 120, 26, 73, 81, 93, 88},
            {100, 102, 93, 113, 50, 148, 42, 75, 95, 113, 34, 70, 119, 123, 101, 40, 34, 12, 103, 28, 15, 118, 0, 126, 60, 122, 60, 17, 116, 177, 91, 65, 60},
            {22, 47, 29, 13, 80, 48, 96, 49, 39, 30, 90, 95, 19, 23, 13, 82, 138, 99, 31, 98, 116, 15, 126, 0, 78, 12, 160, 105, 31, 78, 66, 97, 94},
            {99, 124, 106,  7, 38, 102, 19, 29, 49, 107, 31, 20, 72, 76, 85, 83, 77, 49, 57, 83, 58, 72, 60, 78, 0, 87, 104, 71, 69, 131, 53, 22, 17},
            {19, 43, 25, 24, 76, 59, 107, 60, 50, 25, 102, 107, 30, 33, 24, 78, 134, 96, 42, 95, 113, 26, 122, 12, 87, 0, 157, 101, 42, 89, 63, 93, 105},
            {139, 141, 132, 173, 103, 202, 96, 115, 135, 152, 73, 125, 179, 182, 140, 79, 27, 67, 125, 97, 60, 175, 60, 160, 104, 157, 0, 55, 156, 217, 130, 120, 115},
            {83, 85, 77, 118, 72, 153, 52, 94, 143, 96, 53, 81, 123, 127, 117, 23, 28, 23, 135, 12, 16, 120, 17, 105, 71, 101, 55, 0, 140, 187, 74, 104, 71},
            {53, 77, 59, 20, 107, 55, 88, 41, 31, 60, 82, 51, 26, 30, 13, 112, 129, 118, 10, 129, 127, 26, 116, 31, 69, 42, 156, 140, 0, 84, 50, 67, 86},
            {100, 124, 107, 65, 158, 30, 149, 103, 92, 108, 144, 149, 67, 56, 86, 160, 190, 180, 84, 176, 194, 73, 177, 78, 131, 89, 217, 187, 84, 0, 144, 154, 149},
            {45, 47, 38, 64, 44, 114, 34, 81, 105, 58, 70, 37, 84, 88, 37, 47, 103, 64, 60, 63, 81, 81, 91, 66, 53, 63, 130, 74, 50, 144, 0, 31, 29},
            {75, 77, 69, 89, 33, 123, 24, 50, 70, 88, 46, 13, 94, 98, 68, 77, 93, 54, 58, 93, 63, 93, 65, 97, 22, 93, 120, 104, 67, 154, 31, 0, 9},
            {75, 77, 69, 83, 22, 118, 19, 45, 65, 88, 41, 8, 89, 93, 101, 66, 88, 49, 47, 83, 57, 88, 60, 94, 17, 105, 115, 71, 86, 149, 29, 9, 0}
        };

        System.out.println("Distancias entre municipios de Huehuetenango:\n");

        // Imprimir encabezados de columna
//        System.out.print("          ");
//        for (String municipio : municipios) {
//            System.out.printf("%12s", municipio);
//        }
        System.out.println();

        // Imprimir filas con municipios y distancias
        for (int i = 0; i < municipios.length; i++) {
            System.out.printf("%12s", municipios[i]);

//            for (int j = 0; j < municipios.length; j++) {
//                System.out.printf("%12d", distancias[i][j]);
//            }

            System.out.println();
        }

        // Obtener municipio de origen y de llegada
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el municipio de origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el municipio de llegada: ");
        String llegada = scanner.nextLine();

        // Buscar índices de los municipios ingresados
        int indiceOrigen = -1;
        int indiceLlegada = -1;
        for (int i = 0; i < municipios.length; i++) {
            if (municipios[i].equalsIgnoreCase(origen)) {
                indiceOrigen = i;
            }
            if (municipios[i].equalsIgnoreCase(llegada)) {
                indiceLlegada = i;
            }
        }

        // Verificar si se encontraron los municipios ingresados
        if (indiceOrigen != -1 && indiceLlegada != -1) {
            ResultadoRuta resultado = encontrarRuta(distancias, municipios, indiceOrigen, indiceLlegada);
            if (resultado.ruta.isEmpty()) {
                System.out.println("\nNo se encontró una ruta entre los municipios ingresados.");
            } else {
                System.out.println("\nRuta más corta encontrada:");
                for (String municipio : resultado.ruta) {
                    System.out.println(municipio);
                }
                System.out.println("\nDistancia total recorrida: " + resultado.distanciaTotal + " km.");
            }
        } else {
            System.out.println("\nNo se encontraron los municipios ingresados.");
        }
    }

    private static ResultadoRuta encontrarRuta(int[][] distancias, String[] municipios, int origen, int llegada) {
        int[] distanciasMinimas = new int[municipios.length];
        Arrays.fill(distanciasMinimas, Integer.MAX_VALUE);
        distanciasMinimas[origen] = 0;

        int[] predecesores = new int[municipios.length];
        Arrays.fill(predecesores, -1);

        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();
        colaPrioridad.offer(new Nodo(origen, 0));

        while (!colaPrioridad.isEmpty()) {
            Nodo nodoActual = colaPrioridad.poll();
            int indiceActual = nodoActual.indice;

            if (indiceActual == llegada) {
                break;
            }

            for (int i = 0; i < distancias.length; i++) {
                int distancia = distancias[indiceActual][i];
                if (distancia != 0) {
                    int distanciaAcumulada = distanciasMinimas[indiceActual] + distancia;
                    if (distanciaAcumulada < distanciasMinimas[i]) {
                        distanciasMinimas[i] = distanciaAcumulada;
                        predecesores[i] = indiceActual;
                        colaPrioridad.offer(new Nodo(i, distanciaAcumulada));
                    }
                }
            }
        }

        List<String> ruta = new ArrayList<>();
        int indice = llegada;
        while (indice != -1) {
            ruta.add(municipios[indice]);
            indice = predecesores[indice];
        }
        ruta.sort(null);

        return new ResultadoRuta(ruta, distanciasMinimas[llegada]);
    }

    private static class Nodo implements Comparable<Nodo> {
        int indice;
        int distancia;

        public Nodo(int indice, int distancia) {
            this.indice = indice;
            this.distancia = distancia;
        }

        @Override
        public int compareTo(Nodo otro) {
            return Integer.compare(distancia, otro.distancia);
        }
    }

    private static class ResultadoRuta {
        List<String> ruta;
        int distanciaTotal;

        public ResultadoRuta(List<String> ruta, int distanciaTotal) {
            this.ruta = ruta;
            this.distanciaTotal = distanciaTotal;
        }
    }
}
