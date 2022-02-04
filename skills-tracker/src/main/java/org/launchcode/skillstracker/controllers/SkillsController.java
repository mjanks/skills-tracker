package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String home() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String processForm(@RequestParam String name, @RequestParam String fav1,
                              @RequestParam String fav2, @RequestParam String fav3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h3>1. " + fav1 + "</h3>" +
                "<h3>2. " + fav2 + "</h3>" +
                "<h3>3. " + fav3 + "</h3>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post' >" +
                "<h3>Name:</h3>" +
                "<input type = 'text' name = 'name' >" +
                "<h3>My favorite language:</h3>" +
                "<select name = 'fav1' id = 'fav1' >" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<h3>My second favorite language:</h3>" +
                "<select name = 'fav2' id = 'fav2' >" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<h3>My third favorite language:</h3>" +
                "<select name = 'fav3' id = 'fav3' >" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br><br>" +
                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}