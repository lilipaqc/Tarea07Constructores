/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea07constructores; // Asegúrate que este sea el nombre de tu paquete

/**
 * Clase principal para demostrar constructores de la clase PlatoComida con ejemplos ecuatorianos.
 * @author USER
 */
public class Tarea07Constructores {

    /**
     * Punto de entrada de la aplicación.
     * Demuestra la creación de objetos PlatoComida con diferentes constructores.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("--- Demostración de Constructores de Platos Ecuatorianos ---");

        // 1. Uso del constructor por defecto.
        System.out.println("\nCreando Plato1 (constructor por defecto):");
        PlatoComida plato1 = new PlatoComida();
        plato1.mostrarInformacion();

        // 2. Uso del constructor parametrizado (nombre, región, precio).
        System.out.println("\nCreando Plato2 (Hornado - constructor parametrizado):");
        PlatoComida plato2 = new PlatoComida("Hornado", "Sierra", 10.50);
        plato2.mostrarInformacion();

        // 3. Uso de la sobrecarga de constructor (nombre, región, precio, ingrediente principal).
        System.out.println("\nCreando Plato3 (Encebollado - sobrecarga):");
        PlatoComida plato3 = new PlatoComida("Encebollado", "Costa", 5.00, "Pescado (Albacora)");
        plato3.mostrarInformacion();

        System.out.println("\nCreando Plato4 (Ceviche de Camarón - sobrecarga):");
        PlatoComida plato4 = new PlatoComida("Ceviche de Camarón", "Costa", 9.75, "Camarón");
        plato4.mostrarInformacion();

        System.out.println("\nCreando Plato5 (Yapingacho - sobrecarga):");
        PlatoComida plato5 = new PlatoComida("Yapingacho", "Sierra", 7.20, "Papa y Huevo Frito");
        plato5.mostrarInformacion();
        
        System.out.println("\nCreando Plato6 (Maito de Tilapia - Amazonía - sobrecarga):");
        PlatoComida plato6 = new PlatoComida("Maito de Tilapia", "Amazonía", 7.25, "Tilapia");
        plato6.mostrarInformacion();

        System.out.println("\n--- Fin de la demostración ---");
    }
}