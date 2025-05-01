/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.ch07.file_upload;

/**
 *
 * @author Haruki
 */
//jakarta 라이브러리
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// Java 기본 라이브러리
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

// Apache Commons FileUpload 라이브러리
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;

@WebServlet(name = "Upload2Servlet", urlPatterns = {"/ch07/FileUpload2/upload2.do"})
public class Upload2Servlet extends HttpServlet {

    private final String UPLOAD_DIR = "WEB-INF/upload/";
    private final String UPLOAD_TEMP_DIR = "WEB-INF/temp";
    private final int MAX_MEMORY_SIZE = 10 * 1024 * 1024;
    private final int MAX_UPLOAD_SIZE = 10 * 1024 * 1024;

    private void checkFolder(String baseFolder) {
        System.out.println("baseFolder= " + baseFolder);

        File uf = new File(baseFolder + UPLOAD_DIR);
        if (!uf.exists()) {
            uf.mkdir();
        }

        File tf = new File(baseFolder + UPLOAD_TEMP_DIR);
        if (!tf.exists()) {
            tf.mkdir();
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String currentFolder = this.getServletContext().getRealPath("/");
            out.println("current path = " + currentFolder + " <br>");

            if (currentFolder.matches(".*\\.*")) {
                currentFolder = currentFolder.replace("\\", "/");
            }
            checkFolder(currentFolder);

            request.setCharacterEncoding("UTF-8");

            File tempDir = new File(currentFolder + UPLOAD_TEMP_DIR);
            if (!tempDir.exists()) {
                tempDir.mkdirs();
            }

            DiskFileItemFactory.Builder factoryBuilder = DiskFileItemFactory.builder()
                    .setBufferSize(MAX_MEMORY_SIZE)
                    .setPath(tempDir.toPath());

            DiskFileItemFactory diskFactory = factoryBuilder.get();

            JakartaServletFileUpload upload = new JakartaServletFileUpload(diskFactory);
            upload.setFileSizeMax(MAX_UPLOAD_SIZE);
            upload.setSizeMax(MAX_UPLOAD_SIZE);

            try {
                List<FileItem> fileItems = upload.parseRequest(request);
                Iterator<FileItem> i = fileItems.iterator();

                while (i.hasNext()) {
                    FileItem fi = i.next();
                    out.printf("Content type: %s, ", fi.getContentType());
                    if (fi.isFormField()) {
                        out.printf("Field name = %s", fi.getFieldName());
                        out.printf(": %s<br>", fi.getString(StandardCharsets.UTF_8));
                    } else {
                        String fileName = fi.getName();
                        if (fileName != null && !fileName.equals("")) {
                            out.printf("File name = %s <br>", fi.getName());
                            File file = new File(currentFolder + UPLOAD_DIR + fileName);
                            out.printf("파일 저장 경로 = %s <br>", file.getCanonicalPath());

                            fi.write(Path.of(currentFolder + UPLOAD_DIR + fileName));
                        } else {
                            out.println("파일 이름이 없습니다.");
                        }
                    }
                }
            } catch (Exception ex) {
                out.println("Cannot upload file:" + ex);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo(){
        return "Short description";
    }
    
}

