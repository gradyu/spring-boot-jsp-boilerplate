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

package com.grady.jsp.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @brief:   Description the class
 * @author:  Grady <yhwei876@gmail.com>
 * @file:    DefaultExceptionHandler.java
 * @time:    2018-10-21
 * @version: 1.0.0
 */

@RestControllerAdvice
public final class DefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exception() {
        return "An exception occurred!";
    }
}
