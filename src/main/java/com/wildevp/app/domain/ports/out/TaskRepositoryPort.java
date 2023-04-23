package com.wildevp.app.domain.ports.out;

import com.wildevp.app.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task saveTask(Task task);
    Optional <Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
