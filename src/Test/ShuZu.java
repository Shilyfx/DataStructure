package Test;
/*
 * 		查找数组中指定元素第一次出现的索引值。
		int[] arr = {98,23,16,35,72};
		查找23在数组中的索引值。
 */
public class ShuZu {
	public static void main(String[] args) {
		System.out.println(getIndex(23));
	}
 
	private static int getIndex(int x) {
		int[] arr = {98,23,16,35,72};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;  //若数组中没有则返回-1
	}
}