package stringassigmnent;

public class StringTypeDemo {
	
	public static void main(String[] args) {
		String str = "Hello";
		long startTime = System.currentTimeMillis();
		for(int i =0; i < 10000; i++) {
			str = str + "World";
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	
	
	
	
	StringBuffer stringBuffer = new StringBuffer("Hello");
	
	startTime = System.currentTimeMillis();
	 for(int i = 0; i < 10000; i++) {
		 stringBuffer.append("World");
	 }
	 endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			 stringBuilder.append("World");
		 }
		 endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime);
		
			
			String immutableString = "Immutable";
			String modifiedString = immutableString + "String";
			
			System.out.println("Orignal String " + immutableString);
			System.out.println("Modified String " + modifiedString );
			
			
			StringBuffer mutable = new StringBuffer("Mutable");
			mutable.append("StringBuffer");
			System.out.println(mutable);
			
			StringBuilder mutableBuilder = new StringBuilder("Mutable");
			mutableBuilder.append("StringBuilder");
			System.out.println(mutableBuilder);
			
}
}
