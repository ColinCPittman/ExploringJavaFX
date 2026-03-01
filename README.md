A modular app built to explore JavaFX GUI development, MVC design patterns, and event-driven state management.

## Project eatures
- A calculator with a JavaFX GUI which supports standard math operations with a persistent `CalculationList` to maintain state and history across multiple inputs.
- A standalone module for basic document manipulation and text processing.
- An interactive graphical tool demonstrating dynamic UI updates and controller-based event handling.
- A home-screen controller to handle switching between tools within a single application instance.

## Project Features
- Separates application logic from presentation using FXML layouts and modular Java controllers.
- Implements custom ```HistoryListener``` patterns to decouple data management from the UI display.
- Managed with Maven for tracking and project automation.

## Getting Started
- Java 17+, JavaFX 17+
- Maven

```bash
git clone [https://github.com/ColinCPittman/ExploringJavaFX.git](https://github.com/ColinCPittman/ExploringJavaFX.git)
cd ExploringJavaFX
mvn javafx:run
