package controllers;

import java.util.List;

import models.Todo;
import play.mvc.Controller;

public class TodoController extends Controller {

    public static void index() {
    	List<Todo> todos = Todo.findAll();
        render(todos);
    }

}
