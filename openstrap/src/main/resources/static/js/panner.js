$('document').ready(function(){

 $('table #editButton').on('click',function(event){
 event.preventDefault();
 var href=$(this).attr('href');

 $.get(href,function(panner,status){
 $('#id').val(panner.id)
 $('#address').val(panner.address)
 $('#email').val(panner.email)
 $('#password').val(panner.password)
 $('#phone').val(panner.phone)
 $('#rent').val(panner.rent)
 $('#salary').val(panner.salary)
 $('#username').val(panner.username)

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
 