# Arkamo Android Challenge

Android application developed as part of the Arkamo Android Developer technical challenge.

## Tech Stack

- Kotlin
- Jetpack Compose
- MVVM
- Clean Architecture (scalable approach)
- Retrofit
- Coil
- StateFlow
- Navigation Compose

---

# Technical Decisions

## Architecture

A Clean Architecture approach was implemented to keep the project simple,
scalable, and easy to maintain within the challenge time constraints.

The project is separated into:
- `data`
- `domain`
- `presentation`
- `core`

### Repository Pattern
A repository interface and implementation were added to decouple the domain layer from the data source.

### DTO → Domain Mapping
The API response models (`DTOs`) are mapped into domain models before reaching the presentation layer.

This prevents exposing remote models directly to the UI and improves maintainability.

### Use Cases
A `GetCharactersUseCase` was implemented to encapsulate business logic and keep the ViewModel focused on presentation state.

### Dependency Injection
Manual dependency injection was used through a simple `AppModule` object to keep a simple implementation 
and avoid adding unnecessary complexity with frameworks like Hilt for a short challenge.

---

# State Management

The UI explicitly handles:
- Loading
- Success
- Error
- Retry

`StateFlow` was used for reactive UI state management.

---

# Image Loading

`Coil` was used for image loading because it integrates well with Jetpack Compose and provides:
- Memory caching
- Disk caching
- Efficient scrolling performance
- Image placeholders/loading states
- Error handling

The implementation also avoids unnecessary image reloads during recomposition and scrolling.

---

# What Was Left Out Due To Time Constraints

- Pagination
- Unit tests
- UI tests
- Offline cache/local database
- Search/filter functionality

---

# Improvements With More Time

If more time were available, I would add:
- Paging 3 support
- Unit and integration tests
- Accessibility improvements 
- Pull-to-refresh


---

# AI Usage

AI assistance tools (ChatGPT and Gemini) were used for:
- Architecture order and package creation 
- Implement libraries 
- Error and bug solving
- Implementation of the README file

All final implementation decisions, integration, debugging, and code validation were manually reviewed and adjusted.