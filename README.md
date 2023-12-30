# Using RainBowCreation in your plugin
[![Discord](https://img.shields.io/discord/370567347599179787.svg?color=738ad6&label=Join%20RainBowCreation%20Discord&logo=discord&logoColor=ffffff)](https://rainbowcreation.net/discord)

### For Addon project : in your plugin.yml
```
depends: [RainBowCreation, ....]
```
### For Stanalone Project
You cannot use other Stanalone project in the same server.
The stucture work like this
```
API <-> Addon
|
Stanalone
```
Change dependency scope to complie and in your main class should look like this
```
public class YourPlugin extends JavaPlugin implements ICore {
    private static YourPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        .
        .
        .
        new ApiProvider().register(instance); // register instance to api

```

### Gradle : Add the following into your build.gradle:

```
repositories {
  maven {
    mavenCentral()
  }
}

dependencies {
  compileOnly "net.rainbowcreation:api:1.0.1"
}
```

### Maven : in your pom.xml:

```
<dependencies>
    <dependency>
        <groupId>net.rainbowcreation</groupId>
        <artifactId>api</artifactId>
        <version>1.0.1</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## If you want to use Snapshot version

### Gradle : Add the following into your build.gradle:

```
repositories {
    maven {
        name = "rainbowcreation"
        url = "https://repo.rainbowcreation.net"
    }
}

dependencies {
    compileOnly "net.rainbowcreation:api:1.0.2-SNAPSHOT"
}
```

### Maven : in your pom.xml:

```
<repositories>
    <repository>
        <id>rainbowcreation</id>
        <url>https://repo.rainbowcreation.net</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>net.rainbowcreation</groupId>
        <artifactId>api</artifactId>
        <version>1.0.2-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

java docs https://api.rainbowcreation.net
