package edu.neu.csye6200.fbta.service.impl;

import edu.neu.csye6200.fbta.model.Group;
import edu.neu.csye6200.fbta.model.User;
import edu.neu.csye6200.fbta.model.UserGroup;
import edu.neu.csye6200.fbta.repository.GroupRepository;
import edu.neu.csye6200.fbta.repository.UserGroupRepository;
import edu.neu.csye6200.fbta.repository.UserRepository;
import edu.neu.csye6200.fbta.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupRepository userGroupRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public UserGroup addUserToGroup(int userId, int groupId) {
        User user = userRepository.findById(userId).orElse(null);
        Group group = groupRepository.findById(groupId).orElse(null);

        if (user != null && group != null) {
            UserGroup.UserGroupId userGroupId = new UserGroup.UserGroupId();
            userGroupId.setUserId(userId);
            userGroupId.setGroupId(groupId);
            UserGroup userGroup = new UserGroup(userGroupId);
            return userGroupRepository.save(userGroup);
        }

        return null;
    }

    @Override
    public void removeUserFromGroup(int userId, int groupId) {
        userGroupRepository.deleteByUserIdAndGroupId(userId, groupId);
    }
}
