/*
 * Copyright (C) 2018  Grady
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grady.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @brief:   Simple Servlet
 * @author:  Grady <yhwei876@gmail.com>
 * @file:    SimpleServlet.java
 * @time:    2018-10-20
 * @version: 1.0.0
 */

@WebServlet(
    name="SimpleServlet",
    urlPatterns= {"/simple"},
    initParams={
        @WebInitParam(name="createBy", value="Grady"),
        @WebInitParam(name="createOn", value="2018-10-20"),
    }
)
public class SimpleServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(String.format("Create by %s", getInitParameter("createBy")));
        resp.getWriter().println(String.format("Create on %s", getInitParameter("createOn")));
        resp.getWriter().println(String.format("Servlet context param: %s", req.getServletContext().getAttribute("content")));
    }
}


