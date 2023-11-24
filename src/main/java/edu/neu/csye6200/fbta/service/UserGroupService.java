package edu.neu.csye6200.fbta.service;

import edu.neu.csye6200.fbta.model.UserGroup;

public interface UserGroupService {
    UserGroup addUserToGroup(int userId, int groupId);

    void removeUserFromGroup(int userId, int groupId);
}
