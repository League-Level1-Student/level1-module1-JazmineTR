package _05_vault;

public class SecretAgent {
	Vault neat;
	
	public SecretAgent() {
		neat = new Vault();
	}

	public void findCode() {
		for(int i=0;i<1000001;i++) {
			boolean work = neat.tryCode(i);
			if(work) {
			System.out.println(i);
			return;
			}
		
			
			}
		System.out.println(-1);
			}
		}

