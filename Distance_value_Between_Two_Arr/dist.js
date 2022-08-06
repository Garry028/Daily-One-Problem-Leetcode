// Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
// The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

var findTheDistanceValue = function (arr1, arr2, d) {
    let count = 0; 
    for (let i = 0; i < arr1.length; i++) {
        let passes = true;
        for (let j = 0; j < arr2.length; j++) {
            if (Math.abs(arr1[i] - arr2[j]) <= d) {
                passes = false;
            }
        }
        if (passes) {
            count++;
        }
    }
    return count;
};
