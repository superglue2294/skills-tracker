package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String landingPage() {

        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

    }

    @GetMapping("form")
    public String formPage() {

        return "<html>" +
                "<body>" +
                "<form action='/info' >" +
                "<label for='name' >Name: </label><br>" +
                "<input type='text' name='name' /><br>" +
                "<label for='language1'>My favorite language: </label><br>" +
                "<select name='language1' id='language1' >" +
                "<option value='Java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                "<label for='language2'>My second favorite language: </label><br>" +
                "<select name='language2' id='language2' >" +
                "<option value='Java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                "<label for='language3'>My third favorite language: </label><br>" +
                "<select name='language3' id='language3' >" +
                "<option value='Java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "info")
    public String infoPage(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {

        return "<h1>" + name + "'s favorite languages" + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Order</th>" +
                "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>Favorite</td>" +
                "<td>" + language1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Second Favorite</td>" +
                "<td>" + language2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Third Favorite</td>" +
                "<td>" + language3 + "</td>" +
                "</tr>" +
                "</table>";

    }

}
