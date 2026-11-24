plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    // Hilt. Injection of dependencies
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    // ObjectBox. Local database
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.objectbox)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.app.gaijin"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.app.gaijin"
        minSdk = 28
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
    // Hilt. Injection of dependencies
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.kotlinx.serialization.json)
    // Material de Navegacion
    implementation(libs.androidx.navigation.compose)
    // OkHttp (logging solo se activa en el flavor dev)
    implementation(libs.okhttp.logging)
    // Datastore: For token storage
    implementation(libs.androidx.datastore.preferences)
    // ObjectBox: show database in debug
    debugImplementation(libs.objectbox.android.objectbrowser)
    releaseImplementation(libs.objectbox.android)
    // Icons Lucide
    implementation(libs.lucide.icons)
}
