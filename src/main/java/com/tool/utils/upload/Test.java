package com.tool.utils.upload;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/*
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wellhome.emecloudserviceh4.common.UploadFileUtils;
import com.wellhome.emecloudserviceh4.pojo.AuthenImg;*/

public class Test {
	
/*
	
	 * 采用file.Transto 来保存上传的文件
	 
	@RequestMapping(value="fileUpload2"
			,method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws IOException {
		long  startTime=System.currentTimeMillis();
		System.out.println("fileName："+file.getOriginalFilename());
		String path="E:/"+new Date().getTime()+file.getOriginalFilename();

		File newFile=new File(path);
		//通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		file.transferTo(newFile);
		long  endTime=System.currentTimeMillis();
		System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");
		return "/success"; 
	}







	*//**
	 * 
	 * @param request
	 * @param response 多张图片上传(含单张) 
	 * @param model
	 * @return
	 * @author zhangsq
	 *//*
	@RequestMapping("/toUpLoadBacthHmImage.do")
	@ResponseBody 
	public Map<String, Object> toUpLoadBacthHmImage(HttpServletRequest request, 
			HttpServletResponse response,ModelMap model,String tid,@RequestParam("fileImg") MultipartFile[] multipartfiles) 
					throws IllegalStateException, IOException{
		Map<String, Object> map = new HashMap<String, Object>(); 
		HmFile fileBean = hmFileService.findByTidFilesInfo(tid);
	  *//** 得到图片保存目录的真实路径 **//*
		String realpath = properties.getProperty("file.acpath.server");
	   *//** 构建图片保存的目录 **//*
		String filedir =File.separator
				+ SpellUtil.getFirstSpell(fileBean.getFileName());
		String filelocationdir = realpath + filedir;
	    *//** 根据真实路径创建目录 **//*
		File logoSaveFile = new File(filelocationdir);
		if (!logoSaveFile.exists()){
			logoSaveFile.mkdirs();
		}
		 boolean doFlag;
		if(null != multipartfiles && multipartfiles.length > 0){  
			//MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;  
			//List<MultipartFile> iter = multiRequest.getFiles("file");
	        try {
		        for(MultipartFile picFile : multipartfiles){  
            	//MultipartFile picFile = multiRequest.getFile(iter.next());  
		        if(null != picFile && null != picFile.getOriginalFilename()
		                && !"".equals(picFile.getOriginalFilename().trim())
		                && !"null".equals(picFile.getOriginalFilename().trim())){

		        	synchronized(HmFileImageController.this){
		        		String imagename = new SimpleDateFormat("yyyyMMddHHmmss")
		        				.format(new Date()).concat(picFile.getOriginalFilename());
		        		String filename = filelocationdir + File.separator +imagename;
		        		File file = new File(filename);

	        			picFile.transferTo(file);//上传至服务器
	        			//将文件图片插入数据库
	        			HmImage imgBean = new HmImage();
	        			imgBean.setTid(UUIDUtil.getUUID());
	        			imgBean.setHid(tid);

	        			long curTimeStamp = System.currentTimeMillis();
	                    String fileACPath = properties.getProperty("file.acpath.views.server"); 
	                    String spell = SpellUtil.getFirstSpell(fileBean.getFileName());
	                    fileACPath=String.format(fileACPath,spell,imagename,curTimeStamp);

	                    imgBean.setFilePath(fileACPath);
	        			//imgBean.setFilePath(fileACPath.replaceAll("/", "\\\\"));
	        			String tid_insert = hmImagesService.insertSelective(imgBean);//保存在数据库中
	        			hmFileService.updateByTidUpdateTimes(tid);//更新文件夹的时间
	        			map.put("tid_insert", tid_insert);

		        	}
		        }
            }
		        doFlag = true;
	        } catch (IllegalStateException e) {
				e.printStackTrace();
				doFlag = false;
			} catch (IOException e) {
				e.printStackTrace();
				doFlag = false;
			}
            //遍历并保存文件  
	        map.put("result", doFlag);
        }  
		return map;

	}
	     

	public String insertPicPath(HttpSession session,@RequestParam MultipartFile[] graphTheories, HttpServletRequest request) throws Exception {

		List<String> newFileNames=UploadFileUtils.uploadFileList(graphTheories, request);
		List<AuthenImg> graphTheoryList=new ArrayList<AuthenImg>();
		for (String newFileName:newFileNames){
			AuthenImg graphTheory=new AuthenImg();
			graphTheory.setImgUrl(newFileName);

			graphTheoryList.add(graphTheory);
		}
		//authenImgServiceI.save(entity);
		return "success";
	}




	//通过Spring的autowired注解获取spring默认配置的request  

	*//*** 
	 * 保存文件 
	 * @param file 
	 * @return 
	 *//*  
	private boolean saveFile(MultipartFile file, String path) {  
		// 判断文件是否为空  
		if (!file.isEmpty()) {  
			try {  
				File filepath = new File(path);
				if (!filepath.exists()) 
					filepath.mkdirs();
				// 文件保存路径  
				String savePath = path + file.getOriginalFilename();  
				// 转存文件  \




				file.transferTo(new File(savePath));  
				return true;  
			} catch (Exception e) {  
				e.printStackTrace();  
			}  
		}  
		return false;  
	}  

	@RequestMapping(value="/filesUpload"
			,method=RequestMethod.POST,produces="application/json;charset=UTF-8") 
	@ResponseBody
	public String filesUpload(@RequestParam("files") MultipartFile[] files) { 
		String path = "E:/upload/";
		//判断file数组不能为空并且长度大于0  
		if(files!=null&&files.length>0){  
			//循环获取file数组中得文件  
			for(int i = 0;i<files.length;i++){  
				MultipartFile file = files[i];  
				//保存文件  
				saveFile(file, path);  
			}  
		}  
		// 重定向  
		return "redirect:/list.html";  
	}  


*/



}
