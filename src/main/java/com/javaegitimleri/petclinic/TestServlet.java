package com.javaegitimleri.petclinic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


 @WebServlet("/TestServlet")
 public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TestServlet(){
        super();
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     }

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
     }


     //BURASI EKSİK OLABİLİR EVDE KONTROL ETMEYİ UNUTMA!
 }