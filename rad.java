public class rad{
	public static void main (String[] args){
		double r=6378;
		double vol=4/3 * (Math.PI*Math.pow(r , 3));
		double volm=4/3 * (Math.PI*Math.pow((r*0.621371) , 3));
	    System.out.println("The volume of earth in cubic kilometers is" +vol+"and cubic miles is "+volm);


	}
}