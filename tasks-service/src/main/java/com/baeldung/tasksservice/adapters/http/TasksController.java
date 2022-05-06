/****************************************************************************************************************
 *
 *  Copyright (c) 2022 OCLC, Inc. All Rights Reserved.
 *
 *  OCLC proprietary information: the enclosed materials contain
 *  proprietary information of OCLC, Inc. and shall not be disclosed in whole or in
 *  any part to any third party or used by any person for any purpose, without written
 *  consent of OCLC, Inc.  Duplication of any portion of these materials shall include this notice.
 *
 ******************************************************************************************************************/

package com.baeldung.tasksservice.adapters.http;

import com.baeldung.tasksservice.adapters.repository.TaskRecord;
import com.baeldung.tasksservice.service.TasksService;
import com.baeldung.tasksservice.service.UnknownTaskException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class TasksController {
    @Autowired
    private TasksService tasksService;

    @PostMapping
    public void createTask() {}

    @GetMapping
    public void searchTasks() {}

    @GetMapping("/{id}")
    public String getTask(@PathVariable("id") String id) {
        final TaskRecord task = tasksService.getTaskById(id);
        return task.getTitle();
    }

    @DeleteMapping("/{id}")
    public void deleteTask() {}

    @PatchMapping("/{id}")
    public void patchTask() {}

    @ExceptionHandler(UnknownTaskException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleUnknownTask() {}
}
