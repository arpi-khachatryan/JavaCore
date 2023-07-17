package classwork.patterns.observer;

import java.io.File;

// Concrete publisher class that contains business logic
public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        // Save file logic
        events.notify("save", file.getName());
    }
}
