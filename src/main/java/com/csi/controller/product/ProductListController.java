package com.csi.controller.product;

import com.csi.domain.Product;
import com.csi.service.ProductService;
import com.csi.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService productService=new ProductServiceImpl();
        List<Product> list=productService.list();
        req.setAttribute("list",list);

        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
