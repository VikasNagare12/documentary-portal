
   $(document).ready(function(){
	   
	   
	 
	   $("#up").click(function(){

		     $("#loadFile").load("./updateTeacher1.vi");
		    });
	   
	   
	   
	   
	   
    $("#teacher").click(function(){

     $("#loadFile").load("./profile.vi");
    });
    
    $("#addConference").click(function(){

        $("#loadFile").load("./addConference.htm");
       });
    
    $("#showConference").click(function(){

        $("#loadFile").load("./showConference.htm");
       });

    $("#addJournal").click(function(){

        $("#loadFile").load("./addJournal.htm");
       });
    $("#showJournal").click(function(){

        $("#loadFile").load("./showJournal.htm");
       });
    $("#addBook").click(function(){

        $("#loadFile").load("./addBook.htm");
       });
    
    
    
   });
   
   
   

