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

package com.grady.jsp.index;

import java.util.Date;

import com.grady.jsp.common.BaseController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @brief:   Application index controller
 * @author:  Grady <yhwei876@gmail.com>
 * @file:    IndexController.java
 * @time:    2018-10-20
 * @version: 1.0.0
 */

@Controller
public final class IndexController extends BaseController {

    @Value("${application.message:Hello World!}")
    private String message = "Hello world";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", message);
        return "index";
    }
}

