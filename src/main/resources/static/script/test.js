// Generated by CoffeeScript 1.9.3
(function() {
  this.test = function() {
    var array, item, newArray;
    array = [1, 2, 3];
    newArray = (function() {
      var i, len, results;
      results = [];
      for (i = 0, len = array.length; i < len; i++) {
        item = array[i];
        results.push((function(item) {
          return item + 1;
        })(item));
      }
      return results;
    })();
    return alert(newArray);
  };

}).call(this);

//# sourceMappingURL=test.js.map
