package com.example.mydemoproject

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = ["/hello-servlet"])
class HelloServlet : HttpServlet() {
    private lateinit var message: String

    override fun init() {
        message = "Hello World!, This is your first program Lalit!!!"
    }

    public override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.contentType = "text/html"

        // Hello
        val out = response.writer
        out.println("<html><body>")
        out.println("<h1>$message</h1>")
        out.println("</body></html>")
    }

    override fun destroy() {
    }
}