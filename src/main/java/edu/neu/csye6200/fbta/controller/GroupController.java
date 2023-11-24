package edu.neu.csye6200.fbta.controller;

import edu.neu.csye6200.fbta.model.Group;
import edu.neu.csye6200.fbta.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/{groupId}")
    public Group getGroupById(@PathVariable int groupId) {
        return groupService.getGroupById(groupId);
    }

    @PostMapping
    public Group createGroup(@RequestBody Group group) {
        return groupService.createGroup(group);
    }

    @PutMapping("/{groupId}")
    public Group updateGroup(@PathVariable int groupId, @RequestBody Group group) {
        return groupService.updateGroup(groupId, group);
    }

    @DeleteMapping("/{groupId}")
    public void deleteGroup(@PathVariable int groupId) {
        groupService.deleteGroup(groupId);
    }
}
