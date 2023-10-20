# RetoWebSaucemo

## Descripción

Este proyecto de automatización utiliza Serenity BDD con el patrón Screenplay para realizar pruebas en una tienda virtual, cubriendo casos de uso comunes como buscar productos, agregarlos al carrito, completar el proceso de compra, y verificar la finalización exitosa de la transacción.

## Pre-requisitos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

- **Java 8 u 11**: Puedes descargar Java en https://www.java.com/es/download/.

- **Git**: Puedes descargarlo e instalarlo desde https://git-scm.com/downloads.
- **IntelliJ**
- **Gradle**: En la versión gradle-7.4-bin.zip

## Paquetes utilizados en el patrón Screenplay

Este proyecto utiliza el patrón Screenplay para mejorar la legibilidad y la mantenibilidad de las pruebas. Los principales paquetes utilizados son:

- **interactions**: Contiene clases que representan acciones específicas que un usuario puede realizar.

- **questions**: Contiene clases que permiten hacer preguntas sobre el estado de la aplicación, como "¿El producto se ha agregado al carrito?".

- **tasks**: Contiene clases que definen tareas completas, que pueden requerir varias acciones y preguntas.
  
- **userinterfaces**: Contiene clases donde se encuentran los localizadores de la página.

- **utils**: Contiene clases para generar utilidades en las interacciones, con el propósito de ejecutar funciones específicas.

- **runners**: Contiene las clases que permiten ejecutar los features.

- **stepsdefinitions**: Contiene las clases que implementan los pasos definidos en los features.

- **features**: Contiene las historias de usuario en lenguaje Gherkin.

## Instalación

Para ejecutar este proyecto en tu máquina local, debes:
Clona este repositorio en tu máquina local utilizando Git:

   git clone https://github.com/JessicaParraG/RetoWebSaucemo.git
