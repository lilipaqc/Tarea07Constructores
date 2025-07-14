/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea07constructores; 

/**
 * Representa un plato de comida ecuatoriana, demostrando el uso de constructores.
 * Contiene atributos para describir un plato y diferentes constructores para inicializarlos.
 * @author USER
 */
public class PlatoComida {
    private String nombre;
    private String regionOrigen; // Ej: Costa, Sierra, Amazonía
    private double precio;
    private String ingredientePrincipal; // Ej: Pescado, Cerdo, Papa

    /**
     * Constructor por defecto. Inicializa atributos con valores predeterminados.
     */
    public PlatoComida() {
        this.nombre = "Plato Desconocido Ecuatoriano";
        this.regionOrigen = "Varias Regiones";
        this.precio = 0.0;
        this.ingredientePrincipal = "Desconocido";
        System.out.println("DEBUG: PlatoComida creado con constructor por defecto.");
    }

    /**
     * Constructor parametrizado. Inicializa nombre, región de origen y precio.
     * @param nombre Nombre del plato.
     * @param regionOrigen Región de Ecuador de donde proviene el plato (ej. "Costa", "Sierra", "Amazonía").
     * @param precio Precio del plato.
     */
    public PlatoComida(String nombre, String regionOrigen, double precio) {
        this.nombre = nombre;
        this.regionOrigen = regionOrigen;
        this.precio = precio;
        this.ingredientePrincipal = "No especificado"; // Valor por defecto
        System.out.println("DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).");
    }

    /**
     * Sobrecarga de constructor. Inicializa todos los atributos, incluyendo el ingrediente principal.
     * Reutiliza el constructor de 3 parámetros usando 'this()'.
     * @param nombre Nombre del plato.
     * @param regionOrigen Región de origen del plato.
     * @param precio Precio del plato.
     * @param ingredientePrincipal El ingrediente principal del plato.
     */
    public PlatoComida(String nombre, String regionOrigen, double precio, String ingredientePrincipal) {
        this(nombre, regionOrigen, precio); // Llama al constructor anterior para inicializar
        this.ingredientePrincipal = ingredientePrincipal;
        System.out.println("DEBUG: PlatoComida creado con sobrecarga de constructor (nombre, región, precio, ingrediente).");
    }

    // --- Métodos Getters ---
    public String getNombre() {
        return nombre;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    /**
     * Muestra toda la información del plato en consola.
     */
    public void mostrarInformacion() {
        System.out.println("\n--- Información del Plato Ecuatoriano ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Región de Origen: " + this.regionOrigen);
        System.out.println("Precio: $" + String.format("%.2f", this.precio));
        System.out.println("Ingrediente Principal: " + this.ingredientePrincipal);
        System.out.println("---------------------------------------");
    }
}