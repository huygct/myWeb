package com.huyvn.happytostudy.controllers;

import com.huyvn.happytostudy.model.Role;
import com.huyvn.happytostudy.model.User;
import com.huyvn.happytostudy.services.UserService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nghi Tran on 4/21/2015.
 */

@Controller
@RequestMapping(value = "/protected/user")
public class UserController {
    /*
    API
    /protected/user/userList
     */

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome () {
        return new ModelAndView("userList");
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody
    String listUsersJson() throws JSONException {
        JSONArray userArray = new JSONArray();
        for (User user : userService.findAll()) {
            JSONObject userJSON = new JSONObject();
            userJSON.put("id", user.getId());
            userJSON.put("name", user.getName());
            userJSON.put("email", user.getEmail());
            userArray.put(userJSON);
        }
        return userArray.toString();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody String newUser) {
        // System.out.println(newUser);
        try {
            JSONObject userJSON = new JSONObject(newUser);
            User user = new User();
            user.setEmail(userJSON.getString("email"));
            user.setName(userJSON.getString("name"));
            user.setEnabled("YES");
            user.setPassword("123");
            user.setRole(Role.ROLE_USER);
            User check = userService.save(user);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "redirect:/protected/user";
    }

    @RequestMapping(value = "/deleteUser/{userId}", method=RequestMethod.DELETE)
    public @ResponseBody void deleteUser(@PathVariable("userId") Integer userId) {
        userService.delete(userId);
    }
}
