## Using RainBowCreation in your plugin
[![Discord](https://img.shields.io/discord/370567347599179787.svg?color=738ad6&label=Join%20RainBowCreation%20Discord&logo=discord&logoColor=ffffff)](https://rainbowcreation.net/discord)

Gradle : Add the following into your build.gradle:

```
repositories {
    maven {
        name = "rainbowcreation"
        url = "https://repo.rainbowcreation.net"
    }
}

dependencies {
    compileOnly "net.rainbowcreation:api:1.0.1-SNAPSHOT"
}
```

Maven : in your pom.xml:

```
<repositories>
    <repository>
        <id>rainbowcreation</id>
        <url>repo.rainbowcreation.net</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>net.rainbowcreation</groupId>
        <artifactId>api</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```
### if you want to use latest snapshot version plese direct to 
https://github.com/RainBowCreation/api/tree/dev
