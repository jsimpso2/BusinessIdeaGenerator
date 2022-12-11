//this class is used to store data about various ideas
public  class IdeasDataBase {

    //this function will return a list of Business ideas to calling function
    //this function is static it means we can call this function by class name instead of creating class object
    public static BusinessIdea[] getIdeas()
    {

        //create an array of 16 size
        BusinessIdea businessIdea[]=new BusinessIdea[15];
        //fill the array with some business ideas

        businessIdea[0]=new BusinessIdea("Tutoring",3,"Offering these services to parents and getting referrals from teachers can make for an excellent education business, big or small.",true,200,true);
        businessIdea[1]=new BusinessIdea("Online School",5,"Not only does this allow for more students to attend school, but it’s also a good business.",true,300,true);
        businessIdea[2]=new BusinessIdea("Teaching languages",3,"it’s a profitable endeavor for your, your students, and other language professionals you may work with",true,100,true);
        businessIdea[3]=new BusinessIdea("Online Library",6,"Online library, one of the powerful education business platforms useful for both youngsters and adults to spend their free time fruitfully.",true,800,true);
        businessIdea[4]=new BusinessIdea("Fashion Design Institutes",8,"Both men and women have a huge love for fashion designing thus a profitable business",true,600,false);
        businessIdea[5]=new BusinessIdea(" Online Music School",9," By launching an online music school, you can easily turn your music expertise to an income flowing stream.",false,700,false);
        businessIdea[6]=new BusinessIdea("Photography Academy",4,"Photography academy, one of the perfect business ideas for driving income.",false,500,true);
        businessIdea[7]=new BusinessIdea("Real estate",10,"Renting and selling properties, a most profitable business",true,1200,false);
        businessIdea[8]=new BusinessIdea("T-shirt printing",7,"t-shirt printing can be a great e-commerce business",true,900,false);
        businessIdea[9]=new BusinessIdea("Dropshipping",8,"The minimal inventory and tools needed for dropshipping make it an especially great startup idea if you’re worried about overhead costs and physical space.",true,100,false);
        businessIdea[10]=new BusinessIdea("Blogging",8,"Blogging is one of the first business models to arise from the invention of the internet.",true,50,false);
        businessIdea[11]=new BusinessIdea("Freelancer",8,"Becoming a freelancer requires you to have a specialist skill that is in demand and monetizable.",true,0,true);
        businessIdea[12]=new BusinessIdea("Car Wash",7,"Car washing services are always in sought out.",true,600,false);
        businessIdea[13]=new BusinessIdea("Private Investigator",4,"Become Sherlock Holmes and solve crime for a living.",false,0,false);
        businessIdea[14]=new BusinessIdea("Used Car Business",9,"Owning even a small used car dealership entails much more than just putting some cars on a lot and waiting for customers to come along.",true,2000,false);


        return businessIdea;
    }

}
