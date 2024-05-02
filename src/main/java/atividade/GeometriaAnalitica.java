/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade;

import java.util.Scanner;

/**
 *
 * @author Wésia Kaliany <@kalianywesia2005@gmail.com>
 */
public class GeometriaAnalitica {


    // Método para verificar colinearidade
    public static boolean arePointsCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        double determinant = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
        return determinant == 0;
    }

    // Método para calcular a distância entre dois pontos
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário as coordenadas dos pontos
        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Digite as coordenadas do terceiro ponto (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Verificar colinearidade
        if (arePointsCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Os pontos estão alinhados.");
            // Calcular distância entre o primeiro e o segundo ponto
            double distance = calculateDistance(x1, y1, x2, y2);
            System.out.println("Distância entre o primeiro e o segundo ponto: " + distance);
        } else {
            System.out.println("Os pontos não estão alinhados.");
        }

        scanner.close();
    }
}

