import java.util.Scanner;
public class flames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter G's Name: ");
		String gname = sc.nextLine().toUpperCase();
		System.out.println("Enter B's Name: ");
		String bname = sc.nextLine().toUpperCase();
		
		StringBuilder name1 = new StringBuilder(gname);
		StringBuilder name2 = new StringBuilder(bname);
		for(int i =0;i<gname.length();i++) {
			for(int j=0;j<bname.length();j++) {
				if(name1.charAt(i)==(name2.charAt(j))) {
					name1.replace(i,i+1,"#");
					name2.replace(j,j+1,"#");
				}
			}
		}
		
		String tempG = name1.toString();
		String tempB = name2.toString();
		String firstName = tempG.replace("#","");
		String secondName = tempB.replace("#","");
		String fname = firstName+secondName;
		
		int fcount = fname.length();
		StringBuilder flames = new StringBuilder("FLAMES");
		String result = "";
		
		while(flames.length()!=1) {
			int index = fcount%flames.length();
			if(index!=0) {
				result = flames.substring(index)+flames.substring(0,index-1);
			}
			else
				result = flames.substring(0,flames.length()-1);
			flames = new StringBuilder(result);
		}
		 switch(result.charAt(0))
	        {
	            case 'F':
	                System.out.println("Friends");
	                break;
	            case 'L':
	                System.out.println("Love");
	                break;
	            case 'A':
	                System.out.println("Affection");
	                break;
	            case 'M':
	                System.out.println("Marriage");
	                break;
	            case 'E':
	                System.out.println("Enemy");
	                break;
	            case 'S':
	                System.out.println("Sibling");
	                break;        
	        }
	}
}