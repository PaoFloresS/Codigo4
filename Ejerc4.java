package com.ejerc4; // se cambio el package

import java.util.Scanner; // se agrego el import 


public class Ejerc4 {

    public static void main(String[] args) {
        // Crear una entrada del usuario
        Scanner scanner = new Scanner(System.in); // se agrego la palabra 'scanner'
        
        // Solicitar  al primer jugador su eleccion 
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().trim().toLowerCase();
        
        // Solicita al segundo ganador su eleccion 
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().trim().toLowerCase();
        
        // Define al ganador
        int ganador = determinarGanador(j1, j2);
        
        // Muestra el resultado
        if (ganador == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador " + ganador);
        }
        
        // Cierra el scanner
        scanner.close();
    }
    
    /**
     * Determina el ganador del juego basado en las elecciones de los jugadores.
     * @param j1 Elección del jugador 1.
     * @param j2 Elección del jugador 2.
     * @return 1 si gana el jugador 1, 2 si gana el jugador 2, 0 si hay empate.
     */
    private static int determinarGanador(String j1, String j2) {
        if (j1.equals(j2)) {
            return 0; // Empate
        }
        
        switch (j1) {
            case "piedra":
                if (j2.equals("tijeras")) {
                    return 1; // Gana el jugador 1
                }
                break;
                
            case "papel":
                if (j2.equals("piedra")) {
                    return 1; // Gana el jugador 1
                }
                break;
                
            case "tijeras":
                if (j2.equals("papel")) {
                    return 1; // Gana el jugador 1
                }
                break;
                
            default:
                System.out.println("Elección inválida");
                return 0; // Elección inválida
        }
        
        return 2; // Gana el jugador 2
    }
}
