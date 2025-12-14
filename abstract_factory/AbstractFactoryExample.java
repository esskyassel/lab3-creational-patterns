interface Button {
    void paint();
}

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows button");
    }
}

class MacButton implements Button {
    public void paint() {
        System.out.println("Mac button");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.paint();
    }
}
