# libraryloadexample
Example of loading a C shared object from Kotlin code

## Build

```
./gradlew assembleRelease
```

## Notes

Sample release signing key (my-release-key.jks) was created using:

```
keytool -genkey -v -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000 -alias my-key-alias
```
