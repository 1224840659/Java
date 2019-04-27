package 初级数组;
//求数组的容积的大小
public class Main {
	  int maxArea(int[] height) {
			int bidx,eidx,maxarea;
			bidx = 0;
			eidx = height.length-1;
			maxarea = 0;
			while(bidx<eidx){
				if(height[bidx]>=height[eidx]){
					maxarea = Math.max(maxarea,height[eidx]*(eidx - bidx));
					eidx--;
				}else{
					maxarea = Math.max(maxarea,height[bidx]*(eidx - bidx));
					bidx++;
				}
			}
			return maxarea;
	    }

	public static void main(String[] args) {
		int [] arr={1,8,6,2,5,4,8,3,7};
		Main ma=new Main();
		System.out.println(ma.maxArea(arr)); 

	}

}
