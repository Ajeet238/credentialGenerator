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

	String generate(String str, int size) {
		String result;
		int ran1 = 1 + ran.nextInt(size);
		int ran2 = 1 + ran.nextInt(size);
		if (ran1 > ran2) {
			result = str.substring(ran2, ran1);
		} else {
			result = str.substring(ran1, ran2);
		}
		return result;
	}

	String generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String charc = "@!#$_-&";
		int charcSize = charc.length();

		String password = generate(upper, 26) + generate(lower, 26) + generate(num, 10) + generate(charc, charcSize);

// shuffling the password
		char[] charArray = password.toCharArray();
		List<Character> li = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			li.add(charArray[i]);
		}
		Collections.shuffle(li);
		String finalPassword = "";
		for (int i = 0; i < li.size(); i++) {
			finalPassword += li.get(i);
		}
		return finalPassword;

	}

	void showCredential(String fName, String lName, String dep) {
		String fullName = fName + lName;
		generateEmailAddress(fullName, dep);
		System.out.println("Dear " + fName + " Your generated credential are as follows");
		System.out.println("Email ----> " + email);
		System.out.println("Password ----> " + generatePassword());

	}
}
