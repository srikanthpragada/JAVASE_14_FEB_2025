package lib1;

import java.time.LocalTime;
import java.time.ZoneId;

public class TestLocalTime {

	public static void main(String[] args) {
		 var lt = LocalTime.now();
		 System.out.println(lt);
		 
		 var singTime = LocalTime.now(ZoneId.of("Asia/Dubai"));
		 System.out.println(singTime);

	}

}
