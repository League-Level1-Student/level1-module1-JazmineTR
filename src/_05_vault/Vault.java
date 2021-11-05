package _05_vault;

import java.util.Random;

public class Vault {
int secretCode;
Random ran = new Random();
public Vault() {
	secretCode= ran.nextInt(1000001);
}
public boolean tryCode(int code) {
	if(secretCode == code) {
		return true; 
			
		}
	else {
		return false;
	}
}
}
