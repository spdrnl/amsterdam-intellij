# Features Backlog for Amsterdam IntelliJ Plugin

This document outlines ideas and features that contribute to a "fantastic" IntelliJ code editor plugin, categorized by their impact on developer experience.

## 1. Core Editor Experience (Essential)
- [x] **Semantic Highlighting**: Go beyond basic keyword coloring. Highlight different types of identifiers (e.g., classes vs. properties) with distinct styles.
- [x] **Smart Code Completion**: 
    - Suggest valid keywords based on context (e.g., only suggest `subClassOf` inside a `Class` definition).
    - Suggest already defined Classes, Properties, and Individuals (by ID and `rdfs:label`).
    - Support for CURIE completion based on defined prefixes.
- [x] **Error Highlighting & Quick Fixes**:
    - Real-time validation of syntax and basic semantics (e.g., undefined prefix usage).
    - Provide "Intention Actions" (Alt+Enter) to fix common errors automatically (e.g., "Add missing prefix declaration").
- [x] **Find Usages & Navigation**:
    - `Ctrl+Click` (Go to Declaration) for classes, properties, and prefixes.
    - `Alt+F7` (Find Usages) to see where a specific entity is used across the project.
- [x] **Refactoring Support**:
    - **Rename Refactoring**: Safely rename a class or property and update all its occurrences in the project.

## 2. Navigation & Structure (User Efficiency)
- [x] **Breadcrumbs**: Display the current context (e.g., `Ontology > Class :Person`) at the bottom of the editor.
- [x] **File Structure Enhancement**: (Already partially implemented) Improve icons and sorting. Add filtering to 
  the structure view (e.g., "Hide Prefixes").
- [x] **Go to Symbol**: `Ctrl+Alt+Shift+N` to quickly jump to any class or property, property, etc. definition in the 
  project.

## 3. Advanced Language Support (The "Fantastic" Part)
- [x] **Documentation Tooltips**: Show RDFS labels or comments in a pop-up when hovering over an identifier.
- [x] **Inlay Hints**: Show resolved IRIs next to CURIEs or show inferred types.
- [x] **Formatting & Code Style**: A dedicated `Code Style` settings page and a formatter (`Ctrl+Alt+L`) that 
  follows configurable rules (indentation, blank lines between axioms).
- [x] **Live Templates**: Snippets for common patterns (e.g., typing `class` expands to a full class template with 
  annotations).
- [x] **Breadcrumbs & Progress Bar**: Visual feedback for long-running operations (like background reasoning).

## 4. Integration & Ecosystem
- [ ] **Reasoning Integration**: Integrate with Pellet, HermiT, or Openllet to provide real-time consistency checking and inference directly in the IDE.
- [ ] **Import Management**: Automatically handle imports/prefixes from other `.ams` files or online ontologies.
- [ ] **Visualizer**: A side-panel or tool window that shows a graph representation of the ontology relationships.

## 5. Polish & Delight
- [ ] **Custom Splash Screen/Iconry**: High-quality, theme-aware icons for all file types and elements.
- [ ] **Welcome/Getting Started Guide**: A custom notification or tool window for first-time users.
- [ ] **Localized Messages**: Support for multiple languages in error messages and UI.
