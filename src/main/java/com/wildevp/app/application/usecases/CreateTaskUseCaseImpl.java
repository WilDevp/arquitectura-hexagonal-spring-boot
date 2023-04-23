package com.wildevp.app.application.usecases;

import com.wildevp.app.domain.models.Task;
import com.wildevp.app.domain.ports.in.CreateTaskUseCase;
import com.wildevp.app.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.saveTask(task);
    }
}
