package Test;
/*
 * 		����������ָ��Ԫ�ص�һ�γ��ֵ�����ֵ��
		int[] arr = {98,23,16,35,72};
		����23�������е�����ֵ��
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
		return -1;  //��������û���򷵻�-1
	}
}