public class KronometreThread implements Runnable {
	
	private Thread thread;		// Thread oluşturmadık aşağıda oluşturuyoruz.		// run() metodunun çalışabilmesi için Thread sınıfındaki start() metoduna ihtiyacımız vardır.
	
	private String threadname;		// Java threadleri çalıştırabilmek ve birbirlerinden ayırt edebilmek için isimlerinden yararlanır

	
	public KronometreThread(String threadname) {
		
		this.threadname = threadname;
		
	}
	
	@Override
	public void run() {
		
		// run metodu threadin kendisidir... runnable isimli interfacein içinde yer alır.
		try {
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(threadname + "çalışıyor" + i);
				
				thread.sleep(1000);
		}
			
		}catch(InterruptedException e) {
			
			System.out.println("Kesildi." + threadname);
			
		}
		
		System.out.println("Thread bitti." + threadname);
		
	}
	
	public void start() {					
		
		System.out.println("Thread nesnesi oluşuyor.");
		
		if(thread == null) {								// burada bu fonksiyonla Thread oluşturuyoruz...
															// thread oluşturmazsak threadleme yapamayız
			thread = new Thread(this,threadname);			// class(thread) ı çalıştırabilmek ve onu oluşturabilmek için onu new lememiz gerek.
			
			thread.start();
			
		}
		
	}
	
	

}
