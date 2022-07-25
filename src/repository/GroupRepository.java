package repository;

import model.Group;

import java.util.ArrayList;

public class GroupRepository {
    private ArrayList <Group> groups = new ArrayList<>();
    Group group;

    public void addGroups (ArrayList <Group> newGroups){
        groups.addAll(newGroups);
    }
    public void removeGroups (ArrayList <Group> removeGroups){
        groups.remove(removeGroups);
    }

    public ArrayList <Group> getGroups() {
        return groups;
    }
    public void groupInfo() {
        System.out.println ("Name of group: " + group.getName());
        System.out.println ("Course: " + group.getCourse());
    }
}
