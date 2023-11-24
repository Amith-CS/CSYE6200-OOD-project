package edu.neu.csye6200.fbta.service;

import edu.neu.csye6200.fbta.model.Group;

public interface GroupService {
    Group getGroupById(int groupId);

    Group createGroup(Group group);

    Group updateGroup(int groupId, Group group);

    void deleteGroup(int groupId);
}
