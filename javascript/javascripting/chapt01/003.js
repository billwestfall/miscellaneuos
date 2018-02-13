<script src="update.js" type="text/javascript">
function unsplat(fun) { return function() {
return fun.call(null, _.toArray(arguments)); };
}
var joinElements = unsplat(function(array) { return array.join(' ') });
joinElements(1, 2);
joinElements('-', '$', '/', '!', ':');
</script>
