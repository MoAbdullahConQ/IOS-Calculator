# iOS-Style Calculator (Android)

![Platform](https://img.shields.io/badge/platform-Android-3DDC84?logo=android&logoColor=white)
![Language](https://img.shields.io/badge/language-Java-007396?logo=java&logoColor=white)
![Min SDK](https://img.shields.io/badge/minSdk-24-blue)
![License](https://img.shields.io/badge/license-MIT-green)


A native Android calculator app built with Java, recreating the look and feel of Apple's iOS Calculator. Includes standard arithmetic operations behind a clean, minimal UI with custom-built iOS-style buttons and full dark mode support.

## Demo
 
<a href="https://youtu.be/ouBskwNJPHA">
  <img src="https://img.youtube.com/vi/ouBskwNJPHA/maxresdefault.jpg" width="600">
</a>

*Click the thumbnail above to watch the app in action or click here* ▶️ [Watch the demo](https://youtu.be/ouBskwNJPHA)

## Features

- Core arithmetic: addition, subtraction, multiplication, division
- Modulo (%) operation
- Positive/negative toggle (+/-)
- All-clear (AC) button to reset the calculator
- Live expression preview above the input field as operations are chained
- Custom-built, rounded iOS-style buttons using Android `Drawable` resources
- Light and dark theme support (`values` / `values-night`)

## Tech Stack

| | |
|---|---|
| **Language** | Java |
| **Platform** | Native Android |
| **UI** | `ConstraintLayout` + custom drawables |
| **Build system** | Gradle (Kotlin DSL) |
| **minSdk / targetSdk / compileSdk** | 24 / 33 / 34 |

## Dependencies

- `androidx.appcompat:appcompat`
- `com.google.android.material:material`
- `androidx.constraintlayout:constraintlayout`
- `junit` (unit tests)
- `androidx.test.ext:junit`, `androidx.test.espresso:espresso-core` (instrumented tests)

## Project Structure

```
IOS-Calculator/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/calculatoriosversionone/
│   │   │   │   └── MainActivity.java   # Calculator logic & UI bindings
│   │   │   ├── res/
│   │   │   │   ├── layout/              # activity_main.xml
│   │   │   │   ├── drawable/            # Custom iOS-style button shapes
│   │   │   │   ├── values/              # Light theme, strings, colors
│   │   │   │   └── values-night/        # Dark theme
│   │   │   └── AndroidManifest.xml
│   │   ├── test/                        # Unit tests
│   │   └── androidTest/                 # Instrumented tests
│   └── build.gradle.kts
├── screenshots/
├── build.gradle.kts
└── settings.gradle.kts
```

## Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (Giraffe or newer)
- JDK 8+
- Android device or emulator running API 24+

### Setup

```bash
git clone https://github.com/MoAbdullahConQ/IOS-Calculator.git
```

1. Open the project in Android Studio and let Gradle sync.
2. Run on an emulator/device via the ▶️ Run button, or:
   ```bash
   ./gradlew installDebug
   ```

## How It Works

When an operator button (`+`, `-`, `×`, `÷`, `%`) is pressed, the app stores the first operand and displays the running expression in a `TextView` above the input. Pressing `=` parses the second operand, evaluates the result, and updates the display. `AC` resets both the input and the expression preview.

## Author

**Muhammed Abdullah**
- GitHub: [@MoAbdullahConQ](https://github.com/MoAbdullahConQ)
- LinkedIn: [muhammed-bn-abdullah](https://linkedin.com/in/muhammed-bn-abdullah)
- Email: muhammed.abdullah.01155849512@gmail.com

## License

This project is licensed under the [MIT License](LICENSE).
