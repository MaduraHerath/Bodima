package com.insane.dev.controller;

import com.insane.dev.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


import com.insane.dev.model.Bodim;


@EnableAsync
@Controller
public class MainController {


    @Autowired
    RestClient restClient;

    private List<Bodim> details = new ArrayList<Bodim>();
    Executor executor = Executors.newSingleThreadExecutor();

    @RequestMapping(value = "/")
    private String getBookDetails() {
        return "home";
    }





    @RequestMapping(value = "/searchresults" ,method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public   void getFiltered( @RequestBody Bodim bodima){
        details = restClient.getFilteredList(bodima);


    }

    @RequestMapping(value = "/searchresults" ,method = RequestMethod.GET)
    private  String showFiltered(ModelMap model ){
        model.addAttribute("bodimList", details);
        return "searchresults";
    }



    @RequestMapping(value = "/bodimList")
    private void getdistrict(@RequestParam(value = "search",required = false)String location) {
        try {
            details = restClient.getBodaimaDetails(location);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    @RequestMapping(value = "/bodimaDetails/{id}", method = RequestMethod.GET)
    public String getBookbyId(@PathVariable("id") int id, Model model) {
        Bodim bodim = restClient.getBookbyId(id);
        model.addAttribute("bodim", bodim);
        return "bodima-details";
    }


//    @RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
//    public String deleteUser(@PathVariable final int id, final ModelMap model) {
//        executorService.execute(new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    restClient.deleteBookbyId(id);
//                    List<Bodim> bodimList = restClient.getBookDetails();
//                    model.addAttribute("bodimList", bodimList);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//        return "redirect:/";
//    }


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



