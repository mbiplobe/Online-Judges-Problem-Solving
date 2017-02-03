import java.util.Vector;


public class vector {

	public static void main(String[] args) {
		int arr[]={3,2,6,4,5,1};
		Vector<Integer> Vec=new Vector<Integer>();
		Vec.addAll(Vec);
		
		Cal_LIS(Vec);
		
		
	}
	private static void Cal_LIS(Vector<Integer> E){
		Vector< Vector<Integer> >L=new Vector< Vector<Integer> >();
		
//		L.get(0).add(E.get(0));
		L.add(0, new Vector(E.get(0)));
		
		for(int i=1;i<E.size();i++){
			for(int j=0;j<i;j++){
				if((E.get(i)>E.get(j))&&(L.get(i).size()<L.get(j).size()+1)){
					L.add(i, L.get(j));
				}
			}
			
			L.add(i, new Vector(E.get(i)));
		
		}
		
		for(Object ob:L){
			System.out.println(L);
		}
	}
}
