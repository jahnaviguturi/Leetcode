/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let depth = 0;
    let maxDepth = 0;

    for(const ch of s) {
        if(ch == '(') {
            depth++;
            maxDepth = Math.max(maxDepth, depth);
        } else if(ch == ')') {
            depth--;
        }
    }

    return maxDepth;
};