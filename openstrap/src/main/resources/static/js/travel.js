$(document).ready(function(){
	$('#fileImage').change(function(){
		showImageThumbnail(this);
	});
});
function showImageThumbnail(fileInput){
file=fileInput.files[0];
reader=new FileReader();
reader.onload=function(e){
	$('#thumbnail').attr('src',e.target.result);
};
reader.readAsDataURL(file);
}
$('document').ready(function(){

 $('table #editButton').on('click',function(event){
 event.preventDefault();
 var href=$(this).attr('href');

 $.get(href,function(travel,status){
 $('#id').val(travel.id)
 $('#firstname').val(travel.firstname)
 $('#middlename').val(travel.middlename)
 $('#lastname').val(trvel.lastname)
 $('#address').val(travel.address)
 $('#email').val(travel.email)
 $('#source').val(travel.source)
 $('#destination').val(travel.destination)
$('#fileImage').val(travel.fileImage)
 
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
 
 $('.table #photoButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #employeePhoto').attr('src', href);
		$('#photoModal').modal();		
	});
	

	
		