
public class AnonymousInnerType {

	public static void main(String[] args) {
		Time ww = new Time() {

			@Override
			public void displaywatch() {
				System.out.println("implemented the anonymous inner type");
				
			}

			@Override
			public void displaytime() {
				System.out.println("displaying time from the inner type");
				
			}
			
		};
		ww.displaywatch();
		ww.displaytime();
		Time.staticmethod();

	}

}
