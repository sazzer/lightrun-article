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

package com.baeldung.tasksservice.service;

import javax.persistence.EntityNotFoundException;

import com.baeldung.tasksservice.adapters.repository.TaskRecord;
import com.baeldung.tasksservice.adapters.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksService {
    @Autowired
    private TasksRepository tasksRepository;

    public TaskRecord getTaskById(String id) {
        return tasksRepository.findById(id).orElseThrow(() -> new UnknownTaskException(id));
    }
}
