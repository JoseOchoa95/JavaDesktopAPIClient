# Pokémon API Client 🎮

Una aplicación de escritorio JavaFX que se conecta a la PokeAPI para obtener información detallada sobre Pokémon, construida con clean architecture y Java 21.

## 🚀 Características

- **Interfaz gráfica moderna** con JavaFX
- **Conexión a PokeAPI** para obtener datos en tiempo real
- **Arquitectura clean** para mejor mantenibilidad y testabilidad
- **Búsqueda en tiempo real** de Pokémon por nombre
- **Visualización de información completa**: habilidades, tipos, stats, etc.
- **Diseño responsive** que se adapta a diferentes tamaños de pantalla

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación
- **JavaFX 21** - Interfaz gráfica
- **OkHttp 4.12.0** - Cliente HTTP
- **Gson** - Serialización/Deserialización JSON
- **Arquitectura clean** - Patrón de diseño

## 📦 Requisitos del Sistema

- Java JDK 21 o superior
- Gradle 8.0+ o Maven 3.6+
- Conexión a internet (para acceder a PokeAPI)

## 🏗️ Estructura del Proyecto

src/

├── main/

│ ├── java/

│ │ └── org/ochoa/apiclient/

│ │ ├── data/

│ │ │ ├── api/ # Puerto: Cliente HTTP

│ │ │ ├── models/ # Modelos de datos

│ │ │ └── PokemonRepository.java

│ │ ├── domain/ # Lógica de negocio

│ │ │ ├── models/

│ │ │ └── usecases/

│ │ ├── ui/ # Adaptador primario: UI

│ │ │ └── controllers/

│ │ └── PokeAPIApplication.java

│ └── resources/

│ └── images/ # Assets de la aplicación

## 🔧 Instalación y Ejecución

```bash
# Clonar el proyecto
git clone <url-del-repositorio>
cd JavaDesktopAPIClient

# Compilar y ejecutar
./gradlew run

# O compilar y crear distribución
./gradlew build
./gradlew installDist

# Ejecutar desde la distribución
cd build/install/APIClient/bin/APIClient.bat
```

## 🎯 Uso de la Aplicación
  Iniciar la aplicación: Al abrirla, verás un campo de búsqueda
  Buscar Pokémon: Escribe el nombre de un Pokémon (ej: "pikachu", "charizard")
  Ver resultados: La información del Pokémon aparecerá en el panel derecho
  Manejo de errores: Si el Pokémon no existe, se mostrará un mensaje de error

<img width="692" height="417" alt="image" src="https://github.com/user-attachments/assets/d8c80f82-834e-4406-9d88-b18cbbe148f7" />
<img width="693" height="421" alt="image" src="https://github.com/user-attachments/assets/53765e6d-3968-47fb-8048-3a8d8e9f42f0" />
<img width="690" height="419" alt="image" src="https://github.com/user-attachments/assets/ac610bd4-c818-42dd-8bb7-d54601e5f94a" />
