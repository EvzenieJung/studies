package com.studies.studies.designPatterns.behavioral.observer;

import org.springframework.util.StringUtils;

public class Editor {

    public EventManager events = new EventManager("save", "open", "close");
    String file = "";

    public void openFile(String fileName) {
        this.file = fileName;
         events.notify("open", file);
    }

    void saveFile() {
        if (StringUtils.hasLength(file)) {
            events.notify("save", file);
        }
    }
}
