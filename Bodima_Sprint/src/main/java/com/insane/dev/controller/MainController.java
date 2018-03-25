package com.insane.dev.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.insane.dev.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import com.insane.dev.model.Bodim;
@Controller
public class MainController {


    @Autowired
    RestClient restClient;

    ExecutorService executorService = Executors.newCachedThreadPool();

    @RequestMapping(value = "/")
    private String getBookDetails(ModelMap model) {
        List<Bodim> details = restClient.getBookDetails();
        model.addAttribute("bookList", details);
        return "home";
    }


    @RequestMapping(value = "/bodims")
    private String getAllBodims(ModelMap model) {
        List<Bodim> details = restClient.getBookDetails();
        model.addAttribute("bodimList", details);
        return "searchresults";
    }



    @RequestMapping(value = "/bodimaDetails/{id}", method = RequestMethod.GET)
    public String getBookbyId(@PathVariable("id") int id, Model model) {
        Bodim bodim = restClient.getBookbyId(id);
        model.addAttribute("bodim", bodim);
        return "bodima-details";
    }


    @RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable final int id, final ModelMap model) {
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    restClient.deleteBookbyId(id);
                    List<Bodim> bodimList = restClient.getBookDetails();
                    model.addAttribute("bodimList", bodimList);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        return "redirect:/";
    }


    @RequestMapping(value = "/addbodima/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> addbodima(@RequestBody Bodim bodim)
    {
        restClient.addBook(bodim);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    private String addBodim() {
        return "addbodima";
    }

}



