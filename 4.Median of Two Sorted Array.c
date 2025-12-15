double findMedianSortedArrays(int* nums1, int nums1Size,
                              int* nums2, int nums2Size) {

    // Total number of elements after merging both arrays
    int total = nums1Size + nums2Size;

    // Create an array to store the merged result
    int *res = (int*)malloc(sizeof(int) * total);

    // i → pointer for nums1
    // j → pointer for nums2
    // k → pointer for result array
    int i = 0, j = 0, k = 0;

    // 1️⃣ Merge both arrays while BOTH have elements
    // Compare current elements and insert the smaller one
    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] <= nums2[j]) {
            res[k++] = nums1[i++];
        } else {
            res[k++] = nums2[j++];
        }
    }

    // 2️⃣ Copy remaining elements from nums1 (if any)
    // This runs ONLY if nums2 finished first
    while (i < nums1Size) {
        res[k++] = nums1[i++];
    }

    // 3️⃣ Copy remaining elements from nums2 (if any)
    // This runs ONLY if nums1 finished first
    while (j < nums2Size) {
        res[k++] = nums2[j++];
    }

    // 4️⃣ Find the median from the merged array
    double median;

    // If total length is odd → middle element
    if (total % 2 == 1) {
        median = res[total / 2];
    }
    // If total length is even → average of two middle elements
    else {
        median = (res[total / 2 - 1] + res[total / 2]) / 2.0;
    }

    // Free dynamically allocated memory
    free(res);

    // Return the median value
    return median;
}
