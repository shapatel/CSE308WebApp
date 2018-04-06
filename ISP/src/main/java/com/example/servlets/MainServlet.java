/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Thomas
 */
@WebServlet(
  name = "AnnotationExample",
  description = "Example Servlet Using Annotations",
  urlPatterns = {"/AnnotationExample"}
)
public class MainServlet extends HttpServlet {  
  
    protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
  
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Hello World!</p>");
    }
    
    @GetMapping("/texts")
    public String texts(@RequestParam(name = "name",required=false,defaultValue="World") String name, Model model){
        model.addAttribute("name",name);
        return "textlog";
    }
}