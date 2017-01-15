<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
   pageEncoding="UTF-8"%>

      
      <%
         ArrayList<String> listc = new ArrayList();
         listc.add("스프링 @component");
         listc.add("스프링 @service");
         listc.add("스프링 @repository");
         listc.add("스프링 @마이바티스");
         listc.add("스프링 jdbc");
         listc.add("스프링 jdbc dbcp");
         listc.add("jsp dbcp");
         listc.add("jsp jdbc");
         listc.add("jsp jdbc dbcp");
         listc.add("jsp service");
         
         request.setCharacterEncoding("UTF-8");
         String keyword = request.getParameter("key");
         for(String each : listc){
            if(each.contains(keyword)){
               out.println(each + "<br>");
            }
         }
      %>
