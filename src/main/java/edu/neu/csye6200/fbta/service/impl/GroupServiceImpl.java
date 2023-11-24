package edu.neu.csye6200.fbta.service.impl;

import edu.neu.csye6200.fbta.model.Group;
import edu.neu.csye6200.fbta.repository.GroupRepository;
import edu.neu.csye6200.fbta.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group getGroupById(int groupId) {
        return groupRepository.findById(groupId).orElse(null);
    }

    @Override
    public Group createGroup(Group group) {
        // Implement validation or additional logic as needed
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(int groupId, Group group) {
        // Implement validation or additional logic as needed
        group.setId(groupId);
        return groupRepository.save(group);
    }

    @Override
    public void deleteGroup(int groupId) {
        groupRepository.deleteById(groupId);
    }
}
