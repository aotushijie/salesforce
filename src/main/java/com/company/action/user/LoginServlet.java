package com.company.action.user;

import com.alibaba.fastjson.JSON;
import com.company.commons.Results;
import com.company.commons.SpringIOC;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.getWriter().print(username+" "+password);
        UserService userservice = (UserService) SpringIOC.getctx().getBean("userservice");
        Results<User> res=userservice.login(username,password);

        String jsonRes= JSON.toJSONString(res);
        PrintWriter out=response.getWriter();
        out.print(jsonRes);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
