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

package com.grady.jsp.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @brief: Description the class
 * @author: Grady <yhwei876@gmail.com>
 * @file: SimpleFilter.java
 * @time: 2018-10-21
 * @version: 1.0.0
 */

@WebFilter(filterName = "SimpleFilter", urlPatterns = "/simple")
public final class SimpleFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("Register a new filter: {}", filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String url = request instanceof HttpServletRequest ? ((HttpServletRequest)request).getRequestURL().toString() : "N/A";
        LOGGER.info("URL: {}", url);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        LOGGER.info("Destroy filter {}", getClass().getSimpleName());
    }

}