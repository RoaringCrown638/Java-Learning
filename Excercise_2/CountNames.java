package Excercise_2;

public class CountNames {
	public static void main( String args[] ) {

        int count = 0;

        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
            "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy", 
            "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };

        for (String name : names) {
            count += (name.toLowerCase().endsWith("jones"))? 1 : 0;
        }
        
        System.out.println(count);
	}
}

