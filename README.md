# Reproduction of KGP 2.3.0-Beta2 regression

1. `./gradlew library:compileKotlinLinuxX64 --rerun`

# Expected

Success

# Actual

```
> Task :library:compileKotlinLinuxX64 FAILED
e: warnings found and -Werror specified
w: file:///usr/local/google/home/aurimas/Code/temp/multiplatform-library-template-main/library/src/nonAndroidMain/kotlin/CustomFibi.nonAndroid.kt:6:8 Annotation `@JvmInline` is missing on actual declaration.
All annotations from expect `io.github.kotlin.fibonacci.SavedStateReader` must be present with the same arguments on actual `io.github.kotlin.fibonacci.SavedStateReader`, otherwise they might behave incorrectly.

```

Note, if you change `gradle/libs.versions.toml` kotlin version to 2.2.21 it passes.