package com.wildevp.app.application.usecases;

import com.wildevp.app.domain.models.Task;
import com.wildevp.app.domain.ports.in.UpdateTaskUseCase;
import com.wildevp.app.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
