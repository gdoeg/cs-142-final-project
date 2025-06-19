# 🐾 Predator-Prey Ecosystem Simulation

This is a Java-based simulation that models a simplified ecosystem with **rabbits**, **wolves**, and **grass** in a 2D grid. The simulation runs in a graphical user interface and animates the interactions over time.

---

## 🧠 Project Description

This simulation visualizes how different species interact in a dynamic ecosystem:

- **Rabbits** move randomly, eat grass, and reproduce when they have enough energy.
- **Wolves** hunt rabbits to survive and reproduce.
- **Grass** grows back over time in empty cells.

The simulation allows users to run and reset the world using GUI buttons, with all activity visualized as a grid animation.

---

## 🗂️ Class Hierarchy

This project uses an object-oriented inheritance structure with three levels and six+ classes:

### 🌳 Base Class
- **Organism**
  - Abstract class representing any grid inhabitant.
  - Methods: `act(Grid)`, `getColor()`

### 🌱 Plants
- **Plant** (extends `Organism`)
  - Abstract class for edible vegetation.
  - Subclass: `Grass`

- **Grass**
  - Regrows over time.
  - Eaten by rabbits.

### 🐾 Animals
- **Animal** (extends `Organism`)
  - Can move, lose energy, and die.
  - Subclasses: `Prey`, `Predator`

- **Prey** (extends `Animal`)
  - Eats grass and reproduces.
  - Subclass: `Rabbit`

- **Predator** (extends `Animal`)
  - Hunts prey and reproduces.
  - Subclass: `Wolf`

---

## 🧩 Core Classes

| Class         | Description |
|---------------|-------------|
| `Organism`    | Abstract superclass for all grid entities. |
| `Grass`       | Regrows over time and is eaten by rabbits. |
| `Rabbit`      | Moves randomly, eats grass, and reproduces. |
| `Wolf`        | Seeks out rabbits, eats them, and reproduces. |
| `Grid`        | Maintains the 2D grid and updates organism states. |
| `SimulationFrame` | Main JFrame with start, pause, and reset buttons. |
| `Gui`         | Paints the grid and animates the simulation. |

---

## 🚀 How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/gdoeg/cs-142-final-project.git
   cd cs-142-final-project
