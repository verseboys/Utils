package com.tool.utils.upload;

import java.io.File;
import java.io.IOException;
import java.util.*;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * 
 * @author XHW
 * 
 * @date 2011-7-26
 * 
 */
public class FileUploadServlet extends HttpServlet {

 private static final long serialVersionUID = -7744625344830285257L;
 private ServletContext sc;
 private String savePath;

 public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  doPost(request, response);
 }
 

 public void init(ServletConfig config) {
  // ��web.xml�����õ�һ����ʼ������
  savePath = config.getInitParameter("savePath");
  sc = config.getServletContext();
 }
 
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  request.setCharacterEncoding("UTF-8");
  DiskFileItemFactory factory = new DiskFileItemFactory();
  ServletFileUpload upload = new ServletFileUpload(factory);
  try {
   List items = upload.parseRequest(request);
   Iterator itr = items.iterator();
   while (itr.hasNext()) {
    FileItem item = (FileItem) itr.next();
    if (item.isFormField()) {
     System.out.println("��������:" + item.getFieldName() + "��������ֵ:" + item.getString("UTF-8"));
    } else {
     if (item.getName() != null && !item.getName().equals("")) {
      System.out.println("�ϴ��ļ��Ĵ�С:" + item.getSize());
      System.out.println("�ϴ��ļ�������:" + item.getContentType());
      // item.getName()�����ϴ��ļ��ڿͻ��˵�����·������
      System.out.println("�ϴ��ļ�������:" + item.getName());

      File tempFile = new File(item.getName());

      //�ϴ��ļ��ı���·��
      File file = new File(sc.getRealPath("/") + savePath, tempFile.getName());
      item.write(file);
      request.setAttribute("upload.message", "�ϴ��ļ��ɹ���");
     }else{
      request.setAttribute("upload.message", "û��ѡ���ϴ��ļ���");
     }
    }
   }
  }catch(FileUploadException e){
   e.printStackTrace();
  } catch (Exception e) {
   e.printStackTrace();
   request.setAttribute("upload.message", "�ϴ��ļ�ʧ�ܣ�");
  }
  request.getRequestDispatcher("/uploadResult.jsp").forward(request, response);
 }
}