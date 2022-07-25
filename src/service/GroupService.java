package service;

import model.Group;
import model.Student;
import repository.GroupRepository;

import java.util.ArrayList;

public class GroupService {
    private GroupRepository groupRepository;
    private Group group;

    public GroupService (GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }
    public void addGroups (ArrayList <Group> newGroups){
        newGroups.forEach(System.out::println);
        groupRepository.addGroups(newGroups);
    }
    public void removeGroups (ArrayList <Group> removeGroups) {
        removeGroups.forEach(System.out::println);
        groupRepository.removeGroups(removeGroups);
    }
}
