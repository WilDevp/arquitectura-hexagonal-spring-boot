package com.wildevp.app.domain.ports.in;

import com.wildevp.app.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
