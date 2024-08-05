// Write your code here
package com.example.todo.repository;

import com.example.todo.model.Todo;

import java.util.ArrayList;

public interface TodoRepository {

    ArrayList<Todo> getTodos(); 

    Todo addTodo(Todo todo); 

    Todo getTodoById(int id);

    Todo updateTodo(int id, Todo todo);

    void deleteTodo(int id);
}