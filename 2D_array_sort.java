public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String tempData = "4,abhi,shar,co,5,shre,par,guj,2,sap,bhat,JSR,3,joy,jana,ban,1,deep,kundu,KOL";
        String arr[] = new String[20];
        arr = tempData.split(",");
        
        System.out.println("length of raw data "+arr.length);
        int counter = 0;
        System.out.println("Un sorted array \n");
        String rawArr[][] = new String[5][4];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                rawArr[i][j] = arr[counter];
                counter++;
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(rawArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        // sorting started 
        String temp = "";
		for(int i = 0; i < 5-1; i++)
		{
			for(int j = 0; j < 5-1-i; j++)
			{
				if(Integer.parseInt(rawArr[j][0]) > Integer.parseInt(rawArr[j+1][0]))
				{
				    for(int k = 0; k < 4; k++){
                        temp = rawArr[j][k];
				    	rawArr[j][k] = rawArr[j+1][k];
				    	rawArr[j+1][k] = temp;				        
				    }
				}
			}
		}
		
		System.out.println("Sorted array is \n");
		for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(rawArr[i][j]+" ");
            }
            System.out.println();
        }
        
     }
}
