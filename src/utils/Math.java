package utils;

public class Math {
 public static int Xfactor(int x){
	 if(x <= 1){
		 return 1;
	 }
	 return x* Xfactor(x-1);
 }
 public static int XtractorLoop(int ban){
	 int a = 1;
	 for(int i=ban; i>0; i--){
		a*=i; 
	 }
	 return a;
 }
}
