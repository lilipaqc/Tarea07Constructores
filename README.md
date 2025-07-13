# Tarea 07: Implementación de Constructores en Java

---

**Nombre del Estudiante:** Lilian Paulina Quijije Coral

---

## Descripción del Programa

Este programa en Java demuestra la aplicación de **constructores** en la programación orientada a objetos, centrándose en el manejo de diferentes formas de inicializar objetos.

Se ha creado una clase `PlatoComida` que representa un plato típico ecuatoriano, con atributos como nombre, región de origen, precio e ingrediente principal. La clase incluye:

* Un **constructor por defecto** que inicializa los atributos con valores genéricos.
* Un **constructor parametrizado** que permite inicializar el nombre, la región de origen y el precio del plato.
* Una **sobrecarga de constructor** que inicializa todos los atributos, incluyendo el ingrediente principal, y demuestra la **reutilización de constructores** utilizando `this()`.

La clase principal `Tarea07Constructores` crea varias instancias de `PlatoComida` utilizando cada uno de los constructores para ilustrar su uso y el comportamiento resultante.

---

## Cómo Ejecutar el Programa

1.  Clona este repositorio: `git clone https://github.com/lilipaqc/Tarea07Constructores.git`
2.  Abre el proyecto en tu IDE (NetBeans, Eclipse, IntelliJ IDEA).
3.  Ejecuta la clase `Tarea07Constructores.java`.

---

## Ejemplo de Uso o Ejecución

Al ejecutar el programa, la consola mostrará información detallada sobre cada plato creado, indicando qué constructor fue utilizado para su inicialización y los valores de sus atributos.

```
--- Demostración de Constructores de Platos Ecuatorianos ---

Creando Plato1 (constructor por defecto):
DEBUG: PlatoComida creado con constructor por defecto.

--- Información del Plato Ecuatoriano --- Nombre: Plato Desconocido Ecuatoriano Región de Origen: Varias Regiones Precio: $0.00 Ingrediente Principal: Desconocido
Creando Plato2 (Hornado - constructor parametrizado):
DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).

--- Información del Plato Ecuatoriano --- Nombre: Hornado Región de Origen: Sierra Precio: $10.50 Ingrediente Principal: No especificado
Creando Plato3 (Encebollado - sobrecarga):
DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).
DEBUG: PlatoComida creado con sobrecarga de constructor (nombre, región, precio, ingrediente).

--- Información del Plato Ecuatoriano --- Nombre: Encebollado Región de Origen: Costa Precio: $5.00 Ingrediente Principal: Pescado (Albacora)
Creando Plato4 (Ceviche de Camarón - sobrecarga):
DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).
DEBUG: PlatoComida creado con sobrecarga de constructor (nombre, región, precio, ingrediente).

--- Información del Plato Ecuatoriano --- Nombre: Ceviche de Camarón Región de Origen: Costa Precio: $9.75 Ingrediente Principal: Camarón
Creando Plato5 (Yapingacho - sobrecarga):
DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).
DEBUG: PlatoComida creado con sobrecarga de constructor (nombre, región, precio, ingrediente).

--- Información del Plato Ecuatoriano --- Nombre: Yapingacho Región de Origen: Sierra Precio: $7.20 Ingrediente Principal: Papa y Huevo Frito
Creando Plato6 (Maito de Tilapia - Amazonía - sobrecarga):
DEBUG: PlatoComida creado con constructor parametrizado (nombre, región, precio).
DEBUG: PlatoComida creado con sobrecarga de constructor (nombre, región, precio, ingrediente).

--- Información del Plato Ecuatoriano --- Nombre: Maito de Tilapia Región de Origen: Amazonía Precio: $7.25 Ingrediente Principal: Tilapia
--- Fin de la demostración ---
```
