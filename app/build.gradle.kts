plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hurrey.camerafacedetetion"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.hurrey.camerafacedetetion"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.30")
    implementation("com.google.android.gms:play-services-mlkit-face-detection:17.0.1")
    implementation("androidx.camera:camera-camera2:1.1.0-beta03")
    implementation("androidx.camera:camera-core:1.1.0-beta03")
    implementation("androidx.camera:camera-lifecycle:1.1.0-beta03")
    implementation("androidx.camera:camera-view:1.1.0-beta03")



}