function validateForm(myForm)
 {
 	alert("Done");

 	var errMsg = "";
     for(var i=0; i<myForm.elements.length; i++){

    	 if(myForm.elements[i].value==""){
    		 
    		 errMsg = errMsg + myForm.elements[i].placeholder+ "\n";
    		
    	 }
     }
   
      
     
     if(errMsg == ""){
     	myForm.submit();
     }else{
     	
     	alert("Please correct the Errors \n" + errMsg);
     	return false;
     }
 }