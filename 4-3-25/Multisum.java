public class Multisum{
	public static void main(String[] args) {
		int a[][]={{2,4,6} ,{1,3,7}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++){
				 sum += a[i][j];
			}

           
        }


           System.out.println("the sum of the  2D array is:"+sum);
		
	}
}