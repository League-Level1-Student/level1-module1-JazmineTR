package _06_duck;

public class Monkey {
int numberOfBananas;
String favoriteFruit;

void scream() {
	System.out.println("scream");
}
void chatter() {
	System.out.println("chatter");
}
Monkey(String favoriteFruit, int numberOfBananas){
	this.favoriteFruit = favoriteFruit;
	this.numberOfBananas = numberOfBananas;
}
}
