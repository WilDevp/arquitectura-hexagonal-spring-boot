package com.wildevp.app.domain.ports.in;

import com.wildevp.app.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
