package com.interview.utils.alight;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;            // Left pointer
        int right = height.length - 1;  // Right pointer
        int leftMax = 0;         // Maximum height encountered from the left
        int rightMax = 0;        // Maximum height encountered from the right
        int trappedWater = 0;    // Total trapped water

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        //int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4, 2, 0, 3, 2, 5};
        int trappedWater = solution.trap(height);
        System.out.println("Trapped water: " + trappedWater);
    }
}
