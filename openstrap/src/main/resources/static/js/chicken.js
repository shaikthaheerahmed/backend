$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href=$(this).attr('href');

$.get(href,function(chicken,status){
$('#id').val(chicken.id)
$('#username').val(chicken.username)
$('#address').val(chicken.address)
$('#birthdaytime').val(chicken.birthdaytime)
$('#quantity').val(chicken.quantity)
$('#email').val(chicken.email)
$('#rate').val(chicken.rate)
$('#myfile').val(chicken.myfile)
 });
    $('#editModal').modal();
 });
 	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
 });