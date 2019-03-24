/*
 * ����һ���������� A��ֻ�����ǿ��Խ��仮��Ϊ��������ȵķǿղ���ʱ�ŷ��� true�����򷵻� false��
��ʽ�ϣ�������ǿ����ҳ����� i+1 < j ������ (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] 
	== A[j] + A[j-1] + ... + A[A.length - 1]) �Ϳ��Խ��������ȷ֡�
		
ʾ�� 1��
�����[0,2,1,-6,6,-7,9,1,2,0,1]
�����true
���ͣ�0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

ʾ�� 2��
���룺[0,2,1,-6,6,7,9,-1,2,0,1]
�����false

ʾ�� 3��
���룺[3,3,6,5,-2,2,5,1,-9,4]
�����true
���ͣ�3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
		*/
package lianxi0324;

public class test0324 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] A = new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
		boolean a = S.canThreePartsEqualSum(A);
		System.out.println(a);
	}
}

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        int count =0;
        int a = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
        }
        sum /= 3;
        for(int i = 0; i < A.length; i++){
            a += A[i];
            if(a == sum){
                count ++;
                a = 0;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
    }
}
