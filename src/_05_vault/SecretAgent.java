package _05_vault;

public class SecretAgent {
	Vault neat= new Vault();

	public void findCode() {
		for(int i=0;i<1000001;i++) {
			neat.tryCode(i);
			if(neat.equals(true)) {
			System.out.println(i);
			}
			else {
				System.out.println(-1);
			}
			}
		}
}
