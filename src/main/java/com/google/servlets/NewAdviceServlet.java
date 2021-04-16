package com.google.servlets;
// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Takes an image submitted by the user and uploads it to Cloud Storage, and then displays it as
 * HTML in the response.
 */
@WebServlet("/advice")
@MultipartConfig
public class NewAdviceServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Get the form data entered by the user.
    String username = request.getParameter("user-name");
    String university = request.getParameter("university");
    String major = request.getParameter("major");
    String grade = request.getParameter("grade");
    String advice = request.getParameter("advice");


    // Output the form HTML that shows the data the user entered.
    PrintWriter out = response.getWriter();
    out.println("<p>Username:</p> " + username);
    out.println("<p>University:</p>" + university);
    out.println("<p>Major:</p>" + major);
    out.println("<p>Grade:</p>" + grade);
    out.println("<p>Advice:</p>" + advice);
  }

  
}