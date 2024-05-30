/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// learned: define variables for correct scope
// TODO: reduce time complexity

var twoSum = function (nums, target) {
  let output;
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        output = [i, j];
      }
    }
  }
  return output;
};
