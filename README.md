# TweetsApp

## Overview
TweetsApp is a modern Android application designed to interact with a REST API to fetch and display data. Built with Jetpack Compose for the UI and Hilt for dependency injection, the app demonstrates clean architecture principles, efficient networking, and a seamless user experience.

## Features
- Fetch categories and other data from a REST API.
- Display data in a user-friendly interface designed using Jetpack Compose.
- Modular architecture for better maintainability and scalability.
- Dependency injection using Hilt for efficient resource management.
- Retrofit integration for smooth API communication.

## Technology Stack
### Frontend
- **Kotlin**: Primary programming language for Android development.
- **Jetpack Compose**: Declarative UI toolkit for building native UI.

### Backend Integration
- **Retrofit**: HTTP client for REST API communication.
- **Gson**: JSON serialization and deserialization.
- **Hilt**: Dependency injection framework.

### Architecture
- **MVVM (Model-View-ViewModel)**: Ensures separation of concerns.
- **Coroutines**: For asynchronous tasks.

## Dependencies
Ensure the following dependencies are added to your project:

```gradle
// Retrofit
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

// Hilt
implementation "com.google.dagger:hilt-android:2.44"
kapt "com.google.dagger:hilt-compiler:2.44"

// Jetpack Compose
implementation 'androidx.compose.ui:ui:1.5.0'
implementation 'androidx.compose.material3:material3:1.2.0-alpha03'
implementation 'androidx.activity:activity-compose:1.7.0'

// Coroutines
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0'
```

## API Details
TweetsApp communicates with the API hosted at `https://api.jsonbin.io/`.
- **Endpoint**: `/getCategories`
- **Method**: `GET`
- **Response Format**: JSON

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/AyushTurak/TweetsApp.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle to install all dependencies.
4. Build and run the app on an emulator or connected device.

## Screenshots
![image](https://github.com/user-attachments/assets/a59ca8b6-9561-4186-a70b-faf58415f489)
![image](https://github.com/user-attachments/assets/a9709d50-dfcc-46a1-8efd-b97f103c211c)

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.

---
Developed by Ayush Turak.

