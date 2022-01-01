
public class Mix4Test {
	
	

	public static void main(String[] args) {
		
		
		int count = 0;
		
		Mix4[] m4a = new Mix4[20];
		int x = 0;
		
		while (x < 19) {
			
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1;
			count = count + m4a[x].maybeNew(x) ;
			
			x++;
		}
		
		
		
		
		System.out.println( count + " " + m4a[1].counter);
	
	}
	
	

}
