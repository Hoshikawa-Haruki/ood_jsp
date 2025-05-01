/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.ch07.file_download;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Haruki
 */
@WebServlet(name = "DownloadServlet", urlPatterns = {"/ch07/FileDownload/download.do"})
public class DownloadServlet extends HttpServlet {

    private final Logger logger = LoggerFactory.getLogger(DownloadServlet.class);

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/octet-stream");
        try {
            request.setCharacterEncoding("UTF-8");

            String selectedFile = request.getParameter("D1");
            String targetDirectory = request.getParameter("AbsolutePath");

            File f = new File(targetDirectory + "/" + selectedFile);
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);

            String encodedFileName = URLEncoder.encode(selectedFile, StandardCharsets.UTF_8.toString()).replace("+", "%20");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + encodedFileName + "\"");
            ServletOutputStream sos = response.getOutputStream();
            while (bis.available() > 0) {
                sos.write(bis.read());
            }
            sos.flush();
            sos.close();
            bis.close();
            fis.close();
        } catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("오류 발생 : " + ex.getMessage());
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
