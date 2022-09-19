package stringsDemo;

public class main {

	public static void main(String[] args) {
		String message = " Bugün hava çok güzel ";
		System.out.println(message);
		System.out.println("eleman sayısı: "+ message.length());
		System.out.println("5. eleman: " +message.charAt(4));
		String message2= message.concat(" yaşasın");
		System.out.println(message2);
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("l"));
		char[]characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("a"));
		String noBlankMessage = message.replace(' ', '_');
		System.out.println(noBlankMessage);
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,5));
		for (String splittedMessage:message.split(" ")) {
		System.out.println(splittedMessage);
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		}

	}

}
