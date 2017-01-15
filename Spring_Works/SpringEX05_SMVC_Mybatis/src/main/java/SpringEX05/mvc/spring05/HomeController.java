package SpringEX05.mvc.spring05;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("daum")
	public void daum(){
		
	}
	
	@RequestMapping("naver")
	public void naver(){
		System.out.println("naver con");
	}
	
	@RequestMapping("test")
	public void test(){
		System.out.println("test con");
	}
	
	@RequestMapping("test2")
	public void test2(){
		System.out.println("test2 con");
	}
	
	@RequestMapping(value="search", produces="tetext/plain; charset=UTF-8")
	@ResponseBody
	public Object search(){
		
		System.out.println("search con");
		
		String msg = "메롱";

		return msg;
	}
	
	@RequestMapping(value="test3", method=RequestMethod.POST)
	public String myWorks(){
		
		String res = null;
		
		String url = "https://apis.daum.net/shopping/search";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			//add request header
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			
			String urlParameters = "apikey=24f6cb95e6a56956cde76f82526199bd&q=" 
									+ "가방"//searchItem
									+"&result=20&pageno=3&output=json&sort=min_price";
			
			//Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			
			int responseCode = con.getResponseCode();
			System.out.println("Sending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + urlParameters);
			System.out.println("Response Code : " + responseCode);
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while((inputLine = in.readLine()) != null){
				response.append(inputLine);
			}
			
			in.close();
			System.out.println(response.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "test";
	}
}
