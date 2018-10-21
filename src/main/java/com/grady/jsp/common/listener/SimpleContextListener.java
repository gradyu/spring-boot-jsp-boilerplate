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

package com.grady.jsp.common.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @brief:   Description the class
 * @author:  Grady <yhwei876@gmail.com>
 * @file:    SimpleContextListener.java
 * @time:    2018-10-21
 * @version: 1.0.0
 */

@WebListener
public final class SimpleContextListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleContextListener.class);
    private static final String INITIALIZE_CONTENT = "Content create in servlet Context";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Start to initialize servlet context");
        ServletContext cxt = sce.getServletContext();
        cxt.setAttribute("content", INITIALIZE_CONTENT);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("Destroy servlet context");
	}

}
