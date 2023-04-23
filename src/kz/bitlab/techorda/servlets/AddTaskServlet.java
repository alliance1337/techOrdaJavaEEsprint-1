package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.Task;
import kz.bitlab.techorda.db.DBManager;

import java.io.IOException;

@WebServlet(value = "/add-task")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("book_name");
        String price = request.getParameter("book_price");
        String description = request.getParameter("book_description");
        String deadlineDate = request.getParameter("task_deadlineDate");
        String isCompleted = request.getParameter("task_isCompleted");


        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setDeadlineDate(deadlineDate);
        task.setIsCompleted(isCompleted);

        DBManager.addBook(task);

        response.sendRedirect("/");

    }
}
