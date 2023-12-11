package com.server.httpserver.dao;

import java.util.Objects;

public class Todo {
    private String task;

    public Todo() {
    }

    public Todo(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "task='" + task + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(task, todo.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task);
    }
}
