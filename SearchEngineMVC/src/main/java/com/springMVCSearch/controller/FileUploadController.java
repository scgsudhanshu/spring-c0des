package com.springMVCSearch.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController 
{
	@RequestMapping("/Fileform")
	public String UploadForm()
	{
		return "Fileform";
	}
	
	@RequestMapping(path="/imageUpload" , method=RequestMethod.POST)
	public String UploadImage(@RequestParam("profile") CommonsMultipartFile file , HttpSession s,Model model) throws IOException
	{
		System.out.println("Image Uploaded");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getOriginalFilename());
		
		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"
		+File.separator+file.getOriginalFilename();
		System.out.println("path -> "+path);
		
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file Uploaded");
		model.addAttribute("msg","File Uploaded ");
		model.addAttribute("filename",file.getOriginalFilename());
		return "filesuccess";
	}
}
