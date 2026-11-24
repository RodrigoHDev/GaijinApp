// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Hilt. Injection of dependencies
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.hilt) apply false
    // ObjectBox. Local database
    alias(libs.plugins.objectbox) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}
