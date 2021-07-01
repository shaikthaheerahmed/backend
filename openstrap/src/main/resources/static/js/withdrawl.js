$('document').ready(function(){

 $('table #editButton').on('click',function(event){
 event.preventDefault();
 var href=$(this).attr('href');

 $.get(href,function(withdrawl,status){
 $('#username').val(withdrawl.username)
 $('#password').val(withdrawl.password)
 $('#email').val(withdrawl.email)
 $('#mobile').val(withdrawl.mobile)
 $('#address').val(withdrawl.address)

 
 });
   $('#editModal').modal();
 });
 });