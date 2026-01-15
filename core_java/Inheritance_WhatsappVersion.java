package core_java;


	class WAV1 {
	    void chat() {
	        System.out.println("You can chat now");
	    }
	}

	class WAV2 extends WAV1 {
	    void status() {
	        System.out.println("You can add status now");
	    }
	}

	class WAV3 extends WAV2 {
	    void metaAI() {
	        System.out.println("You can use Meta AI now");
	    }
	}

	public class Inheritance_WhatsappVersion {
	    public static void main(String[] args) {
	        WAV3 w3 = new WAV3();
	        w3.chat();
	        w3.status();
	        w3.metaAI();
	        System.out.println("--------------");
	        WAV2 w2 = new WAV2();
	        w2.chat();
	        w2.status();
	        System.out.println("--------------");
	        WAV1 w1 = new WAV1();
	        w1.chat();
	    }
	}


