# serenity-cucumber-gradle-   CARLOS DE LA CRUZ PRUEBA DE AUTOMATIZACIÓN 13/03/2022
Un proyecto donde se ejemplifica el uso del patrón serenity 
 con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web de (https://www.saucedemo.com/).

Por defecto, los tests corren en Chrome con riverManager, así que es NO necesario tener instalada la última versión del chrome driver y tenerla agregada como una variable en el path del sistema.

## Detalles generales de la implementación

Se realizan pruebas con 4 perfiles o usuarios diferentes, partiendo de laa base de que todos los usuarios deben funcionar perfectamente, se aplican try catch para validar el correcto funcionamiento de cada usuario pero se realiza una validación adicional para fallar los casos si se llega a presentar algun error

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

## Para correr el proyecto

clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
 