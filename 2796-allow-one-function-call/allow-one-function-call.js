/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let isCalled=false;
    return function(...args){
        // let ans = 0;
        if(!isCalled){
            isCalled = true;
            return fn(...args);
        }else{
            undefined;
        }

        // for(let i=0;i<args.length;i++){
            // return fn(args);
        // }
        // return ans;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
