package com.google.servlets;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

/** Servlet responsible for creating new advice */
@WebServlet("/new-advice")
public class NewAdviceServlet extends HttpServlet {
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
}

// Modify your servlet file to take the data entered by users in your "contact me" 
// form and store it as an entity in Datastore. Get this working before you worry about loading the data.