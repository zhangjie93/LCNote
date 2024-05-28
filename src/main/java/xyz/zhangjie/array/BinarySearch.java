package xyz.zhangjie.array;

public class BinarySearch {
    int binarySearch(int[]nums,int target){
        if(nums.length==0){//空数据
            return -1;
        }
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(right-left)/2+left;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }
        }
        return -1;
    }
}
