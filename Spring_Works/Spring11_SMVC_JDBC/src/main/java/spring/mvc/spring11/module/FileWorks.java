package spring.mvc.spring11.module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileWorks {
	
	private String upfilePath = "C:\\Users\\SeongkwonMac\\Desktop\\Spring_Works"
			+ "\\Spring11_SMVC_JDBC\\src\\main\\webapp\\resources\\files";
	
	public String uploadAndGetSysName(MultipartFile upfile){
		
		if(upfile.isEmpty()){
			return null;
		}
		
		String orgName = upfile.getOriginalFilename();
		String sysName = orgName;
		
		File uploadFile = new File(upfilePath + "\\" + orgName); // 파일이 있는 존재하는지 검사 하는 과정
		
		int addNum = 1;
		while(uploadFile.exists()){
			String extName = sysName.substring(sysName.lastIndexOf(".")); // 확장자 이름 확보
			String fName = sysName.substring(0, sysName.lastIndexOf(".")); // 파일 이름 확보
			
			if(fName.contains("_")){
				fName = fName.substring(0, fName.lastIndexOf("_"));
			}
			
			sysName = fName + "_" + addNum + extName;
			
			uploadFile = new File(upfilePath + "\\" + sysName);
		}
		System.out.println("sysName Comp : " + sysName);
		
		try{
			byte[] byteArrays = upfile.getBytes();
			
			OutputStream os = new FileOutputStream(uploadFile);
			os.write(byteArrays);
			os.close();
			// 저장 완료
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return sysName; // 확정된 파일 이름 전송
	}

	public void download(String orgName, String sysName, HttpServletResponse response) {
		
		try{
			String encOrgName = URLEncoder.encode(orgName, "UTF-8");
			
			response.setHeader("Content-Disposition", "attachment;filename=" + encOrgName);
			
			InputStream is = new FileInputStream(upfilePath + "\\" + sysName);
			
			ServletOutputStream sos = response.getOutputStream();
			int data = 0;
			while( (data = is.read()) != -1){
				sos.write(data);
				sos.flush();
			}
			sos.close();
			is.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void delete(String sysName) {
		
		File delFile = new File(upfilePath + "\\" + sysName);
		
		if(delFile.exists()){
			delFile.delete();
		}
	}
	
	
}
