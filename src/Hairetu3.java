import java.util.Arrays;

public class Hairetu3 {

	public static void main(String[] args) {
		// int型の配列 nums に 8,5,9,2,4 を入れる
		// すべて表示
		// 合計値を表示 p.158
		// 5以上の個数を表示 p.159
		// すべての要素を２倍に書き換え・・普通のfor
		// 最大値を求める

		int[] nums = {8,5,9,2,4};

		Arrays.sort(nums);
		// 配列のすべてを10にする
		//Arrays.fill(nums, 10);
		
		// 表示
		for(int n : nums) {
			System.out.println(n);
		}
		// 合計
		int sum=0;
		for(int n:nums) {
			sum += n;
		}
		System.out.println(sum);
		// カウント
		int count=0;
		for(int n:nums) {
			if( n >= 5) {
				count++;
			}
		}
		System.out.println(count);
		// 二倍
		for(int i=0;i<nums.length;i++) {
			nums[i] *= 2;
		}
		// 最大値
		int max = nums[0];
		for(int n:nums) {
			max = Math.max( max, n);
		}
		System.out.println(max);






	}

}
