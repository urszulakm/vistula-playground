package org.vistula.listener;

import java.util.List;

public class Listener {

    String name;
    List<String> skills;

    public Listener() {
    }

    public Listener(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
