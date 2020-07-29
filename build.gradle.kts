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
    implementation(npm(Npm.React, Versions.npmReact))
    implementation(npm(Npm.ReactDom, Versions.npmReact))

    //Kotlin Styled
    implementation(Deps.Kotlin.Styled)
    implementation(npm(Npm.StyledComponents))
    implementation(npm(Npm.InlineStylePrefixer))

    // Youtube
    implementation(npm(Npm.ReactPlayer))
    implementation(npm(Npm.ReactShare))
}

kotlin.target.browser { }
