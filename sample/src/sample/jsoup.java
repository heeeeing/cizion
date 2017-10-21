package sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class jsoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url = "http://anam.kumc.or.kr/department/treatDoctorList.do?&DP_CODE=AAFM";
			Document doc = Jsoup.connect(url).get(); //웹에서 내용을 가져온다.
			Elements contents = doc.select("ul.viewDoctor.v2.mt10").select(".dr_name").select("strong"); //내용 중에서 원하는 부분을 가져온다.
			
			String text = contents.text(); //원하는 부분은 Elements형태로 되어 있으므로 이를 String 형태로 바꾸어 준다.
			String html = doc.select("ul.viewDoctor.v2.mt10").html(); //원하는 부분을 tag형태 그대로 가져온다 ex:jquery[.html() 같음]
			System.out.println(text);
			//System.out.println(html);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( e.toString() );
		}
	}

}
