/*Program # 8
Array -  Find the count of Duplicate Numbers

*/
package basics;
public class DuplicatesCountofArray {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				
				int [] a = {1,7,2,2,4,3,5,4,11,13,11,11,4,4};
				boolean visted[]=new boolean[a.length];
				boolean dupflag;
				
				int count ;
				for( int i = 0 ; i <a.length ; i++) {
					if(visted[i] == true)
						continue;
						dupflag = false;
						count = 1;
						for( int j = i+1 ;j <a.length ; j++) {
								if(a[i]== a[j])
								{
									visted[j]=true;
									dupflag = true;
									count++;
									
								}
							}
							if(dupflag == true)
							{
								System.out.println("Count of "+a[i]+" is "+count);
							}
						
				}
		}
}