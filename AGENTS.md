# biodataakmal

Single-module Android app (Java). Package `com.example.biodataakmal`. Display name: **BiodataKu**.

Strings are in **Indonesian (Bahasa)** — do not add English strings.

## Build & commands

```
.\gradlew.bat lint                # lint checks
.\gradlew.bat test                # unit tests (host JVM)
.\gradlew.bat connectedAndroidTest  # instrumented tests (device/emulator)
.\gradlew.bat assembleDebug       # debug APK
```

Run order: `lint -> test -> assembleDebug` (no separate typecheck step).

## Key config

| Setting | Value |
|---|---|
| AGP / Gradle wrapper | 9.2.1 / 9.4.1 |
| compileSdk / targetSdk / minSdk | 36 / 36 / 24 (`release(36) { minorApiLevel = 1 }`) |
| Java source/target | 11 |
| Configuration cache | enabled |
| Version catalog | `gradle/libs.versions.toml` (use `libs.*`, never inline strings) |
| Theme | `Base.Theme.Biodataakmal` → `Theme.Material3.DayNight.NoActionBar` |
| Release optimization | disabled (`optimization.enable = false`) |

## Architecture

- **3 Activities** — `MainActivity` (launcher), `SecondActivity`, `CvActivity`. All call `EdgeToEdge.enable(this)`.
- `MainActivity` has 3 buttons for group members, each launches `SecondActivity` via `Intent` with the literal key `"EXTRA_PERSON_INDEX"` (int 1-3). No constant used. A fourth button ("GitHub") opens `https://github.com/kelompok3/biodataakmal` via `Intent.ACTION_VIEW`.
- `SecondActivity` reads `EXTRA_PERSON_INDEX` via `switch`:
  - cases 2-4 → `person_2_*` / `person_3_*` / `person_4_*` string resources.
  - `default` (including index=1) → `cv_*` strings.
  - Avatar is set for index 1 (`gemini_generated_image_pkz8oapkz8oapkz8`), index 2 (`gemini_generated_image_jpg6yljpg6yljpg6`), and index 3 (`foto_dirham`); index 4 gets no avatar.
  - **Gotcha**: email `TextView` id is `R.id.emailCv`, not `R.id.email`.
- `CvActivity` is declared in the manifest but **never launched** (dead code). Its layout uses `@string/cv_*` references directly, unlike `SecondActivity` which builds text dynamically via `setField()`.
- Tests (`ExampleUnitTest`, `ExampleInstrumentedTest`) are auto-generated placeholders — no real tests exist.
- Color palette: blue primary `#1565C0`, secondary `#42A5F5`.
