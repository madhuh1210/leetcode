// Definition of a tree node (given by LeetCode)
/*
struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};
*/


// Helper function that builds a BST from nums[start..end]
struct TreeNode* buildBST(int* nums, int start, int end) {

    // BASE CASE:
    // If there are no elements in this range,
    // there is no tree to build, so return NULL
    if (start > end) {
        return NULL;
    }

    // Find the middle index of the current subarray
    // This ensures the tree remains height-balanced
    int mid = start + (end - start) / 2;

    // Allocate memory for a new tree node
    // malloc returns a pointer to the allocated memory
    struct TreeNode* root =
        (struct TreeNode*)malloc(sizeof(struct TreeNode));

    // Assign the middle element as the value of this node
    root->val = nums[mid];

    // Recursively build the LEFT subtree
    // using elements BEFORE the middle element
    root->left = buildBST(nums, start, mid - 1);

    // Recursively build the RIGHT subtree
    // using elements AFTER the middle element
    root->right = buildBST(nums, mid + 1, end);

    // Return the pointer to this root node
    return root;
}


// Main function required by LeetCode
// This is the entry point that LeetCode calls
struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {

    // Start building the BST using the FULL array
    // start index = 0
    // end index   = numsSize - 1
    return buildBST(nums, 0, numsSize - 1);
}
