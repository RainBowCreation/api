## Using RainBowCreation in your plugin
[![Discord](https://img.shields.io/discord/370567347599179787.svg?color=738ad6&label=Join%20RainBowCreation%20Discord&logo=discord&logoColor=ffffff)](https://rainbowcreation.net/discord)

Add the following into your build.gradle:

```
repositories {
  maven {
    mavenCentral()
  }
}

dependencies {
  implementation group: 'net.rainbowcreation', name: 'core-api', version: 'API'
}
```

Or in your pom.xml:

```
<dependencies>
    <dependency>
        <groupId>net.rainbowcreation</groupId>
        <artifactId>corer-api</artifactId>
        <version>API</version>
    </dependency>
</dependencies>
```
