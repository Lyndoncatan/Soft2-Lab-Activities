import java.util.List;
import java.util.ArrayList;

// Interface for AttackStrategy
interface AttackStrategy {
    void attack();
}

// Interface for DefenseStrategy
interface DefenseStrategy {
    void defend();
}

// Concrete implementations of AttackStrategy
class SwingSword implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}

class CastSpell implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}

class ShootArrow implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}

// Concrete implementations of DefenseStrategy
class Shield implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
}

class Dodge implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Dodging to avoid attack!");
    }
}

class CreateMagic implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Creating a magic barrier for defense!");
    }
}

// Character class using Strategy pattern
class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy defense : defenseStrategies) {
            defense.defend();
        }
    }

    // Getter for type (optional, for demonstration)
    public String getType() {
        return type;
    }
}

// Example usage (can be in a main class)
public class GameApp {
    public static void main(String[] args) {
        // Knight: SwingSword, Shield, Dodge, CreateMagic
        List<DefenseStrategy> knightDefenses = new ArrayList<>();
        knightDefenses.add(new Shield());
        knightDefenses.add(new Dodge());
        knightDefenses.add(new CreateMagic());
        Character knight = new Character("Knight", new SwingSword(), knightDefenses);

        // Wizard: CastSpell, CreateMagic
        List<DefenseStrategy> wizardDefenses = new ArrayList<>();
        wizardDefenses.add(new CreateMagic());
        Character wizard = new Character("Wizard", new CastSpell(), wizardDefenses);

        // Archer: ShootArrow, Dodge
        List<DefenseStrategy> archerDefenses = new ArrayList<>();
        archerDefenses.add(new Dodge());
        Character archer = new Character("Archer", new ShootArrow(), archerDefenses);

        // Demonstrate behaviors
        System.out.println("Knight:");
        knight.attack();
        knight.defend();

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();

        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}