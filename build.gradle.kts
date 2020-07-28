plugins {
    id("org.jetbrains.kotlin.js") version Versions.kotlin
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    // React
    implementation(Deps.Kotlin.React)
    implementation(Deps.Kotlin.ReactDom)
    implementation(npm(Deps.Npm.React, Versions.npmReact))
    implementation(npm(Deps.Npm.ReactDom, Versions.npmReact))

    //Kotlin Styled
    implementation(Deps.Kotlin.Styled)
    implementation(npm(Deps.Npm.StyledComponents))
    implementation(npm(Deps.Npm.InlineStylePrefixer))
}

kotlin.target.browser { }
