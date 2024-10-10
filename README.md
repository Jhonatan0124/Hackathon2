# Sistema de Gestión de Agenda Telefónica

## Misión
Este proyecto tiene como objetivo crear un sistema que permita gestionar una agenda telefónica siguiendo las siguientes indicaciones:

- Un **contacto** está definido por un **nombre**, un **apellido** y un **teléfono** (no es necesario validar el formato del teléfono).
- Un contacto se considera igual a otro cuando tienen el mismo **nombre** y **apellido** (sin distinguir entre mayúsculas y minúsculas).
- La agenda de contactos está formada por un conjunto de contactos.
- La agenda puede crearse de dos formas:
  - Indicando el tamaño máximo.
  - Usando un tamaño por defecto de 10 contactos.

### Validaciones importantes:
- Los **nombres** y **apellidos** no pueden estar vacíos.
- No se pueden añadir **contactos duplicados** (es decir, dos contactos con el mismo nombre y apellido).

## Funcionalidades
El sistema incluye un menú interactivo por consola para probar todas las funcionalidades de la agenda.

### 1. `añadirContacto(Contacto c)`
- Añade un contacto a la agenda.
- Si no hay espacio suficiente, se indica que la agenda está llena.
- Verifica que el contacto no exista ya en la agenda (contactos con el mismo nombre y apellido se consideran duplicados).
- No se puede añadir un contacto si el **nombre** o **apellido** están vacíos.

### 2. `existeContacto(Contacto c)`
- Verifica si un contacto ya existe en la agenda.
- Los contactos se consideran iguales si tienen el mismo **nombre** y **apellido**, sin importar el teléfono.

### 3. `listarContactos()`
- Muestra todos los contactos de la agenda en el siguiente formato: **Nombre Apellido - Teléfono**.
- Los contactos se ordenan alfabéticamente por **nombre** y **apellido** antes de mostrarse.

### 4. `buscaContacto(String nombre)`
- Permite buscar un contacto por **nombre** y **apellido**.
- Si el contacto existe, muestra el teléfono. Si no existe, se muestra un mensaje indicando que no se ha encontrado.

### 5. `eliminarContacto(Contacto c)`
- Elimina un contacto de la agenda.
- Muestra un mensaje indicando si la eliminación ha sido exitosa o no.
- Si se intenta eliminar un contacto que no existe, se informa al usuario.

### 6. `modificarTelefono(String nombre, String apellido, String nuevoTelefono)`
- Permite modificar el teléfono de un contacto existente.
- Si el contacto no existe, muestra un mensaje de error.

### 7. `agendaLlena()`
- Indica si la agenda está llena.
- Muestra un mensaje indicando que no hay espacio disponible para nuevos contactos.

### 8. `espaciosLibres()`
- Muestra cuántos contactos más se pueden agregar a la agenda.
- Esto se basa en el tamaño máximo definido al crear la agenda.

## Herramientas
- **Lenguaje:** Java
- **Interfaz de usuario:** Consola
- **Estructuras de datos:** `HashSet` para evitar duplicados automáticamente.
  
El sistema está diseñado para ejecutarse en la consola, donde se despliega un menú interactivo que permite probar todas las funcionalidades mencionadas.

## Integrantes
- Camila Jiménez
- Santiago Rodríguez
- Jhonatan López

