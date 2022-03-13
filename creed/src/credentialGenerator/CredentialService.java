package credentialGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CredentialService {
	String email, password;
	static String company = "abc";;

	void generateEmailAddress(String fullName, String dep) {
		email = fullName + "@" + dep.replaceAll("\\s", "") + "." + company + ".com";
	}

	Random ran = new Random();
	String selectTwoChar(String str, int size) {
		int ran1 =  ran.nextInt(size);
		int ran2 =  ran.nextInt(size);
		char c1 =  str.charAt(ran1);
		char c2 =  str.charAt(ran2);
		String res = Character.toString(c1) + Character.toString(c2);
		return res;
	}
 
	String generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String charc = "@!#$_-&";
		int charcSize = charc.length();

		String password = selectTwoChar(upper, 26) + selectTwoChar(lower, 26) + selectTwoChar(num, 10) + selectTwoChar(charc, charcSize);
		return password;
	}

	void showCredential(String fName, String lName, String dep) {
		String fullName = fName + lName;
		generateEmailAddress(fullName, dep);
		System.out.println("Dear " + fName + " Your generated credential are as follows");
		System.out.println("Email ----> " + email);
		System.out.println("Password ----> " + generatePassword());

	}
}
