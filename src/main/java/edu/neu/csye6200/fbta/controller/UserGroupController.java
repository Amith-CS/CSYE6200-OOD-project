package edu.neu.csye6200.fbta.controller;

import edu.neu.csye6200.fbta.model.UserGroup;
import edu.neu.csye6200.fbta.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usergroup")
public class UserGroupController {
    @Autowired
    private UserGroupService userGroupService;

    @PostMapping("/addUserToGroup")
    public UserGroup addUserToGroup(@RequestParam int userId, @RequestParam int groupId) {
        return userGroupService.addUserToGroup(userId, groupId);
    }

    @DeleteMapping("/removeUserFromGroup")
    public void removeUserFromGroup(@RequestParam int userId, @RequestParam int groupId) {
        userGroupService.removeUserFromGroup(userId, groupId);
    }
}
